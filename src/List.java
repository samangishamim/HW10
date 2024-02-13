
import java.util.ArrayList;
import java.util.Arrays;

public class List {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>(Arrays.asList(1, 3, 7, 4, 3, 6, 5, 8, 5, 5, 2, 9, 7, 3));

        ArrayList<Integer> list1 = deletePairs(list);

        System.out.println(list1);
    }

    public static ArrayList<Integer> deletePairs(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i += 2) {
            if (list.get(i) < list.get(i + 1)) {
                list.remove(i);
                list.remove(i);
                i = i - 2;
            }
        }
        return list;
    }
}
