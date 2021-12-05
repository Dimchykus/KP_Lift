package com.lift;

import com.lift.interfaces.iEntrance;
import com.lift.strategy.Strategy1;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Queue;

public class Entrance extends Thread implements iEntrance {
    public Integer id;
    public Lift lift;
    public List<Floor> floorList = new ArrayList<>();
    public List<Integer> callList = new ArrayList<>();

    public Entrance(Integer floorCount, Integer id) {
        this.id = id;
        CreateFloors(floorCount);
        this.lift = new Lift(0, (double) 0, 0, floorList.get(0), null, this);
    }

    public void CreateFloors(Integer floorCount){
        for(int i = 0;i < floorCount;i++){
            floorList.add(new Floor(i));
        }
    }

    public void CreatePasseger(Integer floor, Integer destinationFloor) {

        Floor fl = floorList.stream().filter(x -> x.id == floor).findFirst().orElse(null);
        if(fl != null){
            fl.waiters.add(new Passenger( 2.0, 2.0, floor, destinationFloor));
            AddToCallList(floor);
        }
    }

    public void AddToCallList(Integer i){
        if( callList.contains(i) == false)
            callList.add(i);
    }

    public List<Integer> CreateCallList(){

        return callList;
    }

    @Override
    public void run(){
        lift.Move(new Strategy1(), callList, floorList);
    }
}
