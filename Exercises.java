import java.util.TreeSet;

public class Exercises {
    private TreeSet<String> set = new TreeSet<String>();

    public void exercise1(TreeSet<String> set)
    {
        System.out.println("1st exercise: Write a Java program to create a new tree set, add some colors (string) and print out the tree set");
        set.add("Percy");
        set.add("Vax");
        set.add("Grog");
        System.out.println(set);
        System.out.println();
    }

    public TreeSet<String> getSet()
    {
        return set;
    }
}
