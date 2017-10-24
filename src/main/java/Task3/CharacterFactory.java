package Task3;

import java.util.Random;

public class CharacterFactory {

    private final String hobbitName="Hobbit";
    private final String elfName="Elf";
    private final String kingName="King";
    private final String knightName="Knight";

    private String[] characterTypes = { hobbitName, elfName, kingName, knightName };

    public Character CreateCharacter() {
        Random random = new Random();
        String characterType = characterTypes[random.nextInt(4)];
        Character c;
        if(characterType == hobbitName) {
            c = new Hobbit();
        } else if (characterType == elfName) {
            c = new Elf();
        } else if (characterType == kingName) {
            c = new King();
        } else {
            c = new Knight();
        }
        return c;
    }
}
