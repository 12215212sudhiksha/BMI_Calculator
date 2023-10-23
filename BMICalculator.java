package bmicalculator;
import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your weight in Kilograms:");
        double weight = scanner.nextDouble();

        System.out.println("Enter your height in Meters:");
        double height = scanner.nextDouble();

        Person person = new Person(weight, height);
        double bmi = person.calculateBMI();

        System.out.println("Your BMI is: " + bmi);
        if (bmi < 18.5) {
            System.out.println("You are underweight.");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You have a normal weight.");
        } else if (bmi >= 25 && bmi < 30) {
            System.out.println("You are overweight.");
        } else if (bmi >= 30) {
            System.out.println("You are obese.");
        }

    }
}
