package lesson03.labs.prob1;

import java.util.Objects;

public class PersonWithJob {

	private Person person;
	private double salary;
	

	public PersonWithJob(Person person, double s) {
		this.person = person;
		salary = s;
	}
	
	public double getSalary() {
		return salary;
	}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof PersonWithJob)) return false;

        PersonWithJob other = (PersonWithJob) obj;
        return Objects.equals(this.person, other.person) &&
               Double.compare(this.salary, other.salary) == 0;
    }

	public static void main(String[] args) {
		Person p2 = new Person("Joe");
		PersonWithJob p1 = new PersonWithJob(p2, 3000.0);
		System.out.println("p1.equals(p2)? " + p1.equals(p2));
		System.out.println("p2.equals(p1)? " + p2.equals(p1));
	}

}
