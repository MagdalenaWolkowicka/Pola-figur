package pl.edu.pg.figures;

import pl.edu.pg.interfaces.Checkable;
import pl.edu.pg.interfaces.Visible;

import java.util.Scanner;

public class Triangle implements Checkable, Visible {

    private double a;
    private double h;
    private double triangleArea;


    @Override
    public boolean checkParameters() {
        if (a > 0 && h > 0) {
            return true;
        }
        System.out.println("Błędne dane, spróbuj jeszcze raz.\n");
        return false;
    }

    @Override
    public void showAreaInfo() {
        questions();
        if (checkParameters()) {
            calculateTriangleArea();
            System.out.println("Pole trójkąta równa się " + triangleArea + " cm^2\n");
        }
    }

    private void questions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj długość podstawy trójkąta w cm");
        a = scanner.nextDouble();
        System.out.println("Podaj wysokość trójkąta w cm");
        h = scanner.nextDouble();
    }

    private void calculateTriangleArea() {
        triangleArea = (a * h) / 2;
    }
}
