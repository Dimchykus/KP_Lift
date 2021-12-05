package com.lift.strategy;

import com.lift.Command;
import com.lift.Floor;

import java.util.List;

public class Strategy2 implements LiftMoveStrategy{
    @Override
    public List<Command> CreateCommandList(List<Integer> callLift, Floor currentFloor, List<Floor> floorList) {
        return null;
    }
}
