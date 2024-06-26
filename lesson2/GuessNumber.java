package lesson2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessNumber {
    private final Player player1;
    private final Player player2;

    public GuessNumber(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    public void startGame() {
        Scanner scanner = new Scanner(System.in);
        int targetNumber = (int) (Math.random() * 100) + 1;

        System.out.println("Компьютер загадал число от 1 до 100. Попробуйте угадать его!");

        boolean guessed = false;
        while (!guessed) {
            guessed = takeTurn(player1, scanner, targetNumber);
            if (!guessed) {
                guessed = takeTurn(player2, scanner, targetNumber);
            }
        }
    }

    private boolean takeTurn(Player player, Scanner scanner, int targetNumber) {
        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.println(player.getName() + ", введите ваше число: ");
                int input = scanner.nextInt();
                if (input < 1 || input > 100) {
                    System.out.println("Пожалуйста, введите число в диапазоне от 1 до 100.");
                } else {
                    player.setNumber(input);
                    validInput = true;
                }
            } catch (InputMismatchException e) {
                System.out.println("Это не похоже на число. Попробуйте снова.");
                scanner.next(); // Очистка буфера сканера
            }
        }

        int guess = player.getNumber();

        if (guess == targetNumber) {
            System.out.println("Поздравляем, " + player.getName() + "! Вы угадали число!");
            return true;
        } else if (guess < targetNumber) {
            System.out.println("Число " + guess + " меньше того, что загадал компьютер.");
        } else {
            System.out.println("Число " + guess + " больше того, что загадал компьютер.");
        }
        return false;
    }
}
