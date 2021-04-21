package pl.edu.pg.figures;

import pl.edu.pg.interfaces.Checkable;
import pl.edu.pg.interfaces.Visible;

import java.util.Scanner;

public class Circle implements Checkable, Visible {

    private double r;
    private double circleArea;
    private double circleAreaRounded;

    @Override
    public void showAreaInfo() {
        questions();
        if (checkParameters()) {
            calculateCircleArea();
            System.out.println("Pole koła równa się " + circleAreaRounded + " cm^2\n");
        }
    }

    @Override
    public boolean checkParameters() {
        if (r > 0) {
            return true;
        }
        System.out.println("Błędne dane, spróbuj jeszcze raz.\n");
        return false;
    }

    private void questions() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień koła w cm");
        r = scanner.nextDouble();
    }

    private void calculateCircleArea() {
        circleArea = Math.PI * Math.pow(r, 2);
        circleArea = Math.round(circleArea * 100);
        circleAreaRounded = circleArea / 100;
    }
}
