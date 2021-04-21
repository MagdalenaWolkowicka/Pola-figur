package pl.edu.pg.figures;

import pl.edu.pg.interfaces.Checkable;
import pl.edu.pg.interfaces.Visible;

import java.util.Scanner;

public class Square implements Checkable, Visible {

    private double a;
    private double squareArea;

    @Override
    public boolean checkParameters() {
        if (a > 0) {
            return true;
        }
        System.out.println("Błędne dane, spróbuj jeszcze raz.\n");
        return false;
    }

    @Override
    public void showAreaInfo() {
        questions();
        if (checkParameters()) {
            calculateSquareArea();
            System.out.println("Pole kwadratu równa się " + squareArea + " cm^2\n");
        }
    }

    private void questions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość boku kwadratu w cm");
        a = scanner.nextDouble();
    }

    private void calculateSquareArea() {
        squareArea = Math.pow(a, 2);
    }
}
