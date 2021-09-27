package com.example.demo;

import java.util.Scanner;

/**
 * Application launch class
 */


public class DemoApplication {

    public static void main(String[] args) {
    MyCollection collection = new MyCollection();
    Scanner sc = new Scanner(System.in);
        System.out.println("1 - добавление\n" +
                "2 - удаление\n" +
                "3 - поиск элемента по значению\n" +
                "4 - поиск элемента по индексу\n" +
                "5 - поиск максимального элемента\n" +
                "6 - поиск минимального элемента\n" +
                "7 - поиск среднего арифметического всех элементов");
        while (true) {
        switch (sc.nextInt()) {
            case 1:
                System.out.print("Введите значение добавляемого элемента: ");
                collection.Add(sc.nextInt());
                System.out.println("Элемент добавлен");
                break;
            case 2:
                System.out.print("Введите индекс удаляемого элемента: ");
                collection.Remove(sc.nextInt());
                System.out.println("Элемент удален");
                break;
            case 3:
                System.out.print("Введите значение искомого элемента: ");
                if (collection.valueSearch(sc.nextInt()))
                    System.out.println("Элемент найден");
                else
                    System.out.println("Элемент не найден");
                break;
            case 4:
                System.out.print("Введите индекс искомого элемента: ");
                collection.indexSearch(sc.nextInt());
                break;
            case 5:
                System.out.println(collection.Maximum());
                break;
            case 6:
                System.out.println(collection.Minimum());
                break;
            case 7:
                System.out.println(collection.Average());
                break;
            default:
                System.out.println("Такой команды нет");
                break;
        }
    }


    }

}
