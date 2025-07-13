package lab11.startupCodeLab11Part2.prob11b;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaLibrary {
    
    // Predicate to filter employees with salary > 100000
    public static final Predicate<Employee> bigSalary = 
        employee -> employee.getSalary() > 100000;
    
    // Predicate to filter employees whose first name starts with a letter after 'M'
    public static final Predicate<Employee> validName = 
        employee -> employee.getFirstName().charAt(0) > 'M';
    
    // Function to get full name (first + last)
    public static final Function<Employee, String> fullName = 
        employee -> employee.getFirstName() + " " + employee.getLastName();
}
