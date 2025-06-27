package lab5.prob2.Duck;

import lab5.prob2.Fly.CannotFly;
import lab5.prob2.Quack.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck(){
        this.flyBehavior = new CannotFly();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        System.out.println("Decoy:");
    }
}
