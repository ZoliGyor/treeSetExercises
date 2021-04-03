import java.util.Iterator;
import java.util.TreeSet;

import jdk.nashorn.api.tree.Tree;

public class Exercises {
    private TreeSet<String> stringSet = new TreeSet<String>();
    private TreeSet<Integer> intSet = new TreeSet<Integer>();

    public void exercise1(TreeSet<String> stringSet, int number)
    {
        System.out.println("1st exercise: Write a Java program to create a new tree stringSet, add some colors (string) and print out the tree stringSet");
        if(number == 1){
            stringSet.add("Percy");
            stringSet.add("Vax");
            stringSet.add("Grog");
            stringSet.add("Scanlan");
        }else if(number == 2){
            stringSet.add("Keyleth");
            stringSet.add("Pike");
            stringSet.add("Vex");
        }
        intSet.add(5);
        intSet.add(7);
        intSet.add(6);
        intSet.add(9);
        intSet.add(1);
        intSet.add(4);
        
        System.out.println(stringSet);
        System.out.println();
    }

    public void exercise2(TreeSet<String> stringSet)
    {
        System.out.println("2nd exercise: Write a Java program to iterate through all elements in a tree stringSet");
        Iterator iterator = stringSet.iterator();
        while(iterator.hasNext()){
            Object element = iterator.next();
            System.out.println(element);
        }
        System.out.println();
    }

    public void exercise3(TreeSet<String> stringSet1, TreeSet<String> stringSet2)
    {
        System.out.println("3rd exercise: Write a Java program to add all the elements of a specified tree stringSet to another tree stringSet");
        stringSet1.addAll(stringSet2);
        System.out.println(stringSet1);
        System.out.println();
    }

    public void exercise4(TreeSet<String> stringSet)
    {
        System.out.println("4th exercise: Write a Java program to create a reverse order view of the elements contained in a given tree stringSet");
        System.out.println(stringSet.descendingSet());
        System.out.println();
    }

    public void exercise5(TreeSet<String> stringSet)
    {
        System.out.println("5th exercise: Write a Java program to get the first and last elements in a tree stringSet");
        System.out.println("The first elemenet of the stringSet is: " + stringSet.first());
        System.out.println("The last elemenet of the stringSet is: " + stringSet.last());
        System.out.println();
    }

    public void exercise6(TreeSet<String> stringSet1, TreeSet<String> stringSet2)
    {
        System.out.println("6th exercise: Write a Java program to clone a tree stringSet list to another tree stringSet");
        System.out.println("1st stringSet: " + stringSet1);
        System.out.println("2nd stringSet: " + stringSet2);
        stringSet2 = (TreeSet<String>) stringSet1.clone();
        System.out.println("2nd stringSet after cloning: " + stringSet2);
        System.out.println();
    }

    public void exercise7(TreeSet<String> stringSet)
    {
        System.out.println("7th exercise: Write a Java program to get the number of elements in a tree stringSet");
        System.out.println(stringSet);
        System.out.println("The size of the stringSet is: " + stringSet.size());
        System.out.println();
    }

    public void exercise8(TreeSet<String> stringSet1, TreeSet<String> stringSet2)
    {
        System.out.println("8th exercise: Write a Java program to compare two tree stringSets");
        System.out.println("The first stringSet: " + stringSet1);
        System.out.println("The second stringSet: " + stringSet2);
        boolean theyAreSame = true;
        if(stringSet1.size() != stringSet2.size() || !stringSet1.containsAll(stringSet2)){
            theyAreSame = false;
        }
        if(theyAreSame){
            System.out.println("The stringSets are the same");
        }else{
            System.out.println("The stringSets are not the same");
        }
        System.out.println();
    }

    public void exercise9(TreeSet<Integer> intSet)
    {
        System.out.println("9th exercise: Write a Java program to find the numbers less than 7 in a tree set");
        System.out.println(intSet);
        System.out.println(intSet.headSet(7));
        System.out.println();
    }

    public void exercise10(TreeSet<Integer> intSet, int element)
    {
        System.out.println("10th exercise: Write a Java program to get the element in a tree set which is greater than or equal to the given element");
        System.out.println(intSet);
        System.out.println(intSet.tailSet(element, true));
        System.out.println();
    }

    public void exercise11(TreeSet<Integer> intSet, int element)
    {
        System.out.println("11th exercise: Write a Java program to get the element in a tree set which is less than or equal to the given element");
        System.out.println(intSet);
        System.out.println(intSet.headSet(element, true));
        System.out.println();
    }

    public void exercise12(TreeSet<Integer> intSet, int element)
    {
        System.out.println("12th exercise: Write a Java program to get the element in a tree set which is strictly greater than or equal to the given element");
        System.out.println(intSet);
        System.out.println(intSet.higher(element));
        System.out.println();
    }

    public void exercise13(TreeSet<Integer> intSet, int element)
    {
        System.out.println("13th exercise: Write a Java program to get an element in a tree set which is strictly less than the given element");
        System.out.println(intSet);
        System.out.println(intSet.lower(element));
        System.out.println();
    }

    public void exercise14(TreeSet<Integer> intSet)
    {
        System.out.println("14th exercise: Write a Java program to retrieve and remove the first element of a tree set");
        System.out.println(intSet);
        System.out.println("The first element is: " + intSet.pollFirst());
        System.out.println("After removing the first element, the set looks like this: " + intSet);
        System.out.println();
    }

    public TreeSet<String> getStringSet()
    {
        return stringSet;
    }

    public TreeSet<Integer> getIntSet()
    {
        return intSet;
    }
}
