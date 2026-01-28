package Package1;

public class QuantityMeasurementApp {
    // Method to check equality of two feet measurements
    public boolean isEqual(double feet1, double feet2) {
        return Double.compare(feet1, feet2) == 0;
    }

    public static void main(String[] args) {
        QuantityMeasurementApp app = new QuantityMeasurementApp();
        double value1 = 5.0;
        double value2 = 9.0;
        if (app.isEqual(value1, value2)) {
            System.out.println("Both measurements are equal.");

        } else {
            System.out.println("Measurements are not equal.");
        }

    }
}
