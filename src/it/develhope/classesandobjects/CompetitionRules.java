/* create a singleton class called CompetitionRules that has:
a private variable competitionRule1 as string, initialised with "Do not copy and paste from StackOverflow!" value
a private variable competitionRule2 as string, initialised with "Learn every day!" value
a private variable competitionRule3 as string, initialised with "Be the best team!" value
a method printRules() that prints the 3 rules */

package it.develhope.classesandobjects;

public class CompetitionRules {
    private String competitionRule1 = "Do not copy and paste from StackOverflow!";
    private String competitionRule2 = "Learn every day!";
    private String competitionRule3 = "Be the best team!";

    public CompetitionRules getInstance() {
        CompetitionRules instance = null;
        if (instance == null) {
            instance = new CompetitionRules();
        }
        return instance;
    }
    public void printRules(){
        System.out.println(competitionRule1);
        System.out.println(competitionRule2);
        System.out.println(competitionRule3);
    }

}