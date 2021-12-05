package com.lift;

import com.lift.enums.CommandType;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        GUI app = new GUI();
        app.setVisible(true);


        Building building = new Building(0, 5, 3);

        for (Entrance ent: building.entrances) {
            System.out.println(ent.lift.currentFloor.id);
            ent.start();
            new PassangerManager(ent).start();
            ent.join();
            System.out.println(ent.lift.currentFloor.id);
        }

    }
}
