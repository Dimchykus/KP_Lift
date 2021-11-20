package com.lift;

public class Passanger {
   static Integer id;
   Integer destination;
   Integer startPosition;
   Double weight;
   Double size;
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
