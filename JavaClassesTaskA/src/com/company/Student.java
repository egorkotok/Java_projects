package com.company;

import java.time.LocalDate;


public class Student {
    private String firstName;
    private String secondName;
    private String patronymic;

    private LocalDate birthday = LocalDate.of(1920, 01, 01);
    private String adress;
    private String phoneNumber;

    private Faculty faculty = Faculty.NO_FACULTY;
    private int course;
    private int groupNumber;

    private String group;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(int year, int month, int day) {
        this.birthday = LocalDate.of(year, month, day);
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(int numberOfFaculty) {
        switch (numberOfFaculty){
            case 1:
                this.faculty = faculty.FACULTY_OF_COMPUTER_AIDED_DESIGN;
                break;
            case 2:
                this.faculty = faculty.FACULTY_OF_COMPUTER_SYSTEMS_AND_NETWORKS;
                break;
            case 3:
                this.faculty = faculty.FACULTY_OF_RADIOENGINEERING_AND_ELECTRONICS;
                break;
            case 4:
                this.faculty = faculty.NO_FACULTY;
                break;
        }

    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public String getGroup(){
        return group;
    }

    Student() {
    }

    public Student(String firstName, String secondName) {
        this.firstName = firstName;
        this.secondName = secondName;
    }

    public Student(String firstName, String secondName, String patronymic) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.patronymic = patronymic;
    }

    public Student(String firstName, String secondName, int year, int month, int day, int numberOfFaculty, int course, int groupNumber) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.birthday = LocalDate.of(year, month, day);
        setFaculty(numberOfFaculty);
        this.course = course;
        this.groupNumber = groupNumber;
        this.group = String.valueOf(course) + String.valueOf(faculty.ordinal()+1) + String.valueOf(groupNumber);
    }

    public Student(String firstName, String secondName, int numberOfFaculty, int course) {
        this.firstName = firstName;
        this.secondName = secondName;
        setFaculty(numberOfFaculty);
        this.course = course;
    }


    @Override
    public String toString() {
        return "Student: " + firstName + " " + secondName + " " + patronymic +
                "\n\tbirthday: " + birthday +
                "\n\tadress: " + adress +
                "\n\tphone number: " + phoneNumber +
                "\n\tfaculty: " + faculty.getValue() +
                "\n\tcourse: " + course +
                "\n\tgroup numeber: " + groupNumber +
                "\n\tgroup: " + group + "\n";
    }
}
