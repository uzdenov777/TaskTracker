import java.util.Scanner;

public class StepTracker {

    MonthData[] monthToData = new MonthData[12];
    Scanner scanner;
    int goalByStepsPerDay = 10000;

    public StepTracker(Scanner scanner) {
        this.scanner = scanner;

        for (int i = 0; i < monthToData.length; i++) {
            monthToData[i] = new MonthData();
        }
    }

    void addNewNumberStepsPerDay() {
        System.out.println("Введите номер месяца от 1 до 12 включительно.");
        int month = scanner.nextInt();
        if (month < 1 || month > 12) {
            System.out.println("номер вводимого месяца должен быть от 1 до 12 включительно.");
            return;
        }
        System.out.println("Введите день от 1 до 30 (включительно).");
        int day = scanner.nextInt();
        if (day < 1 || day > 30) {
            System.out.println("номер вводимого дня должен быть от 1 до 30 включительно.");
            return;
        }
        System.out.println("Введите количество шагов.");
        int steps = scanner.nextInt();
        if (steps < 1 ) {
            System.out.println("количество шагов должно быть положительным числом.");
            return;
        }

        MonthData monthData = monthToData[month - 1];
        monthData.days[day - 1] = steps;
    }

    void changeStepGoal() {
        System.out.println("Введите новую цель шагов на день.");
        goalByStepsPerDay = scanner.nextInt();
        if (goalByStepsPerDay < 1) {
            System.out.println("Введите число больше 0!");
        }
    }

    void printStatistic() {
        Converter converter = new Converter();

        System.out.println("Введите номер месяца от 1 до 12 включительно.");
        int month = scanner.nextInt();

        MonthData monthData = monthToData[month - 1];
        System.out.println("Количество пройденных шагов по дням:");
        monthData.printDaysAndStepsFromMonth();
        System.out.println();
        System.out.println("Общее количество шагов за месяц: " + monthData.sumStepsFromMonth());
        System.out.println();
        System.out.println("Максимальное пройденное количество шагов в месяце: " + monthData.maxSteps());
        System.out.println();
        System.out.println("Среднее количество шагов: " + monthData.averageNumberSteps());
        System.out.println();
        System.out.println("Пройденная дистанция (в км): " + converter.convertToKm(monthData.sumStepsFromMonth()));
        System.out.println();
        System.out.println("Количество сожжённых килокалорий: " + converter.convertStepsToKilocalories(monthData.sumStepsFromMonth()));
        System.out.println();
        System.out.println("Лучшая серия дней с достигнутыми целями: "+monthData.bestSeries(goalByStepsPerDay));
        System.out.println();
        System.out.println();
        System.out.println();

    }
}
