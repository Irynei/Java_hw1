package Task3;


public class GameManager {

    public void fight(Character c1, Character c2){
        String firstName = c1.getClass().getSimpleName();
        String secondName = c2.getClass().getSimpleName();
        int roundsNumber = 0;
        System.out.println("Let the game begin!");
        System.out.println(String.format("First character: %s  %s",firstName , c1));
        System.out.println(String.format("Second character: %s  %s",secondName , c2));

        while((c1.isAlive() && c2.isAlive()) || roundsNumber < 10) {
            roundsNumber ++;
            System.out.println("Second character " + secondName + " is kicking....");
            System.out.println(String.format("First character: %s  %s",firstName , c1));
            System.out.println(String.format("Second character: %s  %s",secondName , c2));
            c2.kick(c1);
            if (!c1.isAlive()) {
                System.out.println("First character " + firstName + " is dead " + c1);
                System.out.println("Second character " + secondName + " is the winner!! " + c2);
                return;
            }

            System.out.println("First character " + firstName + " is kicking...");
            c1.kick(c2);
            System.out.println(String.format("First character: %s  %s",firstName , c1));
            System.out.println(String.format("Second character: %s  %s",secondName , c2));
        }
        System.out.println("First character " + firstName + " is the winner!! " + c1);
        System.out.println("Second character " + secondName + " is dead " + c2);

    }


}