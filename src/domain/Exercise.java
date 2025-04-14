package domain;

/**
 * Клас містить метод для перевірки, чи є задане число числом Армстронга.
 * Число Армстронга — це число, яке дорівнює сумі своїх цифр, піднесених до степеня, що дорівнює кількості цифр у числі.
 * Наприклад, 153 — число Армстронга, оскільки 1³ + 5³ + 3³ = 153
 */
public class Exercise {

    /**
     * Метод для перевірки, чи є число числом Армстронга.
     *
     * @param number Число для перевірки.
     * @return true, якщо число є числом Армстронга, інакше false.
     */
    public static boolean Calculate(int number) {
        int originalNumber = number;
        int sum = 0;
        int n = String.valueOf(number).length();

        while (number != 0) {
            int digit = number % 10;
            sum += Math.pow(digit, n);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
