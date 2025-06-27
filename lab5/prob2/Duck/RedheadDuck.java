package lab5.prob2.Duck;

import lab5.prob2.Fly.FlyWithWings;
import lab5.prob2.Quack.Quack;

public class RedheadDuck extends Duck {
    public RedheadDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("Redhead:");
    }
    
}
