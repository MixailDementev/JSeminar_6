package JSeminar_6;

/**
 * Подумать над структурой класса Ноутбук для магазина техники - выделить поля и
 * методы. Реализовать в java.
 * Создать множество ноутбуков.
 * Написать метод, который будет запрашивать у пользователя критерий (или
 * критерии) фильтрации и выведет ноутбуки,
 * отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
 * “Введите цифру, соответствующую необходимому критерию:
 * 1 - ОЗУ
 * 2 - Объем HHD или SSD
 * 3 - Операционная система
 * 4 - Цвет …
 * Далее нужно запросить минимальные значения для указанных критериев -
 * сохранить параметры фильтрации можно также в Map.
 * Отфильтровать ноутбуки их первоначального множества и вывести проходящие по
 * условиям.
 */
public class laptop {
    int id;
    String brand;
    int ram;
    int ssd;
    String os;
    String color;

    public laptop(int id, int ram, int ssd, String os, String color, String brand) {
        this.id = id;
        this.ram = ram;
        this.ssd = ssd;
        this.os = os;
        this.color = color;
        this.brand = brand;
    }

    public String toString() {
        return String.format("id: %d,  ram: %d ГБ, ssd: %d ГБ, OS: %s, color: %s,brand: %s", id, ram, ssd, os, color,
                brand);
    }

    public boolean equals(Object o) {
        laptop t = (laptop) o;
        return id == t.id;
    }
}
