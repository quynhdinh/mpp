The program incorrectly is because it is missing the `hashCode` method, which is necessary for the proper functioning of the equals method in Java. The `hashCode` method should return a hash code value for the object, which is used in hash-based collections like `HashMap` and `HashSet`.
Here is the sample code for the `hashCode` method:
```java
@Override
public int hashCode() {
    int result = 17;
    result = 31 * result + (name != null ? name.hashCode() : 0);
    result = 31 * result + salary;
    return result;
}