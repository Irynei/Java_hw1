package Task3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class King extends Character {


    public King() {
        this.hp = ThreadLocalRandom.current().nextInt(5, 16);
        this.power = ThreadLocalRandom.current().nextInt(5, 16);
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - (new Random()).nextInt(this.power));
    }
}
