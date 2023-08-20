package com.teachmeskills.lesson7.purt1.model;

public class Phone {
    private String number;
    private  String model;
    private int weight;

    public Phone() {
        this.number = "+375-29-153-13-41";
        this.model = "OnePlus 7pro";
        this.weight = 206;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(String number, String model, int weight) {
        this(number, model);
        this.weight = weight;
    }

    public void receiveCall(String name) {
        System.out.println("Calling " + name);
    }

    public void receiveCall(String name, String number) {
        this.number = number;
        System.out.println("Call from: " + name + "\nNumber:  " + number);
    }

    public static void sendMessage(String[] numbers) {
        for (String s : numbers) {
            System.out.println("\nRecipient:  " + s + "\nMassage: Hello to you form Alex");
        }
    }

    public void setNumber(String number) {
        this.number = number;
        System.out.println("Number: " + number);
    }
    public String getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", name='" + model + '\'' +
                ", weight= " + weight + "g" +
                '}';
    }
}
