package lesson03.labs.prob2;

import java.util.List;

public class Building {
    private int buildingID;
    private List<Apartment> apartments;
    private int maintenanceCost;

    public Building(List<Apartment> apartments, int buildingID, int maintenanceCost) {
        this.apartments = apartments;
        this.buildingID = buildingID;
        this.maintenanceCost = maintenanceCost;
    }

    public int getMaintenanceCost() {
        return maintenanceCost;
    }

    public int getBuildingID() {
        return buildingID;
    }

    public double calcTotalRent() {
        double rent = 0;
        for (Apartment apartment : apartments) {
            rent += apartment.getRent();
        }
        return rent;
    }

    public void addApartment(Apartment a) {
        apartments.add(a);
    }
}
