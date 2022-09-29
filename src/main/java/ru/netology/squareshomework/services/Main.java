package ru.netology.squareshomework.services;

public class Main {
    public static void main(String[] args) {

        int x = 10;
        int minVolue = 100;
        int maxVolue = 400;


        SQRService service = new SQRService();
       int actual = service.calcSquare(minVolue, maxVolue);
        System.out.println(actual);
    }
}