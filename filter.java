package JSeminar_6;

import java.util.*;

public class filter {
    public static void main(String[] args) {

        laptop l1 = new laptop(1, 2, 128, "Windows 10", "Черный", "Acer");
        laptop l2 = new laptop(2, 4, 256, "Windows 11", "Белый", "Toshiba");
        laptop l3 = new laptop(3, 32, 512, "Windows 11", "Черный", "Samsung");
        laptop l4 = new laptop(4, 16, 256, "Windows 10", "Баклажан", "Acer");
        System.out.println(l1.toString());

        // Laptop l1 = new Laptop(1, 2, 128, "Windows 10", "Сиреневый");
        // Laptop l2 = new Laptop(2, 4, 256, "Windows 11", "Красный");
        // Laptop l3 = new Laptop(3, 32, 512, "Windows 10", "Серый");
        // Laptop l4 = new Laptop(4, 16, 256, "Windows 11", "Черный");

        System.out.println("Сортировать по :");
        System.out.println("1 - обьему ОЗУ");
        System.out.println("2 - обьему по SSD");
        System.out.println("3 - названию по OS");
        Scanner sc = new Scanner(System.in, "ibm866");
        Integer choice = sc.nextInt();
        if (choice == 1) {

            System.out.printf("Введите значение ОЗУ: ");
            Integer ram = sc.nextInt();
            if (ram >= 32) {
                System.out.printf(
                        l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
            } else if (ram < 32) {
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
            } else if (ram < 16) {
                System.out.printf(l1.toString() + "\n" + l2.toString());
            } else if (ram < 4) {
                System.out.printf(l1.toString());
            } else
                System.out.println("Таких ноутбуков нет!");

        } else if (choice == 2) {

            System.out.printf("Введите значение SSD: ");
            Integer ssd = sc.nextInt();
            if (ssd >= 512) {
                System.out.printf(
                        l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
            } else if (ssd < 512) {
                System.out.printf(l1.toString() + "\n" + l2.toString() + "\n" + l4.toString());
            } else if (ssd < 256) {
                System.out.printf(l1.toString() + "\n" + l2.toString());
            } else if (ssd < 128) {
                System.out.printf(l1.toString());
            } else
                System.out.println("Таких ноутбуков нет!");

        } else if (choice == 3) {

            System.out.println("Введите название OS");
            Scanner sc1 = new Scanner(System.in);
            String os = sc1.nextLine();
            if (os.equalsIgnoreCase("Windows")) {
                System.out.printf(
                        l1.toString() + "\n" + l2.toString() + "\n" + l4.toString() + "\n" + l3.toString() + "\n");
            } else if (os.equalsIgnoreCase("Windows 10")) {
                System.out.printf(l1.toString() + "\n" + l3.toString());
            } else if (os.equalsIgnoreCase("Windows 11")) {
                System.out.printf(l2.toString() + "\n" + l4.toString());
            } else
                System.out.println("Таких ноутбуков нет!");
            sc1.close();
        }

        sc.close();
    }
}
