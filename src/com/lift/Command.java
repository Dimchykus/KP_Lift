package com.lift;

import java.util.HashMap;
import java.util.List;

public class Command {
    public Floor FloorToGo;
    public Floor FloorToLeave;
    List<Integer> PassengersToPick;
    List<Integer> LeavingPassengers;

    public Command(Floor FloorToGo, Floor FloorToLeave, List<Integer> PassengersToPick, List<Integer> LeavingPassengers) {
        this.FloorToGo = FloorToGo;
        this.FloorToLeave = FloorToLeave;
        this.PassengersToPick = PassengersToPick;
        this.LeavingPassengers = LeavingPassengers;
    }
}
