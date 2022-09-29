package ru.netology.squareshomework.services;

public class SQRService {

    public int calcSquare(int minVolue, int maxVolue) {
        int iteration_count = 0;

        for (int i = 10; i <= 99; i++) {
            if (i * i >= minVolue && i * i <= maxVolue) {
                iteration_count++;
            }
        }
        return (iteration_count);
    }
}



