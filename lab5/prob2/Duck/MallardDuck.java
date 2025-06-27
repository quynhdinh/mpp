package lab5.prob2.Duck;

import lab5.prob2.Fly.FlyWithWings;
import lab5.prob2.Quack.Squeak;

public class MallardDuck extends Duck {

    public MallardDuck(){
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        System.out.println("Mallard:");
    }

}
