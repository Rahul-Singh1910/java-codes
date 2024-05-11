// Interface for calculating mean of numbers in an array
interface MeanInterface {
    double mean(double[] numbers);
}

// Interface extending MeanInterface to calculate deviation
interface DeviationInterface extends MeanInterface {
    double[] deviation(double[] numbers);
}

// Class implementing both interfaces
class Calculator implements DeviationInterface {
    @Override
    public double mean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

    @Override
    public double[] deviation(double[] numbers) {
        double meanValue = mean(numbers);
        double[] deviations = new double[numbers.length];

        for (int i = 0; i < numbers.length; i++) {
            deviations[i] = numbers[i] - meanValue;
        }
        return deviations;
    }
}

public class assign_8g {
    public static void main(String[] args) {
        double[] arr = { 2.5, 3.0, 4.5, 5.0, 6.0 };
        Calculator calculator = new Calculator();

        // Calculating mean
        double meanValue = calculator.mean(arr);
        System.out.println("Mean: " + meanValue);

        // Calculating deviation from mean
        double[] deviations = calculator.deviation(arr);
        System.out.println("Deviations from mean:");
        for (double deviation : deviations) {
            System.out.print(deviation + " ");
        }
    }
}
