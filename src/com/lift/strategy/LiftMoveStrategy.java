package com.lift.strategy;

import com.lift.Command;
import com.lift.Floor;

import java.util.List;

public interface LiftMoveStrategy {

    public List<Command> CreateCommandList(List<Integer> callLift, Floor currentFloor, List<Floor> floorList);

}
