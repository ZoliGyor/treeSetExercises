public class Main {
    public static void main(String[] args) {
        Exercises treeSet1 = new Exercises();
        Exercises treeSet2 = new Exercises();

        treeSet1.exercise1(treeSet1.getStringSet(), 1);
        treeSet2.exercise1(treeSet2.getStringSet(), 2);

        treeSet1.exercise2(treeSet1.getStringSet());
        treeSet1.exercise3(treeSet1.getStringSet(), treeSet2.getStringSet());
        treeSet1.exercise4(treeSet1.getStringSet());
        treeSet1.exercise5(treeSet1.getStringSet());
        treeSet1.exercise6(treeSet1.getStringSet(), treeSet2.getStringSet());
        treeSet1.exercise7(treeSet1.getStringSet());
        treeSet1.exercise8(treeSet1.getStringSet(), treeSet2.getStringSet());
        treeSet1.exercise9(treeSet1.getIntSet());
        treeSet1.exercise10(treeSet1.getIntSet(), 5);
        treeSet1.exercise11(treeSet1.getIntSet(), 5);
        treeSet1.exercise12(treeSet1.getIntSet(), 5);
        treeSet1.exercise13(treeSet1.getIntSet(), 5);
    }
}
