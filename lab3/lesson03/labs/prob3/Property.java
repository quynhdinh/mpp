package lesson03.labs.prob3;

public abstract class Property {
	protected Address address;
    abstract double computeRent();
    Property(Address address){
        this.address = address;
    }
    public Address getAddress() {
        return address;
    }
}
