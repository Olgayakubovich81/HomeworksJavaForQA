package JavaforQA.HW01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//у вас есть список значений int и вы должны вернуть список, содержащий только нечетные числа
public class TaskThree {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 24, 39, -6, 109, 105, 657, 78795, 80, 102);
        System.out.println("Original list : " + integerList);
        List<Integer> result = getOddNumbersFromIntegerList(integerList);
        System.out.println("List with odd numbers : " + result);
    }


    public static List<Integer> getOddNumbersFromIntegerList(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for(int i = 0; i<list.size();i++) {

            if (list.get(i) % 2 != 0) {
                result.add(list.get(i));
            }
        }
        return result;

    }
}


