package pl.edu.pg;

import pl.edu.pg.figures.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Areas {

    private boolean exitCalculator = false;

    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();
    Square square = new Square();
    Triangle triangle = new Triangle();
    Trapezium trapezium = new Trapezium();

    public void start() {
        System.out.println("Oblicz pole figury");
        System.out.println("------------------");
        Menu menu = new Menu();
        while (exitCalculator == false) {
            menu.showMenu();
            actionMenu();
        }
    }

    public void actionMenu() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nWybierz opcję: ");
        try {
            int option = scanner.nextInt();
            switch (option) {
                case 1:
                    circle.showAreaInfo();
                    break;
                case 2:
                    rectangle.showAreaInfo();
                    break;
                case 3:
                    square.showAreaInfo();
                    break;
                case 4:
                    triangle.showAreaInfo();
                    break;
                case 5:
                    trapezium.showAreaInfo();
                    break;
                case 0:
                    exitCalculator = true;
                    break;
                default:
                    System.out.println("Błędny wybór\n");
            }
        } catch (InputMismatchException e) {
            System.out.println("Błędny wybór\n");
        }
    }
}
