public class Main {
    public static void main(String[] args) {
        Exercises treeSet1 = new Exercises();
        Exercises treeSet2 = new Exercises();

        treeSet1.exercise1(treeSet1.getSet(), 1);
        treeSet2.exercise1(treeSet2.getSet(), 2);

        treeSet1.exercise2(treeSet1.getSet());
        treeSet1.exercise3(treeSet1.getSet(), treeSet2.getSet());
        treeSet1.exercise4(treeSet1.getSet());
    }
}
