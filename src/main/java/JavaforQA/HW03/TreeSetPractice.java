
//1 :Сгенерировать список из 500 целочисленных элементов
//        Достаточно создать объект Random random = new Random();
//        И в цикле добавлять случайное значение в список в виде int element = random.nextInt(10);
//        Имея данный список и знания полученный об интерфейсе Set ,
//        вывести в консоль:
///
//        1)отсортированный набор уникальных элементов
//        2)набор только уникальных элементов

package JavaforQA.HW03;

import java.util.TreeSet;
import java.util.*;

public class TreeSetPractice {
    public void printUniqueSets() {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 500; i++) {
            int element = random.nextInt(10);
            list.add(element);
        }

        //отсортированный
        Set<Integer> sortedUniqueSet = new TreeSet<>(list);
        System.out.println(sortedUniqueSet);

        // уникальный
        Set<Integer> uniqueSet = new HashSet<>(list);
        System.out.println(uniqueSet);
    }
}

