package JavaforQA.HW02;//        Создать лист, наполнить его 10М (миллионами) элементов.
//        Выполнить различные варианты обхода данного листа :
//        При выполнении операций обхода, для нагрузки, внутри тела циклов
//        кладем i- тый элемент в переменную temp
//        (Пример :
//        for (int i : list) {
//        int temp = i;
//        })

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        List<Integer> integerList = new ArrayList<>();
        for (int i = 0; i < 10000000; i++) {
            integerList.add(i);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Time is  : " + (endTime - startTime));
//
//        перебрать for-each loop
        for (int i : integerList) {
            int temp = i;
            System.out.println(temp);
        }
//        classic for и вызываем внутри цикла list.size() для каждой итерации
        for (int i = 0; i < integerList.size(); i++) {
            int temp = integerList.get(i);
            System.out.println(temp);
        }
//        classic for, но list.size() определяем в переменную
        int size = integerList.size();
        for (int i = 0; i < size; i++) {
            int temp = integerList.get(i);
            System.out.println(temp);
        }

//        classic for, list.size() определяем в переменную, перебираем с конца (i--)
        int sizeReverse = integerList.size();
        for (int i = sizeReverse - 1; i >= 0; i--) {
            int temp = integerList.get(i);
            System.out.println(temp);
        }

//        используя Itertor
        Iterator<Integer> iterator = integerList.iterator();
        while (iterator.hasNext()) {
            int temp = iterator.next();
            System.out.println(temp);
        }
//        используя ListIterator
        ListIterator<Integer> listIterator = integerList.listIterator();
        while (listIterator.hasNext()) {
            int temp = listIterator.next();
            System.out.println(temp);
        }


    }
}

