package JavaforQA.HW01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//у вас есть список значений int и вы должны вернуть список,
//        каждое значение которого умножается на 2.
//
//
public class Task0ne {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 7, 9, 3, 2, 5, 9);
        System.out.println("Original list : " + integerList);

        List<Integer> result = getMultiplicationBy2(integerList);
        System.out.println("Multiplication of elements : " + result);


    }
    private static List<Integer> getMultiplicationBy2(List<Integer> list) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(list.get(i) * 2);
        }

        return result;

    }



    }







