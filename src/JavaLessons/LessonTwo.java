package JavaLessons;

import java.util.Scanner;

public class LessonTwo {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name? : ");
        String name = scanner.nextLine();

        System.out.print("How old are you?: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline character

        System.out.print("What is your gender?: ");
        String gender = scanner.nextLine();

        System.out.print("Where are you from?: ");
        String from = scanner.nextLine();

        System.out.print("Where do you live now?: ");
        String livenow = scanner.nextLine();

        System.out.print("Where do you work?: ");
        String workplace = scanner.nextLine();

        System.out.print("What is your job role?: ");
        String jobrole = scanner.nextLine();

        System.out.print("What is your salary?: ");
        float salary = scanner.nextFloat();
        scanner.nextLine(); // Consume the leftover newline character

        System.out.print("How much raise are you getting next year?: ");
        float increase = scanner.nextFloat();
        scanner.nextLine(); // Consume the leftover newline character

        float newsalary = salary + increase;

        System.out.println("My name is " + name + ". I am " + age + " years old, " + gender + 
                ". I work at " + workplace + " as a " + jobrole + ". I currently live in " + 
                livenow + ". I am originally from " + from + ". I make " + salary + 
                ". I will get " + increase + " as an annual raise, so my total salary will be " + 
                newsalary + " next year.");

        scanner.close();
    }
}