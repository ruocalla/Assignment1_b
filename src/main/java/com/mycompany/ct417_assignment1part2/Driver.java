package com.mycompany.ct417_assignment1part2;

import ct417_assignment1.*; 
import java.util.ArrayList;

public class Driver {
    
    public ArrayList <Course>CourseList;
    public ArrayList <CourseModule>ModList;
    public ArrayList <Student>StudList;
    public String CourseModule;
    public String Course;
    public String Student;
    
    public static void main(String[] args) {
        //Create Courses
        Course ECE = new Course("ECE");
        Course CSIT = new Course("CSIT");  
        
        //Create modules with Module name and ID
        CourseModule CT417 = new CourseModule("Software Engineering", "CT417");
        CourseModule CT101 = new CourseModule("Programming", "CT101");
        CourseModule EE451 = new CourseModule("System on Chip Design", "EE451");
        CourseModule EE453 = new CourseModule("Telecommunications", "EE453");
        
        //Create a series of students wtih Name and Age 
        Student Ruairi = new Student("Ruairi O'Callaghan", 22);
        Student Luke = new Student("Luke MacRedmond", 21);
        Student Kevin = new Student("Kevin McCarthy", 20);
        Student Paddy = new Student("Paddy O'Shea", 22);

        Ruairi.setCourseModules(new ArrayList());
        Luke.setCourseModules(new ArrayList());
        Kevin.setCourseModules(new ArrayList());
        Paddy.setCourseModules(new ArrayList());

        Ruairi.setCourses(new ArrayList());
        Luke.setCourses(new ArrayList());
        Kevin.setCourses(new ArrayList());
        Paddy.setCourses(new ArrayList());
        
        //Add Students to specific modules
        //Ruairi:
        Ruairi.getCourseModules().add(EE451);
        Ruairi.getCourseModules().add(EE453);
        Ruairi.getCourseModules().add(CT417);
        CT417.getStudents().add(Ruairi);
        EE451.getStudents().add(Ruairi);
        EE453.getStudents().add(Ruairi);

        //Luke:
        Luke.getCourseModules().add(EE451);
        Luke.getCourseModules().add(CT101);
        Luke.getCourseModules().add(CT417);
        EE451.getStudents().add(Luke);
        CT101.getStudents().add(Luke);
        CT417.getStudents().add(Luke);
        
        //Kevin:
        Kevin.getCourseModules().add(EE451);
        Kevin.getCourseModules().add(EE453);
        Kevin.getCourseModules().add(CT101);
        EE451.getStudents().add(Kevin);
        EE453.getStudents().add(Kevin);
        CT101.getStudents().add(Kevin);
        
        //Paddy:
        Paddy.getCourseModules().add(EE453);
        Paddy.getCourseModules().add(CT417);
        Paddy.getCourseModules().add(CT101);
        EE453.getStudents().add(Paddy);
        CT417.getStudents().add(Paddy);
        CT101.getStudents().add(Paddy);
        
        //Add Students to respective courses
        Ruairi.getCourses().add(ECE);
        Luke.getCourses().add(CSIT);
        Kevin.getCourses().add(CSIT);
        Paddy.getCourses().add(ECE);       
                
        //Linking modules to courses
        CT417.getCourses().add(ECE);
        CT417.getCourses().add(CSIT);
        CT101.getCourses().add(ECE);
        CT101.getCourses().add(CSIT);
        EE453.getCourses().add(ECE);
        EE451.getCourses().add(ECE);
        
        //Linking courses to modules
        //ECE:
        ECE.getModules().add(EE451);
        ECE.getModules().add(EE453);
        ECE.getModules().add(CT417);
        ECE.getModules().add(CT101);
        //CSIT:
        CSIT.getModules().add(CT101);
        CSIT.getModules().add(CT417);

        //Print out courses
        System.out.println("Courses : " + ECE.getCourse() + ", " + CSIT.getCourse());
        
        ArrayList<CourseModule> CT417_List = ECE.getModules();
        //Print out modules specifi to course
        //ECE Modules
        /*for (CourseModule m: CT417_List){
        System.out.println("Modules in ECE: ");
        for(int i = 0; i <= ECE.getModules().size(); i++){
        System.out.println(ECE.getModules().get(i));
            }
        }
        //CSIT Modules
        /*System.out.println("Modules in CSIT: ");
        for(int x = 0; x <= CSIT.getModules().size(); x++){
        System.out.println(CSIT.getModules().get(x));
        }*/

            for(CourseModule module : ECE.getModules()){
            System.out.println("Students:" + "\n" + module.getStudents()  );
           
            for(Student student : module.getStudents()){
                System.out.println(student.getName() + student.getUsername() + "\n" + "Modules:");
            for(CourseModule modules : student.getCourseModules()){
                    System.out.println(modules.getModuleName());
              }        
            }
        }
    }
}

