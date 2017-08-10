package com.tagreed.abnd.reportcardapp;

/**
 * Created by Tagreed on 8/10/2017.
 */

public class ReportCard {
    private int courseYear;
    private String studentName;
    private int mathGrade;
    private int scinceGrade;
    private int artsGrade;

    public int getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(int courseYear) {
        this.courseYear = courseYear;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public ReportCard(int courseYear, String studentName, int mathGrade, int scinceGrade, int artsGrade) {
        this.courseYear = courseYear;
        this.studentName = studentName;
        this.mathGrade = mathGrade;
        this.scinceGrade = scinceGrade;
        this.artsGrade = artsGrade;
    }

    public int getMathGrade() {
        return mathGrade;
    }

    public void setMathGrade(int mathGrade) {
        this.mathGrade = mathGrade;
    }

    public int getScinceGrade() {
        return scinceGrade;
    }

    public void setScinceGrade(int scinceGrade) {
        this.scinceGrade = scinceGrade;
    }

    public int getArtsGrade() {
        return artsGrade;
    }

    public void setArtsGrade(int artsGrade) {
        this.artsGrade = artsGrade;
    }

    @Override
    public String toString() {
        String studentReportCard = "";
        studentReportCard = "Course Year: " + Integer.toString(courseYear) + '\n' + "Student Name: " + studentName + '\n' + "Math Grade: " + Integer.toString(mathGrade) + '\n' + "Scince Grade: " + Integer.toString(scinceGrade) + '\n' + "Arts Grade: " + Integer.toString(artsGrade);
        return studentReportCard;
    }
}
