package com.company;

public class Student {

    private int sid;
    private String firstName;
    private String lastName;
    private double gpa;
    private String address;
    private  String email;
    private String major;



    public Student(int sid, String firstName, String lastName, double gpa, String address, String email, String major) {
        this.sid = sid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.gpa = gpa;
        this.address = address;
        this.email = email;
        this.major = major;
    }

//    public Student() {
//
//    }

    public void setSid(int sid)
    {
        this.sid = sid;
    }
    public int getSid() {
        return sid;
    }


    public String getFirstName() {

        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    //    public String getName() {
//        return name;
//    }
//    public void setName(String name) {
//        this.name = name;
   // }

    public void setGpa(double gpa) {

        this.gpa = gpa;
    }

    public double getGpa() {

        return gpa;
    }

    public String getAddress()
    {
        return address;
    }

    public String getEmail() {

        return email;
    }




    public String getMajor() {

        return major;
    }

    public void setAddress(String address) {

        this.address = address;
    }

    public void setEmail(String email) {

        this.email = email;
    }

    public void setMajor(String major)
    {
        this.major = major;
    }
}