package org.example.cracking.code.arrays;

public class GeeksForGeeksBasics {

    /**
     * Find the largest in an array and return it  
     * [1,2,4,66,2] -> 66
     * @param a
     * @return
     */
    public static int largestElement(int[] a) {
        int max = a[0];
        for (int i = 1; i < a.length; i++) {
            max = Math.max(max, a[i]);
        }
        return max;
    }

    /**
     * Find the Second largest in an array and return it 
     * [1,2,4,5] -> 4
     * @param a
     * @return
     */
    public static int secondLargestElement(int[] a) {
        int secondLargestElement = -1;
        int max = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > a[max]) {
                secondLargestElement = max;
                max = i;
            } else if (a[i] != a[max]) {
                if (secondLargestElement == -1 || a[i] > a[secondLargestElement]) {
                        secondLargestElement = i;
                }
            }
        }

        
        return a[secondLargestElement];
    }

    public static boolean isSorted(int[] a) {
        for (int i = 1; i < a.length; i++) {
            if (a[i] < a[i - 1]) {
                return false;
            }
        }
        return true;
    } 

    public static int[] reverseArray(int[] a) {
        int i = 0;
        int j = a.length - 1;
        while (i < j) {
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
            i++;
            j--;
        }
        return a;
    }

    /**
     * [10, 20, 20, 30, 40 ] -> [10, 20, 30, 40]
     * @param a
     * @return
     */
    public static int[] removeDuplicatesSorted(int[] a) {
      int k = 0;
      for (int i = 1; i < a.length; i++) {
          if (a[i] != a[k]) {
              k ++;
          } 
              int temp = a[i];
              a[i] = a[k];
              a[k] = temp;
          

      }
      return a;
    }

    /**
     * [1,2,0,4,5,6] -> [1,2,4,5,6]
     * @param a
     * @return
     */
    public static int[] moveZerosToEnd(int[] a) {
        int k = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != 0) {
                int temp = a[k];
                a[k] = a[i];
                a[i] = temp;
                k++;
            }
        }

        return a;
    }

    public static int[] leftRotateArrayByNPlaces(int[] a, int n) {
        int[] tempArr = new int[n];
        for (int i = 0; i < n ; i ++) {
            tempArr[i] = a[i]; 
        }
        for (int i = n; i < a.length; i++) {
            a[i - n] = a[i];
        }
        for (int i = 0; i < tempArr.length; i++) {
            a[a.length - n + i] = tempArr[i];
        }

        return a;
    }

    /**
     * Leader of an Arrays
     * if there is nothing on the right gt it the leader
     * @param args
     */
    public static void printLeaders(int[] a) {
        int leader = a[a.length - 1];
        System.out.print("Leader: " +leader);
        for (int i = a.length - 2; i >= 0; i--) {
            if (a[i] > leader) {
                leader = a[i];
                System.out.print("Leader: " +leader);
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(GeeksForGeeksBasics.largestElement(new int[]{1,10,2,3,4}));
        System.out.println(GeeksForGeeksBasics.largestElement(new int[]{1,-1,1,0}));
        System.out.println(GeeksForGeeksBasics.secondLargestElement(new int[]{1,1,1,0}));
        System.out.println(GeeksForGeeksBasics.secondLargestElement(new int[]{1,-1,-1,3}));
        System.out.println(GeeksForGeeksBasics.isSorted(new int[]{0,-1,-1,3}));
        System.out.println(GeeksForGeeksBasics.isSorted(new int[]{-1,-1,-1,3}));
        int[] b = GeeksForGeeksBasics.reverseArray(new int[]{1,3,4,4,5,6});
        for (int i : b) {
            System.out.print(" "+ i);
        }
        System.out.println();
        int[] d = GeeksForGeeksBasics.removeDuplicatesSorted(new int[]{1,3,4,4,5,5,6,6,6,7});
        for (int i : d) {
            System.out.print(" "+ i);
        }
System.out.println();
        int[] e = GeeksForGeeksBasics.moveZerosToEnd(new int[]{1,0,2,0});
        for (int i : e) {
            System.out.print(" "+ i);
        }
    System.out.println();
        int[] f = GeeksForGeeksBasics.leftRotateArrayByNPlaces(new int[]{1,0,2,0}, 2);
        for (int i : f) {
            System.out.print(" "+ i);
        }

        GeeksForGeeksBasics.printLeaders(new int[]{1,2,4,1,2});
    }
}

