package lesson03.labs.prob3;


public class Trailer extends Property {
	private static final double RENT = 500;

	public Trailer(Address address) {
		super(address);
		this.address = address;
	}
	
	@Override
	public double computeRent(){
		return RENT;
	}
	
	@Override
	public String toString() {
		return "Trailer";
	}
	
}
