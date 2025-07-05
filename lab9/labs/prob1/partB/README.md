The error occured because the `equals` method in the `Employee` class was not overridden correctly. When the `.contains` method was called on a list of `Employee` objects, it used the default `equals` method from the `Object` class, which checks for reference equality instead of value equality.
To fix this, the `equals` method in the `Employee` class should be overridden to compare the `name` and `salary` fields of the `Employee` objects. Here's the corrected `equals` method:
```java
@Override
public boolean equals(Object ob) {
    if (this == ob) return true;
    if (!(ob instanceof Employee)) return false;
    Employee e = (Employee) ob;
    return this.name.equals(e.name) && this.salary == e.salary;
}

This emphasizes the importance of the `Override` annotation, which helps ensure that the method is correctly overriding a method from the superclass. It also checks for reference equality first, which is a common optimization in `equals` implementations.