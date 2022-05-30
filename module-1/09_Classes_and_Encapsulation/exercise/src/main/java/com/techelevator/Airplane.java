package com.techelevator;

public class Airplane {

//class data members

    private String planeNumber;
    //First Class
    private int bookedFirstClassSeats;
    //private int availableFirstClassSeats; // derived
    private int totalFirstClassSeats;
    //Coach
    private int bookedCoachSeats;
    //private int availableCoachSeats; // derived
    private int totalCoachSeats;

//Class CONSTRUTOR


    public Airplane(String planeNumber, int totalFirstClassSeats, int totalCoachSeats) {
        this.planeNumber = planeNumber;
        this.totalFirstClassSeats = totalFirstClassSeats;
        this.totalCoachSeats = totalCoachSeats;


    }
    // class methods
    public boolean reserveSeats(boolean forFirstClass, int numberOfSeats) {

        if (forFirstClass) {
            if( numberOfSeats > getAvailableFirstClassSeats()) {
                return false;
            }
            bookedFirstClassSeats += numberOfSeats;
        }

        // !forFirstClass
        else {
            if(numberOfSeats > getAvailableCoachSeats()) {
                return false;
            }
            bookedCoachSeats += numberOfSeats;
        }
        return true;
    }

    //class getters and setters

     public String getPlaneNumber() {
        return planeNumber;
    }
     public int getBookedFirstClassSeats() {
        return bookedFirstClassSeats;
    }
      public int getAvailableFirstClassSeats() {

        return totalFirstClassSeats - bookedFirstClassSeats;
    }
      public int getTotalFirstClassSeats() {
        return totalFirstClassSeats;
    }
     public int getBookedCoachSeats() {
        return bookedCoachSeats;
    }
     public int getAvailableCoachSeats() {
        return totalCoachSeats - bookedCoachSeats;
    }
       public int getTotalCoachSeats() {
        return totalCoachSeats;
    }

}
