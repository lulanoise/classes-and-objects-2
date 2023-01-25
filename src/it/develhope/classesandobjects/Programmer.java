/* create a Java class called Programmer that has:
the instance variable name as string
the instance variable programmingLanguage as string
the instance variable yearsOfExperience as integer
the method printProgrammerDetails() that prints all the state of the Programmer object */

package it.develhope.classesandobjects;

public class Programmer {
    public  String name;
    public  String programmingLanguage;
    public  int yearsOfExperience;

    public void Programmer(String name, String programmingLanguage, int yearsOfExperience){
        this.name = name;
        this.programmingLanguage = programmingLanguage;
        this.yearsOfExperience = yearsOfExperience;
    }

    public void printProgrammerDetails(){
        System.out.println("Name:" + name);
        System.out.println("Programming Language:" + programmingLanguage);
        System.out.println("Years of Experience:" + yearsOfExperience);
    }
}
