package com.lift;

import java.util.List;
import java.util.Queue;

public class Floor {
    private Integer id;
    protected List<Passanger> waiters;

    public Floor(Integer id, List<Passanger> waiters) {
        this.id = id;
        this.waiters = waiters;
    }

    public void addPerson(Passanger person) {
        waiters.add(person);
    }

    public void removePerson(Passanger person) {
        waiters.remove(person);
    }
}
