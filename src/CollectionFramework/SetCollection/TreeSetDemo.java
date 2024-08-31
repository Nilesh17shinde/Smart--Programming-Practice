package CollectionFramework.SetCollection;

import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet treeSet=new TreeSet<>();
        treeSet.add("10");
        treeSet.add("40");
        treeSet.add("60");
        treeSet.add("30");
        treeSet.add("50");
        treeSet.add("70");
        treeSet.add("20");
        System.out.print(treeSet);



        /*TreeSet<Integer> treeSet = new TreeSet<>();

        // Add elements to the TreeSet
        treeSet.add(10);
        treeSet.add(50);
        treeSet.add(60);
        treeSet.add(90);
        treeSet.add(80);
        treeSet.add(40);

        // Print the TreeSet before sorting
        System.out.println("TreeSet before sorting: " + treeSet);

        // Create a new TreeSet with a custom comparator to sort the elements in descending order
        TreeSet<Integer> sortedSet = new TreeSet<>(Collections.reverseOrder());

        // Add elements from the original TreeSet to the sorted TreeSet
        sortedSet.addAll(treeSet);

        // Print the TreeSet after sorting
        System.out.println("TreeSet after sorting: " + sortedSet);
*/
    }
}
