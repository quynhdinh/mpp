# Lab 13
```java
List<Integer> ints = new ArrayList<>(); ints.add(1);
ints.add(2);
List<Number> nums = ints; nums.add(3.14);
```

a. The code doesn't work because `List<Number> nums = ints;` tries to assign a list of integers to a list of numbers, which is not allowed in Java's type system. Java generics are not covariant. To fix it, you can use a wildcard:
```java
List<Integer> ints = new ArrayList<>();
ints.add(1);
List<? super Integer> nums = ints;
nums.add(3);
nums.add(2);
nums.add(42);
````
b. Second fragment
```java
List<Integer> ints = new ArrayList<>(); ints.add(1);
ints.add(2);
List<? extends Number> nums = ints; nums.add(3.14);
```
The code also doesn't work because Java generics are not contravariant. You cannot add elements to a list that is defined with an upper bound wildcard (`? extends Number`). To fix it, you can use a lower bound wildcard:
```java
List<Integer> ints = new ArrayList<>();
ints.add(1);
ints.add(2);
List<? super Integer> nums = ints;
nums.add(3);
nums.add(2);
nums.add(42);
```
### problem 4
Given the code:
```java
public static double sum(Collection<? extends Number> nums) {
    double sum = 0.0;
    for (Number n : nums) {
        sum += n.doubleValue();
    }
    return sum;
}
```
a.
```java
List<Integer> ints = new ArrayList<>();
ints.add(1);
ints.add(2);
List<? extends Number> nums = ints;
nums.add(3.14);
```
This line will cause a compile-time error because in upper bound wildcards (`? extends Number`), you cannot add elements to the collection. The collection is read-only in terms of adding elements, but you can read from it.
b.
```java
List<Object> objs = new ArrayList<>(); 
objs.add(1);
objs.add("two");
List<? super Integer> ints = objs; ints.add(3);
double dbl = sum(ints);
```
This doesn't work because `sum` expects a collection of `Number` or its subclasses, but `ints` is defined as a collection of `Integer` or its superclasses. The `sum` method cannot accept a collection of `Object` because it does not guarantee that the elements are instances of `Number`. To fix it, you can change the type of `ints` to be a collection of `Number`:
```java