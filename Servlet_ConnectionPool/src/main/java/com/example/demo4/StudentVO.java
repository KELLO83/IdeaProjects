package com.example.demo4;

public class StudentVO
{
    private  String id;
    private  String name;
    private  String depart;
    private int grade;
    private int score;
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public  void setName(String name) {
        this.name = name;
    }
    public String getDepart() {
        return depart;
    }
    public void setDepart(String depart) {
        this.depart = depart;
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }
    public int getScore() {
        return score;
    }
    public void setScore(int score) {
        this.score = score;
    }
}
