package com.lift;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private Integer id;
    public List<Entrance> entrances = new ArrayList<>();

    public Building(Integer id, Integer floorCount, Integer entranceCount) {
        this.id = id;

        for(int i =0 ;i < entranceCount; i++){
            entrances.add(new Entrance(floorCount, i));
        }

    }

}
