/* create a Java class called Team that has:
an instance variable teamName as string
2 Programmer objects called p1 and p2
the method printTeamDetails() that prints:
on one line the teamName
on one line the details of programmer p1
on one line the details of programmer p2 */

package it.develhope.classesandobjects;

public class Team {
    public String teamName;
    Programmer p1 = new Programmer();
    Programmer p2 = new Programmer();

    public void Team (String teamName, Programmer p1, Programmer p2){
        this.teamName = teamName;
        this.p1 = p1;
        this.p2 = p2;
    }
    public void printTeamDetails(){
        System.out.println("Team name:" + teamName);
        p1.printProgrammerDetails();
        p2.printProgrammerDetails();
    }

}
