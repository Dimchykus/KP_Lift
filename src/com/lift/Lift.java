package com.lift;

import java.util.List;
import java.util.stream.Collectors;

public class Lift {
    private Integer id;
    public Double weight;
    public Integer maxPeople;
    public Floor currentFloor;
    public List<Passanger> passangerList;
    private List<Command> commandList;

    public Lift() {

    }

    public Lift(Integer Id, Double weight, Integer maxPeople, Floor currentFloor, List<Command> commandList) {
        this.id = id;
        this.currentFloor = currentFloor;
        this.maxPeople = maxPeople;
        this.weight = weight;
        this.commandList = commandList;
    }

    public boolean Move() {
        for (Command command : commandList) {
            currentFloor = command.FloorToGo;

            List<Passanger> pick = passangerList.stream().filter(passanger -> command.PassengersToPick.contains(passanger)).collect(Collectors.toList());
//            List<Passanger> pick = passangerList.stream().filter(command.PassengersToPick.stream().filter(passanger -> passangerList.contains(passanger)).collect(Collectors.toSet()));


            passangerList.addAll(pick);
            currentFloor = command.FloorToLeave;

            // спільні пасажири  leave
            // passangerList
            // command.LeavingPassengers
            List<Passanger> leave; // =


            // видалити спільних пасажирів leave звідси ->
//            passangerList.stream()

        }
        return true;
    }


    private boolean canAddPassanger(Passanger passanger) {
        if (passangerList.size() < maxPeople && getPassangersWeight() + passanger.weight <= weight)
            return true;

        return false;
    }

    private void addPerson(Passanger passanger) {
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
        for (Passanger pass : passangerList) {
            x += pass.weight;
        }
        return x;
    }

    private void test() {
        passangerList.
    }
}
