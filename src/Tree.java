
import java.util.Random;
import java.util.TreeSet;

public class Tree {

    public static void main(String[] args) {
        TreeSet<Character> set1 = getRandomCharacterSet();
        TreeSet<Character> set2 = getRandomCharacterSet();
        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        TreeSet<Character> unionSet = findUnion(set1, set2);
        System.out.println("Union Set: " + unionSet);
        TreeSet<Character> commonSet = findCommonality(set1, set2);
        System.out.println("Common Set: " + commonSet);
    }


}
