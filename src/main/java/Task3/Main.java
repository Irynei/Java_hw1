package Task3;

public class Main {
    public static void main(String [] args) {

        CharacterFactory factory = new CharacterFactory();
        Character c1 = factory.CreateCharacter();
        Character c2 = factory.CreateCharacter();
        GameManager gameManager = new GameManager();
        gameManager.fight(c1, c2);
    }
}
