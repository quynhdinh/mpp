package lesson03.labs.prob2;

import java.util.List;

public class LandlordInfo {

    private List<Building> buildings;

    public LandlordInfo(List<Building> buildings) {
        this.buildings = buildings;
    }

    public double calcProfits() {
        double totalProfit = 0;
        for (Building building : buildings) {
            totalProfit += building.calcTotalRent() - building.getMaintenanceCost();
        }
        return totalProfit;
    }

    public void addBuilding(Building b) {
        buildings.add(b);
    }

}