package org.launchcode.java.demos.lsn3classes1;

// Start working here with your Student class.
// To instantiate the Student class, add your code to the main in the file, SchoolPractice.

public class Student {

    private String name;
    private Integer studentId;
    private Integer numberOfCredits = 0;
    private Double gpa = 0.0;

    //Constructor?
    public Student (String name, Integer studentId, Integer numberOfCredits, Double gpa){
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public String getGradeLevel(){
        if(this.numberOfCredits > 0 && this.numberOfCredits < 30){
            return "Freshman";
        } else if (this.numberOfCredits < 60){
            return "Sophomore";
        } else if (this.numberOfCredits < 90){
            return "Junior";
        } else if (this.numberOfCredits > 89) {
            return  "Senior";
        } else {
            return "Invalid credits data.";
        }
    }

    private static Double qualityScore(Double grade, Integer credits){
        Double classQualityScore = grade/credits;
        return classQualityScore;
    }

    public void addGrade(Double grade, Integer credits){
        Double currentQualityScore = this.getNumberOfCredits() * this.getGpa();
        Double addQualityScore = credits * grade;
        Double totalQualityScore = currentQualityScore + addQualityScore;
        this.numberOfCredits += credits;

        Double newGpa = totalQualityScore/this.numberOfCredits;
        setGpa(newGpa);

    }
    //GETS AND SETS
    public String getName() {
        return name;
    }

    public void setName(String aName){
        this.name = aName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer aStudentId) {
        this.studentId = aStudentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    private void setNumberOfCredits(int aNumberOfCredits) {
        this.numberOfCredits = aNumberOfCredits;
    }

    public double getGpa(){
        return gpa;
    }

    private void setGpa(double aGpa){
        this.gpa = aGpa;
    }
}