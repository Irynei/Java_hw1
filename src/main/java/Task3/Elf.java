package Task3;

public class Elf extends Character{
    public Elf() {
        this.hp = 10;
        this.power = 10;
    }

    @Override
    public void kick(Character c) {
        if(c.getPower() < this.power) {
            c.setHp(0);
        } else {
            c.setHp(c.getHp() - 1);
        }
    }

}
