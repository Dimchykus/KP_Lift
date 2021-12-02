package com.lift;

import java.util.Objects;

public class Passanger {
   public Integer id;
   Integer destination;
   Integer startPosition;
   Double weight;
   Double size;

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;
      Passanger passanger = (Passanger) o;
      return Objects.equals(id, passanger.id);
   }

   @Override
   public int hashCode() {
      return Objects.hash(id);
   }

   Integer LiftId;
   public Passanger(Integer id, Double weight,Double size,Integer startPosition,Integer destination,Integer LiftId ){
      this.id = id;
      this.weight = weight;
      this.size = size;
      this.destination = destination;
      this.startPosition = startPosition;
      this.LiftId=LiftId;
   }
   public boolean CallLift(){

     return true;
   }


}
