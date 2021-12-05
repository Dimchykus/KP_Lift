package com.lift;

import com.lift.interfaces.iEntrance;

import java.util.*;
import java.util.concurrent.TimeUnit;

public class PassangerManager extends Thread {

    Entrance entrance;
    public boolean stop = false;
    public PassangerManager(Entrance entrance){
        this.entrance = entrance;
    }

    @Override
    public void run() {

        while (!stop) {

            int time_random = (int) ((Math.random() * (3 - 2)) + 2);

            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            int floorAmount = entrance.floorList.size();
            int floor = (int)Math.floor(Math.random() * (floorAmount - 1) + 0);
            int destinationFloor = (int)Math.floor(Math.random() * (floorAmount - 1) + 0);

            while (floor == destinationFloor) {
                floor = (int)Math.floor(Math.random() * (floorAmount - 1) + 0);
                destinationFloor = (int)Math.floor(Math.random() * (floorAmount - 1) + 0);
            }

            entrance.CreatePasseger(floor, destinationFloor);

            // CreatePasseger(Integer floor, Integer destinationFloor)

        }
    }
}
