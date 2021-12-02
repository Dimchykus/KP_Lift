package com.lift;

import java.util.List;

public class Building {
    private Integer id;
    public List<Floor> floors;
    public List<Lift> lifts;

    public Building(Integer id, List<Floor> floors, List<Lift> lifts) {
        this.id = id;
        this.floors = floors;
        this.lifts = lifts;
    }

    public Floor GetFloor(Integer id){
        List<Floor> result = floors.stream().filter(f -> f.id == id).toList();
        return result.get(0);
    }
}
