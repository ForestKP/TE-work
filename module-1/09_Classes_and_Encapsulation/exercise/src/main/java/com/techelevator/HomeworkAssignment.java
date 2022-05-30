package com.techelevator;

public class HomeworkAssignment {

    // attributes
    private int earnedMarks;
    private int possibleMarks;
    private String submitterName;

//constructor
public HomeworkAssignment(int possibleMarks, String submitterName){
    this.possibleMarks = possibleMarks;
    this.submitterName = submitterName;
}

    //derived attribute
    public String getLetterGrade(){
        double pctGrade = (double)earnedMarks / possibleMarks;
        if(pctGrade >= 0.90){
        return "A";
        }
        if(pctGrade >= 0.80){
            return "B";
        }
        if(pctGrade >= 0.70){
            return "C";
        }
        if(pctGrade >= 0.60){
            return "D";
        }
        return "F";

    }

/// getter and setter
    public int getEarnedMarks() {
        return earnedMarks;
    }

    public int getPossibleMarks() {
        return possibleMarks;
    }

    public String getSubmitterName() {
        return submitterName;
    }

    public void setEarnedMarks(int earnedMarks){
        this.earnedMarks = earnedMarks;
    }

}