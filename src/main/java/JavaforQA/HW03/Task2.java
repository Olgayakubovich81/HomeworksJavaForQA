package JavaforQA.HW03;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
//Взять две строки случайных символов ,длина каждой строки от 20 до 50 символов.
//        Вывести в консоль список символов которые встречаются только один раз на все две строки.
public class Task2 {
           public static void main(String[] args) {
            List<String> random = Arrays.asList(
                    "приветмиркакделавсепрекрасноихорошо",
                    "всездорововсехоршопростопрекрасно");

                       Task2 task = new Task2();
                       Set<Character> uniqueChars = task.getUniqueCharacters(random);
                       System.out.println("Символы, которые встречаются только один раз на обеих строках:");
                       System.out.println(uniqueChars);
                   }
                   public Set<Character> getUniqueCharacters(List<String> strings) {
                       Set<Character> uniqueChars = new HashSet<>();
                       Set<Character> doubleChars = new HashSet<>();

                       for (String str : strings) {
                           for (int i = 0; i < str.length(); i++) {
                               char ch = str.charAt(i);
                               if (uniqueChars.contains(ch)) {
                                   doubleChars.add(ch);
                               } else {
                                   uniqueChars.add(ch);
                               }
                           }
                       }

                       for (Character ch : doubleChars) {
                           uniqueChars.remove(ch);
                       }

                       return uniqueChars;
                   }
               }

