package pl.edu.pg;

import java.util.ArrayList;

public class Menu {

    public enum Options {
        CIRCLE("1. Koło"),
        RECTANGLE("2. Prostokąt"),
        SQUARE("3. Kwadrat"),
        TRIANGLE("4. Trójkąt"),
        TRAPEZIUM("5. Trapez"),
        EXIT("0. Wyjście z programu");

        private String value;

        Options(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }

    Options[] options = Options.values();

    public void showMenu() {
        ArrayList<String> listMenu = new ArrayList<>();
        for (int i = 0; i < options.length; i++) {
            listMenu.add(options[i].getValue());
        }
        String optionsToChoose = String.join("\n", listMenu);
        System.out.println(optionsToChoose);
    }
}
