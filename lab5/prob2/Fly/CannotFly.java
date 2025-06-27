package lab5.prob2.Fly;

public class CannotFly implements FlyBehavior{
    @Override
    public void fly() {
        System.out.println("cannot fly");
    }
}