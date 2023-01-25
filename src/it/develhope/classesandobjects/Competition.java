/* create a class with the main method called Competition where you:
print all the rules
create 2 teams called teamA and teamB
assign random values to teamA's and teamB's names
assign random values to teamA's programmers p1 and p2 instance variables
assign random values to teamB's programmers p1 and p2 instance variables
print teamA and teamB details */

package it.develhope.classesandobjects;

public class Competition {
    public static void main(String[] args) {
    CompetitionRules competitionRules = new CompetitionRules();
    competitionRules.getInstance();
    competitionRules.printRules();

        // create teams
        Team teamA = new Team();
        Team teamB = new Team();

        // assign random values to team names
        teamA.teamName = "Griffyndor";
        teamB.teamName = "Slytherin";

        // assign random values to teamA's programmers
        teamA.p1 = new Programmer();
        teamA.p1.name = "Harry";
        teamA.p1.programmingLanguage = "Java";
        teamA.p1.yearsOfExperience = 5;

        teamA.p2 = new Programmer();
        teamA.p2.name = "Ron";
        teamA.p2.programmingLanguage = "C++";
        teamA.p2.yearsOfExperience = 3;

        // assign random values to teamB's programmers
        teamB.p1 = new Programmer();
        teamB.p1.name = "Draco";
        teamB.p1.programmingLanguage = "JavaScript";
        teamB.p1.yearsOfExperience = 7;

        teamB.p2 = new Programmer();
        teamB.p2.name = "Bellatrix";
        teamB.p2.programmingLanguage = "Python";
        teamB.p2.yearsOfExperience = 4;

        // print teams details
        System.out.println("Team A:");
        teamA.printTeamDetails();
        System.out.println("Team B:");
        teamB.printTeamDetails();
    }
}