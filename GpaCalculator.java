package com.company;



import java.util.ArrayList;
import java.util.List;

public class GpaCalculator
{

    public static void main(String[] args) {

        List<Student> goodStudents = createStudents();

        System.out.println("Avg Gpa of the class is: "+
                calculateGpa(goodStudents));


        System.out.println("Avg Gpa of the computer Science is: "+
                calculateCSGpa(goodStudents));

        System.out.println("Avg Gpa of the Math is: "+
                calculateMathGpa(goodStudents));

        System.out.println("Avg Gpa of the Physics is: "+
                calculatePhysicsGpa(goodStudents));


        System.out.println("\n Name of the  student, who got highest Gpa is  : "+
                findHigest(goodStudents));

        System.out.println("\n Name of the  student, who got lowest Gpa is  : "+
                findLowest(goodStudents));


    }

    public static double calculateGpa(List<Student> students) {

        double avgGpa;
        int numberOfStudents = students.size();
        double totalGpa = 0.0;

        for(Student s : students) {
            //totalGpa = totalGpa + s.getGpa();
            totalGpa += s.getGpa();
        }

        avgGpa = totalGpa/numberOfStudents;
        System.out.println("\n Total Number of student : " +numberOfStudents);
        return avgGpa;
    }


    public static double calculateCSGpa(List<Student> students) {

        double avgCSGpa;
        int numberOfCsStudents = 0;
        //int numberOfCsStudents = students.size();
        double totalCsGpa = 0.0;

        for (Student s : students) {
            // String cs;
           String major = s.getMajor();
            if(major.equals("cs")){
                numberOfCsStudents ++;
                totalCsGpa+= s.getGpa();
            }
        }
        avgCSGpa = totalCsGpa / numberOfCsStudents;
        System.out.println("\n Number of cs student : " +numberOfCsStudents);
            return avgCSGpa;
        }


//


    public static double calculateMathGpa(List<Student> students) {

        double avgMathGpa;
        int numberOfMathStudents = 0;
        //int numberOfCsStudents = students.size();
        double totalMathGpa = 0.0;

        for (Student s : students) {
            // String cs;
            String major = s.getMajor();
            if(major.equals("Math")){
                numberOfMathStudents ++;
                totalMathGpa+= s.getGpa();
            }
        }
        avgMathGpa = totalMathGpa / numberOfMathStudents;
        System.out.println("\n Number of Math student : " +numberOfMathStudents);
        return avgMathGpa;
    }


    //

    public static double calculatePhysicsGpa(List<Student> students) {

        double avgPhysicsGpa;
        int numberOfPhysicsStudents = 0;
        //int numberOfCsStudents = students.size();
        double totalPhysicsGpa = 0.0;

        for (Student s : students) {
            // String cs;
            String major = s.getMajor();
            if(major.equals("Physics")){
                numberOfPhysicsStudents ++;
                totalPhysicsGpa+= s.getGpa();
            }
        }
        avgPhysicsGpa = totalPhysicsGpa / numberOfPhysicsStudents;
        System.out.println("\n Number of Physics student : " +numberOfPhysicsStudents);

        return avgPhysicsGpa;
    }


    //

    public static String findHigest(List<Student> students){
        Student higestStudent = null;
        double higestGpa=0;
        for(Student s: students){
            if(s.getGpa()>higestGpa){
                higestGpa = s.getGpa();
                higestStudent = s;
            }

        }


        String maxGpa = higestGpa+ " ";
        String first = higestStudent.getFirstName();
        String last = higestStudent.getLastName();
        String fullName = first  +"  "+ last + ".\n\t  Highest  gpa is: " + maxGpa + ".\n\t  Congratulation  "+ last;

        return fullName;



    }

    //



    public static String findLowest(List<Student> students) {
        Student lowestStudent = null;
        double lowestGpa = 4;
        for (Student s : students) {
            if (s.getGpa() < lowestGpa) {
                lowestGpa = s.getGpa();
                lowestStudent = s;
            }

        }


        String lowGpa = lowestGpa + " ";
        String first = lowestStudent.getFirstName();
        String last = lowestStudent.getLastName();
        String fullName = first + "  " + last + ".\n\t  lowest   gpa among class : " + lowGpa + ".\n\t  u hav to work hard " +last;

        return fullName;
    }


    public static List<Student> createStudents(){

        Student mark = new Student(11,"Mark", "Smith",3.9, "145 walker st","mark@gmail.com","Math");
        Student john = new Student(12,  "John", "Brooke", 4.0,"143 Paul Street","john@gmail.com","cs");
        Student michael = new Student(13, "Michael", "Jackson", 4.0,"134 Pine street","michele@gmail.com","cs");
        Student paul = new Student(14, "paul", "Jackson", 1.5,"13 Travis Drive","paul@gmail.com","cs");
        Student elera = new Student(15, "Elera", "Smith", 3.89,"13 Dallas Drive","elara@gmail.com","Physics");



        Student bob = new Student(16,"Bob", "Senior",3.0, "202 South Street","bob@gmail.com","cs");
        Student david = new Student(16, "David", "David", 3.3,"22 Elm Street","david@gmail.com","Math");
        Student rick = new Student(18, "Rick", "Michel", 4.0,"212 Marimack street","rick@gmail.com","Math");
        Student caren = new Student(19, "Caren", "Caren", 3.5,"54 Travis Drive","caren@gmail.com","Math");
        Student nina= new Student(20, "Nina", "Fox", 3.2,"98 Bridge Street","nina@gmail.com","cs");



        Student cidne = new Student(21,"Cidne", "Nadelman",3.9, "124 Beach  st","cidne@gmail.com","Math");
        Student jim = new Student(22, "Jim", "Owane", 3.6,"212 Paul Street","jim@gmail.com","Physics");
        Student ram = new Student(23, "Ram", "Sharma", 3.9,"11 Cilly Road","ram@gmail.com","Physics");
        Student shyam = new Student(24, "Shyam", "Subedi", 3.1,"32 Kelly Drive","shyam@gmail.com","cs");
        Student khyam= new Student(25, "Khyam", "Khatri", 2.7,"59 Willow Street","khyam@gmail.com","cs");
        //Student ram = new Student()


        List<Student> goodStudents = new ArrayList();
        goodStudents.add(john);
        goodStudents.add(mark);
        goodStudents.add(paul);
        goodStudents.add(michael);
        goodStudents.add(elera);



        goodStudents.add(bob);
        goodStudents.add(david);
        goodStudents.add(rick);
        goodStudents.add(caren);
        goodStudents.add(nina);


        goodStudents.add(cidne);
        goodStudents.add(jim);
        goodStudents.add(ram);
        goodStudents.add(shyam);
        goodStudents.add(khyam);


        return goodStudents;
    }

}
