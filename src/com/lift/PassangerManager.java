package com.lift;

import java.util.*;

public class PassangerManager {
    static Integer id = 0;

    public static Passanger CreatePassanger(int floorCount,int LiftCount,int FloorId) {
        id += 1;
        Random random = new Random();
        Integer destination = random.nextInt(floorCount);
        Double weight = 60.0 + 40.0 * random.nextDouble();
        Double size = 0.0 + 64000.0 * random.nextDouble();
        Integer startPosition = FloorId;
        return new Passanger(id, weight, size, startPosition, destination,random.nextInt(LiftCount));
    }
}
