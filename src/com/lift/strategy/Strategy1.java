package com.lift.strategy;

import com.lift.Command;
import com.lift.Floor;
import com.lift.Passenger;
import com.lift.enums.CommandType;

import java.util.ArrayList;
import java.util.List;

public class Strategy1 implements LiftMoveStrategy {

    @Override
    public List<Command> CreateCommandList(List<Integer> callLift, Floor currentFloor, List<Floor> floorList) {
        List<Command> commandList = new ArrayList<>();

        for (Integer i : callLift
        ) {
            commandList.add(new Command(i, CommandType.Take));

            Floor floor = floorList.get(i);
            List<Passenger> pass = floor.waiters;

            List<Integer> floors;
            floors = pass.stream().map(x -> x.destinationFloor).distinct().toList();


            for (Integer fl : floors
            ) {
                commandList.add(new Command(fl, CommandType.Land));
            }

        }

        callLift.clear();
        return commandList;
    }

}
