package org.example;


import java.util.HashMap;
import java.util.Random;

/*реализовать Java приложение для демонстрации парадокса Монти Холла (Парадокс Монти Холла — Википедия)
 и наглядно убедиться в верности парадокса (запустить игру в цикле на 1000 и вывести итоговый счет).
Студенту необходимо:
Создать свой Java Maven/Gradle проект;
Реализовать прикладную задачу - приложение для демонстрации парадокса Монти Холла;
Можно добавить любые библиотеки которые считают необходимыми
Результаты должны быть сохранены в HashMap (шаг цикла -> результат)
Необходимо вывести статистику по результату - количество позитивных и
 негативных результатов, процент от общего количества шагов цикла.*/
public class Main {
    public static void main(String[] args) {
//        Main.args = args;
        HashMap<Integer, String> doors = new HashMap<>();
        doors.put(1, "Ааавтомобииль");
        doors.put(2, "Коза");
        doors.put(3, "Коза");
//        int initialChoice = new Random().nextInt(1, 4);
        // Убираем первый выбор
        // Проходим по map, открываем два оставшихся выбора
        // Если попалась коза, выбираем оставшиеся варианты
        // Либо оставляем тот же выбор, либо меняем
//        for (:
//             ) {
//
//        }
        double countKoza = 0;
        double countAuto = 0;

        System.out.println("Случайное выпадение :");
        for (int i = 0; i < 1000; i++) {
            int initialChoice = new Random().nextInt(1, 4);
            if (doors.get(initialChoice).equals("Коза")) {

                countKoza++;
            } else countAuto++;
        }
        System.out.println(countKoza / 10 + "% - процент выпадения Козы");
        System.out.println(countAuto / 10 + "% - процент выпадения автомобиля");
        System.out.println("____________________________");
        System.out.println("Парадокс Монти Холла :");
        double countKoza1 = 0;
        double countAuto1 = 0;
        for (int i = 0; i < 1000; i++) {
            int initialChoice = new Random().nextInt(1, 4);
            if (initialChoice == 1) {
                countKoza1++;
            } else if (initialChoice == 2) {
                countAuto1++;
            } else countAuto1++;
        }
        System.out.println(countKoza1 / 10 + "% - процент выпадения Козы");
        System.out.println(countAuto1 / 10 + "% - процент выпадения автомобиля");

    }
}
