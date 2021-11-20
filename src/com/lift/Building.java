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
}
