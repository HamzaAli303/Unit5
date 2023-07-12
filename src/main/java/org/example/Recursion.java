package org.example;

public class Recursion {
    public static int recursiveSearch(String item, String[] items) {
        return searchHelper(item, items, 0);
    }

    private static int searchHelper(String item, String[] items, int index) {

        if (index >= items.length) {
            return -1;
        }

        if (items[index].equals(item)) {
            return index;
        }


        return searchHelper(item, items, index + 1);
    }

    public static void main(String[] args) {
        String[] arr = {"My", "am", "is", "Hamza"};
        System.out.println(recursiveSearch("My", arr));       // Output: 0
        System.out.println(recursiveSearch("I", arr)); // Output: -1
    }
}