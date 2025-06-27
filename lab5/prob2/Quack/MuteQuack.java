package lab5.prob2.Quack;

public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        System.out.println("cannot quack");
    }
}
