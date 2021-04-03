import java.util.Iterator;
import java.util.TreeSet;

public class Exercises {
    private TreeSet<String> set = new TreeSet<String>();

    public void exercise1(TreeSet<String> set, int number)
    {
        System.out.println("1st exercise: Write a Java program to create a new tree set, add some colors (string) and print out the tree set");
        if(number == 1){
            set.add("Percy");
            set.add("Vax");
            set.add("Grog");
            set.add("Scanlan");
        }else if(number == 2){
            set.add("Keyleth");
            set.add("Pike");
            set.add("Vex");
        }
        
        System.out.println(set);
        System.out.println();
    }

    public void exercise2(TreeSet<String> set)
    {
        System.out.println("2nd exercise: Write a Java program to iterate through all elements in a tree set");
        Iterator iterator = set.iterator();
        while(iterator.hasNext()){
            Object element = iterator.next();
            System.out.println(element);
        }
        System.out.println();
    }

    public void exercise3(TreeSet<String> set1, TreeSet<String> set2)
    {
        System.out.println("3rd exercise: Write a Java program to add all the elements of a specified tree set to another tree set");
        set1.addAll(set2);
        System.out.println(set1);
        System.out.println();
    }

    public void exercise4(TreeSet<String> set)
    {
        System.out.println("4th exercise: Write a Java program to create a reverse order view of the elements contained in a given tree set");
        System.out.println(set.descendingSet());
        System.out.println();
    }

    public void exercise5(TreeSet<String> set)
    {
        System.out.println("5th exercise: Write a Java program to get the first and last elements in a tree set");
        System.out.println("The first elemenet of the set is: " + set.first());
        System.out.println("The last elemenet of the set is: " + set.last());
        System.out.println();
    }

    public void exercise6(TreeSet<String> set1, TreeSet<String> set2)
    {
        System.out.println("6th exercise: Write a Java program to clone a tree set list to another tree set");
        System.out.println("1st set: " + set1);
        System.out.println("2nd set: " + set2);
        set2 = (TreeSet<String>) set1.clone();
        System.out.println("2nd set after cloning: " + set2);
        System.out.println();
    }

    public void exercise7(TreeSet<String> set)
    {
        System.out.println("7th exercise: Write a Java program to get the number of elements in a tree set");
        System.out.println(set);
        System.out.println("The size of the set is: " + set.size());
        System.out.println();
    }

    public TreeSet<String> getSet()
    {
        return set;
    }
}
