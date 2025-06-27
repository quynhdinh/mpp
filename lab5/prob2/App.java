package lab5.prob2;

import lab5.prob2.Duck.DecoyDuck;
import lab5.prob2.Duck.Duck;
import lab5.prob2.Duck.MallardDuck;
import lab5.prob2.Duck.RedheadDuck;
import lab5.prob2.Duck.RubberDuck;

public class App {
    public static void main(String[] args) {
        Duck[] ducks = { new MallardDuck(), new DecoyDuck(), new RubberDuck(), new RedheadDuck()};
        for (Duck duck : ducks) {
            duck.display();
            duck.fly();
            duck.quack();
            duck.swim();
        }
    }
}