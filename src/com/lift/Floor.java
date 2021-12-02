package com.lift;

import java.util.List;
import java.util.Queue;

public class Floor {
    public Integer id;
    private Integer liftId;
    public List<Passanger> waiters;

    public Floor(Integer id, Integer liftId) {
        this.id = id;
        this.liftId = liftId;
    }

    public Floor(Integer id, Integer liftId, List<Passanger> waiters) {
        this.id = id;
        this.liftId = liftId;
        this.waiters = waiters;
    }


    public void addPerson(Passanger person) {
        waiters.add(person);
    }

    public void removePerson(Passanger person) {
        waiters.remove(person);
    }
}
