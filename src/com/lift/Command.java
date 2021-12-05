package com.lift;

import com.lift.enums.CommandType;

import java.util.HashMap;
import java.util.List;

public class Command {
    public int FloorToGo;
    public CommandType CommandType;

    public Command(int FloorToGo, CommandType CommandType) {
        this.FloorToGo = FloorToGo;
        this.CommandType = CommandType;
    }
}

