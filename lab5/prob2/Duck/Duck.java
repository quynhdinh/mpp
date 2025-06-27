package lab5.prob2.Duck;

import lab5.prob2.Fly.FlyBehavior;
import lab5.prob2.Quack.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public abstract void display();

    public void swim(){
        System.out.println("swimming");
    }

    public void fly(){
        flyBehavior.fly();
    }
    public void quack(){
        quackBehavior.quack();
    }
}