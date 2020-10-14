package ru.mirea.Yana.laba6;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> arrayList = new ArrayList<>(20);


        for (int i = 0; i < 5; i++){
            arrayList.add(new Student("Test" + i, (int)(Math.random() * 10 + 20)));
        }
        System.out.println("Неотсортированный список студентов: ");
        for (int i = 0; i < 5; i++){
            System.out.println(arrayList.get(i).getName() + " " + arrayList.get(i).getSumOrder());
        }

        QuickSort qs = new QuickSort();
        qs.quickSort(arrayList, 0, arrayList.size() - 1);

        System.out.println("Отсортированный список студентов: ");
        for (int i = 0; i < 5; i++){
            System.out.println(arrayList.get(i).getName() + " " + arrayList.get(i).getSumOrder());
        }
    }
}
