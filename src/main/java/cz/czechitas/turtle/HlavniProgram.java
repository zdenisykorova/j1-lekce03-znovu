package cz.czechitas.turtle;

import dev.czechitas.java1.turtle.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

    public void nakresliTrojuhelnik(int delkaStranyA, int delkaStranyB, int delkaStranyC) {
        zofka.move(delkaStranyA);
        zofka.turnRight(90);
        zofka.move(delkaStranyB);
        zofka.turnRight(135);
        zofka.move(delkaStranyC);
    }

    public void start() {
        zofka = new Turtle();

        //TODO Tady bude kód pro kreslení želví grafiky.
        nakresliTrojuhelnik(40,50,60);
        nakresliTrojuhelnik(80, 100,130);
    }

}
