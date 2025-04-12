package chapter_1.lesson_1;

public class QuadraticEquation {
    public static void main(String[] args) {

        int a = 5;
        int b = -6;
        int c = 1;

        if (a == 0) {
            System.out.println("a = 0, No roots");
            System.exit(0);
        }

        int d = (b * b) - 4 * (a * c);

        if (d < 0) {
            System.out.println("D < 0, No roots");
            System.exit(0);
        } else if (d == 0) {
            System.out.println("Original equation: " + a + "x*x + " + b +"x + " + c + " = 0");
            double x1 = (-1 * b / (2 * a));
            System.out.println("D < 0, equation has one root, x = " + x1);

        } else if (d > 0) {
            System.out.println("Original equation: " + a + "x*x + " + b +"x + " + c + " = 0");
            double x1 = (-b + Math.sqrt(d)) / (2 * a);
            double x2 = (-b - Math.sqrt(d)) / (2 * a);
            System.out.println("D: " + d);
            System.out.println("root_1: " + x1);
            System.out.println("root_2: " + x2);
        }
    }
}