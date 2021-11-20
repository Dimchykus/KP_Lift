package com.lift;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class BuildingManager {
    public List<Building> buildings;
    public int countOfBuildings;
    public int countOfLisfts;
    public int countOfPeople;
    public int maxFloor;
    Random random = new Random();

    public BuildingManager(int maxFloor, int countOfBuildings, int countOfLisfts, int countOfPeople) {
        this.countOfBuildings = countOfBuildings;
        this.countOfLisfts = countOfLisfts;
        this.maxFloor = maxFloor;
    }

    public Building createBuilding(int floorCount, int liftCount) {
        var lifts = new ArrayList<Lift>();
        var floors = new ArrayList<Floor>();

        for (int i = 0; i < liftCount; i++) {
//            var lift = Li
        }

        for (int i = 0; i < floorCount; i++) {
//            var floor = FloorManager.CreateFloor(i, maxFloor, );
        }

        return null;
    }

    public void createBuildings() {
        int counter = countOfBuildings;
        var buildings = new ArrayList<Building>();
//        var lifts = new ArrayList<lift>();

        while(counter-- > 0) {
            var floors = new ArrayList<Floor>();
            Building building = null;
            int randMaxFloor = random.nextInt(maxFloor);
            int floorCounter = randMaxFloor;

            while(floorCounter-- > 0) {
                var passangers = new ArrayList<Passanger>();
                var floor = new Floor(counter - 1, passangers);
                floors.add(floor);
            }

//            building = new Building(counter, floors, lifts);
            buildings.add(building);
        }
    }
}
