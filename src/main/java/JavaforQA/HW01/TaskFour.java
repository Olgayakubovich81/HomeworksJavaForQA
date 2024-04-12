package JavaforQA.HW01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//у вас есть список значений String , и вы должны вернуть список этих значений
//        без каких-либо дубликатов.
public class TaskFour {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Hallo", "Happy", "World", "World");
        System.out.println("Original list : " + stringList);
        List<String> result = returnNoDuplicate(stringList);
        System.out.println("List with no Duplicates: " + result);

    }


    public static List<String> returnNoDuplicate(List<String> list) {
        List<String> result = new ArrayList<>();
        for (String element  : list) {
            if (!result.contains(element)) {
                result.add(element);
            }
        }
        return result;

    }
}









