package Task3;

public class Hobbit extends Character {

    public Hobbit(){
        this.hp = 3;
        this.power = 0;
    }

    private void toCry() {
        System.out.println("Oh no, I can't fight. I'd better sit and cry :(");
    }

    @Override
    public void kick(Character c) {
        this.toCry();
    }
}
