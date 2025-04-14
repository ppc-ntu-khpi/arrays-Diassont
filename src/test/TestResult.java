package test;

import domain.Exercise;

public class TestResult {

    public static void main(String[] args) { 
        int number = 153; // Приклад числа для перевірки
        boolean isArmstrong = Exercise.Calculate(number);
        System.out.println("Число " + number + (isArmstrong ? " є" : " не є") + " числом Армстронга.");
    }
}
