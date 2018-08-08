package com.bvs.CollegeApp.gpa;


/**
 * Created by JARVIS on 23-Feb-17.
 **/


class Semester extends Subject {
    private double gpa;
    private double totalGradePoint;
    private double totalCreditHour;

    Semester()
    {
        gpa = 0;
        totalGradePoint = 0;
        totalCreditHour = 0;
    }

    public void setCreditHour(double ch)
    {
        creditHour = ch;
    }

    public void setGrade(String g)
    {
        grade = g;
    }

    void calcTotalGradePoint()
    {
        super.setGradePoint();

        double sumOfGradePoint = creditHour * gradePoint;
        totalGradePoint = totalGradePoint + sumOfGradePoint;
    }

    void calcTotalCreditHour()
    {
        totalCreditHour = totalCreditHour + creditHour;
    }

    void calculateGpa()
    {
        gpa = totalGradePoint / totalCreditHour;
    }

    double getGpa()
    {
        return gpa;
    }

}
