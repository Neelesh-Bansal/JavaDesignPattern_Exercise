package q4;

public interface Levels {
    void roll();
    void jump();
}

class Level1 implements Levels{

    @Override
    public void roll() {
        System.out.println("Roll level 1");
    }

    @Override
    public void jump() {
        System.out.println("Jump level 1");
    }
}

class Level2 implements Levels{

    @Override
    public void roll() {
        System.out.println("Roll level 2");
    }

    @Override
    public void jump() {
        System.out.println("Jump level 2");
    }
}
