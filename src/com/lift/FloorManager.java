package com.lift;

import java.util.*;

public class FloorManager {
    static Integer Id=0;
    static Floor CreateFloor(int passangerCount,int floorCount ,int liftCount){
        List<Passanger> passangerList = new ArrayList<>();
        for (int i = 0; i < passangerCount; i++) {
         passangerList.add(PassangerManager.CreatePassanger(floorCount,liftCount,Id));
        }
        Id+=1;
        return new Floor(Id,passangerList);
    }

    public List<Passanger> getListOfPassagers(Integer floorId){

    }

}
