package q4;

public class StreetFighter{
    Levels levels;

    public void setLevels(Levels level)
    {
        levels=level;
    }

    public void kick(){
        System.out.println("Kick");
    }
    public void punch(){
        System.out.println("Punch");
    }
    public void roll(){
        levels.roll();
    }
    public void jump(){
        levels.jump();
    }
}
