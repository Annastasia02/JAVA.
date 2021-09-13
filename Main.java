package Введение_в_ООП;

import java.security.PublicKey;

public class Main {

    public static void main(String[] args) {
        Сотрудник[] сотрудникs = {
                new Сотрудник("Даниил", "Генеральный директор", "Dmal@puf.ru", "+001", 350_000, 60),
                new Сотрудник("Ульяна", "Директор по развитию", "Ykor@puf.ru", "002", 170_000, 44),
                new Сотрудник("Екатерина", "Начальник отдела персонала", "dm@primer,ru", "003", 80_000, 28),
                new Сотрудник("Елизавета", "Ведущий архитектор", "kv@primer,ru", "005", 180_000, 38),
        };
        printInfo(сотрудникs, 40);
    }
    static void printInfo(Сотрудник[] сотрудникs, int age) {
        for (int i = 0; i < сотрудникs.length; i++) {
            if (сотрудникs[i].getAge() > age) {
                сотрудникs[i].printInfo();
            }
        }
    }
}




