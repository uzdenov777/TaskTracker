public class MonthData {

    int[] days = new int[30];

    void printDaysAndStepsFromMonth() {
        for (int i = 0; i < days.length; i++) {
            System.out.println((i + 1) + " день: " + days[i]);
        }
    }

    int sumStepsFromMonth() {
        int sumSteps = 0;
        for (int i = 0; i < days.length; i++) {
            sumSteps += days[i];
        }
        return sumSteps;
    }

    int maxSteps() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < days.length; i++) {
            if (days[i] >= max) {
                max = days[i];
            }
        }
        return max;
    }

    int bestSeries(int goalByStepsPerDay) {
        int goalsAchieved = 0;
        int seriesFinal = 0;

        for (int i = 0; i < days.length; i++) {
            if (days[i] >= goalByStepsPerDay) {
                goalsAchieved++;
            } else if (goalsAchieved >= seriesFinal) {
                seriesFinal = goalsAchieved;
            }
        }
        return seriesFinal;
    }

    int averageNumberSteps(){
        int averageNumber = 0;
        for (int i = 0; i < days.length; i++) {
            averageNumber += days[i];
        }
        return averageNumber/days.length;
    }


}
