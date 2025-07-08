package lab11.startupCodeLab11Part2.prog12;

import java.util.Optional;

public class MySingletonLazy {
    private static MySingletonLazy instance;

    private MySingletonLazy() {
    }

    public static MySingletonLazy getInstance() {
        Optional<MySingletonLazy> opt = Optional.ofNullable(instance);
        return opt.orElse((instance = new MySingletonLazy()));
    }

    public static void main(String[] args) {
        MySingletonLazy instance = getInstance();
        MySingletonLazy instance2 = getInstance();
        if (instance == instance2) {
            System.out.println("correct");
        } else {
            System.out.println("incorrect");
        }
    }
}