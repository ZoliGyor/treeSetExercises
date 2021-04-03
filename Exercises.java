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

    public TreeSet<String> getSet()
    {
        return set;
    }
}
