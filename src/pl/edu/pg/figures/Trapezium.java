package pl.edu.pg.figures;

import pl.edu.pg.interfaces.Checkable;
import pl.edu.pg.interfaces.Visible;

import java.util.Scanner;

public class Trapezium implements Checkable, Visible {

    private double a;
    private double b;
    private double h;
    private double trapeziumArea;

    @Override
    public boolean checkParameters() {
        if (a > 0 && b > 0 && h > 0) {
            return true;
        }
        System.out.println("Błędne dane, spróbuj jeszcze raz.\n");
        return false;
    }

    @Override
    public void showAreaInfo() {
        questions();
        if (checkParameters()) {
            calculateTrapeziumArea();
            System.out.println("Pole trapezu równa się " + trapeziumArea + " cm^2\n");
        }
    }

    private void questions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość podstawy 1 w cm");
        a = scanner.nextDouble();
        System.out.println("Podaj długość podstawy 2 w cm");
        b = scanner.nextDouble();
        System.out.println("Podaj wysokość trapezu w cm");
        h = scanner.nextDouble();
    }

    private void calculateTrapeziumArea() {
        trapeziumArea = ((a + b) * h) / 2;
    }
}
