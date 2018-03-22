package q4;

public class User {
    public static void main(String[] args) {
        StreetFighter streetFighter = new StreetFighter();
        streetFighter.setLevels(new Level1());
        streetFighter.roll();
        streetFighter.jump();
        streetFighter.kick();
        streetFighter.setLevels((new Level2()));
        streetFighter.roll();
        streetFighter.jump();
        streetFighter.kick();
    }
}
