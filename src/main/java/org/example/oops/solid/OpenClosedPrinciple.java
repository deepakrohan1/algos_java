package org.example.oops.solid;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * A class should be open for extension but closed for changes
 * OCP + Specification (Design Pattern)
 */
public class OpenClosedPrinciple {
    public static void main(String[] args) {
        Product apple = new Product("Apple", Color.GREEN, Size.SMALL);
        Product tree = new Product("Tree", Color.GREEN, Size.LARGE);
        Product house = new Product("House", Color.BLUE, Size.LARGE);
        List<Product> products = new ArrayList<Product>();
        products.add(apple);
        products.add(tree);
        products.add(house);
        BetterFilter bf = new BetterFilter();
        System.out.println("GREEN");
        bf.filter(products, new ColorSpecification(Color.GREEN))
                .forEach(p -> System.out.print(p + ", "));
        System.out.println("BLUE and LARGE");
        bf.filter(products, new AndSpecification (new ColorSpecification(Color.BLUE),
                new SizeSpecification(Size.LARGE)))
                .forEach(p -> System.out.println(p));
    }
}

enum Color {
    RED, GREEN, BLUE
}

enum Size {
    SMALL, MEDIUM, LARGE, EXTRA_LARGE;
}

class Product {
    public String name;
    public Color color;
    public Size size;

    public Product(String name, Color color, Size size) {
        this.name = name;
        this.color = color;
        this.size = size;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", color=" + color +
                ", size=" + size +
                '}';
    }
}

/**
 * Youre creating a filter class with multiple methods to filter by each
 * So if there are 3  paramters you write 6 methods to filter combinations
 */
class ProductFilter {
    public Stream<Product> filterByColor(List<Product> products, Color color) {
        return products.stream().filter(product -> product.color == color);
    }

    public Stream<Product> filterBySize(List<Product> products, Size size ) {
        return products.stream().filter(product -> product.size == size);
    }

    public Stream<Product> filterBySize(List<Product> products,
                                        Size size, Color color ) {
        return products.stream().filter(product -> product.size == size
                                        && product.color == color);
    }
}

interface Specification<T> {
    boolean isSatisfied(T value);
}

/**
 * A filter is created at no point of time you need to modify filter
 * logic. We could extend it by implementing interfaces
 * @param <T>
 */
interface Filter<T> {
    Stream<T> filter(List<T> items, Specification specification);
}

class ColorSpecification implements Specification<Product> {

    public Color color;

    public ColorSpecification(Color color) {
        this.color = color;
    }

    @Override
    public boolean isSatisfied(Product p) {
        return (p.color == color);
    }
}

/**
 * We have implemented the Filter interface to add better functionality
 */
class BetterFilter implements Filter<Product> {

    @Override
    public Stream<Product> filter(List<Product> items,
                                  Specification specification) {
        return items.stream().filter(p -> specification.isSatisfied(p));
    }
}

class SizeSpecification implements Specification<Product> {
    public Size size;

    public SizeSpecification(Size size) {
        this.size = size;
    }

    @Override
    public boolean isSatisfied(Product value) {
        return value.size == size;
    }
}

/**
 * Combinator to add more functions
 * @param <T>
 */
class AndSpecification<T> implements Specification<T> {

    private Specification<T> first, second;

    public AndSpecification(Specification<T> first, Specification<T> second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public boolean isSatisfied(T item) {
        return first.isSatisfied(item) && second.isSatisfied(item);
    }
}