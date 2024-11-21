package game;

public class Monster extends DamageableObject {
    int threatLevel;
    String color;

    public Monster(String name, int posX, int posY, int maxHealth, int threatLevel, String color) {
        super(name, posX, posY, maxHealth);
        this.threatLevel = threatLevel;
        this.color = color;
    }

    @Override
    public void onKilled() {
        System.out.println(name + " has been killed. Threat level: " + threatLevel);
    }

    public String makeNoise() {
        return name + " makes a terrifying noise!";
    }
}
