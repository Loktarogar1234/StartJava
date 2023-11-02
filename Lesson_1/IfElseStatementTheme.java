package Lesson_1;

public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("\nЗадание 1. Вывод характеристик компьютера");
        int age = 21;
        double height = 1.8;
        boolean genderMan = true;

        if (!genderMan) {
            System.out.println("Вы женщина");
        } else {
            System.out.println("Вы мужчина");
        }

        if (age > 18) {
            System.out.println("Вы взрослый");
        } else {
            System.out.println("Ты ребенок");
        }

        if (height > 1.7) {
            System.out.println("Вы высокий");
        } else {
            System.out.println("Вы низкого роста");
        }

        char firstNameLetter = "Eugene".charAt(0);
        if (firstNameLetter == 'M') {
            System.out.println("Первая буква в вашем имени - M");
        } else if (firstNameLetter == 'I') {
            System.out.println("Первая буква в вашем имени - I");
        } else {
            System.out.println("M и I не являются первыми буквами в вашем имени Eugene");
        }

        System.out.println("\nЗадание 2. Поиск большего числа");
        //диапазон значений от 0 до 99
        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
        //для проверки на равенство. проверено, работает
        //int num1 = 5, num2 = 5;

        if (num1 > num2) {
            System.out.println(num1 + " больше, чем " + num2);
        } else if (num1 < num2) {
            System.out.println(num2 + " больше, чем " + num1);
        } else {
            System.out.println("оба числа равны (" + num1 + " = " + num2 + ")");
        }

        System.out.println("\nЗадание 3. Проверка числа");
        //диапазон значений от -100 до 100
        int num3 = (int) (Math.random() * 201 - 100);

        if (num3 == 0) {
            System.out.println("Число = " + num3);
        } else if (num3 % 2 == 0) {
            if (num3 > 0) {
                System.out.println("Число " + num3 + " положительное и чётное");
            } else {
                System.out.println("Число = " + num3 + " отрицательное и чётное");
            }
        } else {
            if (num3 > 0) {
                System.out.println("Число " + num3 + " положительное и нечётное");
            } else {
                System.out.println("Число " + num3 + " отрицательное и нечётное");
            }
        }

        System.out.println("\nЗадание 4. Поиск одинаковых цифр в числах");
        //диапазон значений от 100 до 999
        int num4 = (int) (Math.random() * 900 + 100); //123;
        int num5 = (int) (Math.random() * 900 + 100); //223;
        boolean matching = false;

        if (num4 != num5) {
//Через массив получилось реализовать все условия, иначе не смог придумать как, точнее получается очень сложно
            int[] digitsFirstNumber = {num4 % 10, (num4 / 10) % 10, num4 / 100};
            int[] digitsSecondNumber = {num5 % 10, (num5 / 10) % 10, num5 / 100};

            for (int i = 0; i < 3; i++) {
                if (digitsFirstNumber[i] == digitsSecondNumber[i]) {
                    matching = true;
                    System.out.println("Одинаковая цифра = " + digitsFirstNumber[i] + " в разряде " + i);
                }
            }
            if (matching) {
                System.out.println("Исходные числа = " + num4 + " " + num5);
            } else {
                System.out.println("Равных цифр в разрядах нет");
            }
        } else {
            System.out.println(num4 + " = " + num5);
            System.out.println("Числа равны");
        }

        System.out.println("\nЗадание 5. Определение символа по его коду");
        char someSymbol = '\u0057';

        if (someSymbol >= 'a' && someSymbol <= 'z') {
            System.out.println(someSymbol + " - маленькая буква");
        } else if (someSymbol >= 'A' && someSymbol <= 'Z') {
            System.out.println(someSymbol + " - большая буква");
        } else if (someSymbol >= '0' && someSymbol <= '9') {
            System.out.println(someSymbol + " - цифра");
        } else {
            System.out.println("не буква и не цифра, а что-то иное...");
        }

        System.out.println("\nЗадание 6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 301000; //депо - устоявшийся международный разговорный трейдерский термин, whatever
        int depositsitInterests = deposit / 100 * 5;

        if (deposit > 100000 | deposit < 300000) {
            depositsitInterests = deposit / 100 * 7;
        } else {
            depositsitInterests = deposit / 100 * 10;
        }
        int total = deposit + depositsitInterests;
        System.out.println("Ваш депозит " + deposit + " руб., начислено % " + depositsitInterests +
                ". Итого капитализация " + total + " руб.");
        //8 пробелов относительно первой строки в файле или предыдущей строки, которую переносим??? непонятно написано

        System.out.println("\nЗадание 7. Определение оценки по предметам");
        double history = 59;
        double programming = 92;

        int historyGrade = getGrade(history);
        int programmingGrade = getGrade(programming);

        System.out.println("история " + historyGrade);
        System.out.println("программирование " + programmingGrade);

        double averageScore = (historyGrade + programmingGrade) / 2.0;
        System.out.println("средний балл оценок по предметам " + averageScore);

        double averagePercentage = (history + programming) / 2.0;
        System.out.println("Средний процент по предметам " + averagePercentage + "%");

        System.out.println("\nЗадание 8. Расчет годовой прибыли");
        int monthlySales = 19000;
        int monthlyRent = 50000;
        int monthlyProductionCost = 9000;
        int ebitda = (monthlySales - monthlyRent - monthlyProductionCost) * 12;

        if (ebitda > 0) {
            System.out.println("EBITDA равна + " + ebitda + " рублей");
        } else {
            System.out.println("EBITDA равна " + ebitda + " рублей");
        }
    }

    private static int getGrade(double percent) {
        if (percent <= 60) {
            return 2;
        } else if (percent <= 73) {
            return 3;
        } else if (percent <= 91) {
            return 4;
        }
        return 5;
    }
}