
import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 3, 7, 4, 3, 6, 5, 8, 5, 5, 2, 9, 7, 3));

        ArrayList<Integer> list1 = deletePairs(list);

        System.out.println(list1);
    }


}
