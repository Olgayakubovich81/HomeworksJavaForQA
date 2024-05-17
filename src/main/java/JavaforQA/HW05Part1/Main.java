package JavaforQA.HW05Part1;

import java.util.Stack;

public class Main {
            public static void main(String[] args) {
                Deck deck = new Deck();
                Stack<Card> stack = new Stack<>();

                // Заполняем стек картами из колоды
                for (Card card : deck.getCards()) {
                    // Если стек не пуст и у карты с вершины стека такой же цвет, как у текущей карты,
                    // то пропускаем текущую карту
                    if (!stack.isEmpty() && stack.peek().getColor() == card.getColor()) {
                        continue;
                    }
                    stack.push(card); // Добавляем текущую карту в стек
                }

                // Выводим содержимое стека
                while (!stack.isEmpty()) {
                    System.out.println(stack.pop());
                }
            }
        }








