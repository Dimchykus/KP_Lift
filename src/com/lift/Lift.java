package com.lift;

import com.lift.interfaces.iEntrance;
import com.lift.strategy.LiftMoveStrategy;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lift {
    private Integer id;
    public Double weight;
    public Integer maxPeople;
    public Floor currentFloor;
    public List<Passenger> passangerList;
    private List<Command> commandList;
    public LiftMoveStrategy strategy;
    public iEntrance entrance;

    public Lift() {

    }

    public Lift(Integer Id, Double weight, Integer maxPeople, Floor currentFloor, List<Command> commandList, iEntrance entrance) {
        this.id = id;
        this.currentFloor = currentFloor;
        this.maxPeople = maxPeople;
        this.weight = weight;
        this.commandList = commandList;
        this.entrance = entrance;
    }

    public void DoCommand(Command com, List<Floor> floorList) {

        this.currentFloor = floorList.get(com.FloorToGo);
        switch (com.CommandType) {
            case Take -> {
                List<Passenger> lefters = new ArrayList<>();
                for (Passenger p : currentFloor.waiters
                ) {
                    double weight = 0;
                    for (Passenger psng : passangerList) {
                        weight += psng.weight;
                    }
                    if (passangerList.size() < maxPeople && weight + p.weight < this.weight) {
                        passangerList.add(p);
                    } else {
                        lefters.add(p);
                        entrance.AddToCallList(p.currentFloor);
                    }
                }
                currentFloor.waiters = lefters;

                System.out.println(this.currentFloor.id + " Take");
                break;
            }
            case Land -> {

                List<Passenger> toLeave = new ArrayList<>();

                for (Passenger pas : passangerList
                ) {
                    if (pas.destinationFloor == this.currentFloor.id) {
                        toLeave.add(pas);
                    }
                }

                System.out.println(this.currentFloor.id + " Land");
                passangerList = passangerList.stream()
                        .filter(val -> !toLeave.contains(val))
                        .collect(Collectors.toList());

                currentFloor.leavers.addAll(toLeave);
                break;
            }
        }
    }

    public boolean Move(LiftMoveStrategy strategy, List<Integer> callList, List<Floor> floorList) {

        List<Command> list = strategy.CreateCommandList(callList, currentFloor, floorList);
        this.commandList = list;

        for (Command com : commandList
        ) {
            this.DoCommand(com, floorList);
        }

        return true;
    }


    private boolean canAddPassanger(Passenger passanger) {
        if (passangerList.size() < maxPeople && getPassangersWeight() + passanger.weight <= weight)
            return true;

        return false;
    }

    private void addPerson(Passenger passanger) {
        if (canAddPassanger(passanger))
            passangerList.add(passanger);
    }

    private double getPassangersWeight() {
        return passangerList.stream()
                .map(passanger1 -> passanger1.weight)
                .reduce(Double::sum)
                .orElse(0.0);
    }

    private double GetWeight() {
        double x = 0;
        for (Passenger pass : passangerList) {
            x += pass.weight;
        }
        return x;
    }

    private void test() {
        // passangerList.
    }
}
