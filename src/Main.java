import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        StepTracker stepTracker = new StepTracker(sc);

        while (true) {
            printMenu();

            int command = sc.nextInt();

            if (command == 1) {
                stepTracker.addNewNumberStepsPerDay();
            } else if (command == 2) {
                stepTracker.changeStepGoal();
            } else if (command == 3) {
                stepTracker.printStatistic();
            } else if (command == 0) {
                System.out.println("Goodbye!");
                break;
            } else {
                System.out.println("Нет такой команды");
            }
        }
    }

    static void printMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1: Ввести количество шагов за определённый день");
        System.out.println("2: Изменить цель по количеству шагов в день");
        System.out.println("3: Напечатать статистику за определённый месяц");
        System.out.println("0: Выйти из приложения");

    }
}
