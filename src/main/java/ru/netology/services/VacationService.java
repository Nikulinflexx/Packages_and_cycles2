package ru.netology.services;

public class VacationService {

    public int calculateMonthsOfRest(int income, int expenses, int threshold) {
        int monthsOfRest = 0;
        int balance = 0;

        for (int month = 0; month <12; month++) {
            if (balance >= threshold) {

                balance -= expenses;
                balance /= 3;
                monthsOfRest++;
            } else {

                balance += income - expenses;
            }
        }

        return monthsOfRest;
    }
}
