//package org.example.oops.solid;
//
//import java.util.List;
//
///**
// * A. High Level Modules should not depend on low-level modules
// * Both should depend on abstractions
// *
// * B. Abstractions should not depend on details
// * Details should depend on abstractions
// */
//public class DependencyInversion {
//}
//
//enum Relationship {
//    PARENT, CHILD, SIBLING
//}
//
//class Person {
//    String name;
//
//    public Person(String name) {
//        this.name = name;
//    }
//}
//
//class Relationships {
//    private List<Triplet<Person, Relationship, Person>> relations
//            = new ArrayList<Triplet<Person, Relationship, Person>>();
//
//    public List<Triplet<Person, Relationship, Person>> getRelations() {
//        return relations;
//    }
//
//    public void addParentAndChild(Person parent, Person child) {
//        relations.add(new Triplet<> (parent, Relationship.PARENT, child));
//        relations.add(new Triplet<> (child, Relationship.CHILD, parent));
//    }
//}
//
//interface RelationshipBrowser {
//    List<Person> findAllChildren(String name);
//}
//
//class RelationShipUpdate implements RelationshipBrowser {
//
//    @Override
//    public List<Person> findAllChildren(String name) {
//        return null;
//    }
//}
//
///**
// * This is dependent on actual Relationship object we need to make sure
// * it depends on abstractions
// */
//class Research {
//    private Relationship relationship;
//    public Research(Relationship relationship) {
//        this.relationship = relationship;
//    }
//
//    List<Triplet<Person, Relationship, Person>> relations =
//            relationship.getRelations();
//}
//
//class ResearchUpdated{
//    private RelationshipBrowser relationship;
//
//    public ResearchUpdated(RelationshipBrowser relationship) {
//        this.relationship = relationship;
//    }
//
//    List<Person> persons = relationship.findAllChildren("John");
//}