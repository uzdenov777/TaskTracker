public class Converter {

    int convertToKm(int steps) {

        return (int) (75 * steps) / 100000;
    }

    int convertStepsToKilocalories(int steps) {

        return (int) (50 * steps) / 1000;
    }
}
