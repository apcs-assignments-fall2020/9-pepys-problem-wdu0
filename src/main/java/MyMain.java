public class MyMain {

    // Calculate the probability of rolling at least one 6 when rolling 
    // six dice. Uses 10000 trials.
    // Returns in the answer as a double corresponding to the percentage
    // For example, 75.5% would be 75.5
    public static double probabilityOneSix() {
        int times = 10000;
        int total = 0;
        int numofsix;

        for (int i = 0; i < times; i++) {
            numofsix = 0;
            for (int d = 0; d < 6; d++) {
                double randouble = Math.random() * 6 + 1;
                int ran = (int) randouble;
                if (ran == 6) {
                    numofsix ++;
                }
            }
            if (numofsix >= 1) {
                total ++;
            }
        }
        double percent = (double) total / (double) times;
        double result = percent * 100;
        return result;
    }

    // Calculate the probability of rolling at least two 6's when rolling 
    // twelve dice. Uses 10000 trials.
    public static double probabilityTwoSixes() {
        int times = 10000;
        int total = 0;
        int numofsix;

        for (int i = 0; i < times; i++) {
            numofsix = 0;
            for (int d = 0; d < 12; d++) {
                double randouble = Math.random() * 6 + 1;
                int ran = (int) randouble;
                if (ran == 6) {
                    numofsix ++;
                }
            }
            if (numofsix >= 2) {
                total ++;
            }
        }
        double percent = (double) total / (double) times;
        double result = percent * 100;
        return result;
    }

    // Calculate the probability of rolling at least three 6's when rolling 
    // eighteen dice. Uses 10000 trials.
    public static double probabilityThreeSixes() {
        int times = 10000;
        int total = 0;
        int numofsix;

        for (int i = 0; i < times; i++) {
            numofsix = 0;
            for (int d = 0; d < 18; d++) {
                double randouble = Math.random() * 6 + 1;
                int ran = (int) randouble;
                if (ran == 6) {
                    numofsix ++;
                }
            }
            if (numofsix >= 3) {
                total ++;
            }
        }
        double percent = (double) total / (double) times;
        double result = percent * 100;
        return result;
    }


    public static void main(String[] args) {
        System.out.println("The % of probability of rolling at least one 6 when rolling 6 dice is " + probabilityOneSix());
        System.out.println("The % of probability of rolling at least two 6 when rolling 12 dice is " + probabilityTwoSixes());
        System.out.println("The % of probability of rolling at least three 6 when rolling 18 dice is " + probabilityThreeSixes());
    }
}
