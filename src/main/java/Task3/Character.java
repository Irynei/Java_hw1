package Task3;

import lombok.Data;

@Data
public abstract class Character {
    protected int power;
    protected int hp;
    protected boolean isAlive = true;

    public void setHp(int hp) {
        if(hp <= 0 ){
            this.isAlive = false;
        }
        this.hp = hp;
    }

    public boolean isAlive() {
        return this.isAlive;
    }
    public abstract void kick(Character c);
}
