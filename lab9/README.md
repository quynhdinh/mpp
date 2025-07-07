# Lab 9
prob1, partE:

`ArrayList` extends `AbstractList`, and implements `List`, `RandomAccess`, `Cloneable`, and `Serializable` and also indirectly implements `Iterable` and `Collection`.

###  When the type D is a class:
In Java 8, classes simply cannot inherit from multiple classes, so the Diamond Problem does not arise in this case.
###  When the type D is an interface:
In Java 8, interfaces can have default methods, which allows them to provide a default implementation for methods. If D is an interface that extends two other interfaces (A and B), and both A and B have default methods with the same signature, D must provide an implementation for that method to resolve the ambiguity. This is done by overriding the method in D, like this:
```java
interface B {
    default void method() {
        System.out.println("Default method from A");
    }
}
interface C {
    default void method() {
        System.out.println("Default method from B");
    }
}
interface D extends A, B {
    @Override
    default void method() {     
    }
}