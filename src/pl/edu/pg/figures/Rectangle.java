package pl.edu.pg.figures;

import pl.edu.pg.interfaces.Checkable;
import pl.edu.pg.interfaces.Visible;

import java.util.Scanner;

public class Rectangle implements Checkable, Visible {

    private double a;
    private double b;
    private double rectangleArea;

    @Override
    public boolean checkParameters() {
        if (a > 0 && b > 0) {
            return true;
        }
        System.out.println("Błędne dane, spróbuj jeszcze raz.\n");
        return false;
    }

    @Override
    public void showAreaInfo() {
        questions();
        if (checkParameters()) {
            calculateRectangleArea();
            System.out.println("Pole prostokąta równa się " + rectangleArea + " cm^2\n");
        }
    }

    private void questions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość jednego boku w cm");
        a = scanner.nextDouble();
        System.out.println("Podaj długość drugiego boku w cm");
        b = scanner.nextDouble();
    }

    private void calculateRectangleArea() {
        rectangleArea = a * b;
    }
}
