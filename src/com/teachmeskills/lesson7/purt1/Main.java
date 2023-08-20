package com.teachmeskills.lesson7.purt1;

import com.teachmeskills.lesson7.purt1.model.Number;
import com.teachmeskills.lesson7.purt1.model.Phone;

/**
 * 1. Класс Phone.
 * Создайте класс Phone, который содержит переменные number, model и
 * weight.
 * Создайте три экземпляра этого класса.
 * Выведите на консоль значения их переменных. (используйте метод toString).
 * Добавить в класс Phone методы: receiveCall, имеет один параметр – имя
 * звонящего.
 * Этот метод выводит на консоль сообщение “Звонит {name}”.
 * Добавить метод getNumber – возвращает номер телефона.
 * Вызвать эти методы для каждого из объектов.
 * Добавить конструктор в класс Phone, который принимает на вход три
 * параметра для инициализации переменных класса - number, model и
 * weight.
 * Добавить конструктор, который принимает на вход два параметра для
 * инициализации переменных класса - number, model.
 * Добавить конструктор без параметров.
 * Вызвать из конструктора с тремя параметрами конструктор с двумя.
 * Добавьте перегруженный метод receiveCall, который принимает два
 * параметра - имя звонящего и номер телефона звонящего. Вызвать этот
 * метод.
 * Создать метод sendMessage.
 * Данный метод принимает на вход номера телефонов, которым будет отправлено
 * сообщение. Метод выводит на консоль номера этих телефонов.
 */

public class Main {
    public static void main(String[] args) {
        Phone phone1 = new Phone("+375-29-123-45-67", "Pixel 7");
        Phone phone2 = new Phone("+375-29-134-89-61", "Pixel 4a", 143);
        Phone phone3 = new Phone();

        System.out.println(phone1);
        System.out.println(phone2);
        System.out.println(phone3);
        System.out.println();
        phone1.receiveCall("Alex");
        phone2.receiveCall("Ivan", Number.number2);
        phone3.receiveCall("Hasbik");
        System.out.println();
        phone1.setNumber(phone1.getNumber());
        phone2.setNumber(phone2.getNumber());
        phone3.setNumber(phone3.getNumber());
        Phone.sendMessage(new String[]{Number.number1, Number.number2, Number.number3});
    }
}
