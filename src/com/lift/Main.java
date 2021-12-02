package com.lift;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        GUI app = new GUI();
        app.setVisible(true);

        List<Floor> floorList = new ArrayList<>();
        floorList.add(new Floor(0, 0));
        floorList.add(new Floor(1, 0));
        floorList.add(new Floor(2, 0));
        floorList.add(new Floor(3, 0));
        floorList.add(new Floor(4, 0));

        List<Passanger> passangerList = new ArrayList<>();
        passangerList.add(new Passanger(0, 2.0, 2.0, 2, 4, 1));



        floorList.add(new Floor(0, 1, passangerList));
        floorList.add(new Floor(1, 1));
        floorList.add(new Floor(2, 1));
        floorList.add(new Floor(3, 1));
        floorList.add(new Floor(4, 1));

        List<Integer> pick = new ArrayList<>();
        pick.add(0);
        List<Integer> leave = new ArrayList<>();
        List<Command> commandList = new ArrayList<>();
        commandList.add(new Command( floorList.get(2), floorList.get(4), pick, leave));

        List<Lift> liftList = new ArrayList<>();
        liftList.add(new Lift(0, 1000.0, 5, floorList.get(0), commandList));
        liftList.add(new Lift(1, 1000.0, 5,  floorList.get(0), commandList));

        Building building = new Building(0, floorList, liftList);

        for (Lift lift: building.lifts
             ) {
            lift.Move();
        }

    }
}
