package Task3;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Knight extends Character {


    public Knight() {
        this.hp = ThreadLocalRandom.current().nextInt(2, 12);
        this.power = ThreadLocalRandom.current().nextInt(2, 12);
    }

    @Override
    public void kick(Character c) {
        c.setHp(c.getHp() - (new Random()).nextInt(this.power));
    }
}
