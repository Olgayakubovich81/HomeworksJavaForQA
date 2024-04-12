
//у вас есть список значений String ,
//        и вы должны вернуть список длины каждого из этих значений String .


package JavaforQA.HW01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


//
public class TaskTwo {
    public static void main(String[] args) {

        List<String> stringList = Arrays.asList("Hallo", "Happy", "World");
        System.out.println("Original list : " + stringList);

        List <String> result= getLengthOfEachStringValue(stringList);
        System.out.println("List of the length of each String : " + result);
    }

     private static List<String> getLengthOfEachStringValue(List<String> list) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            result.add(Integer.toString(list.get(i).length()));
        }

        return result;


    }


}











