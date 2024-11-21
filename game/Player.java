package game;

public class Player extends DamageableObject {
    int score;
    int livesRemaining;

    public Player(String name, int posX, int posY, int maxHealth, int livesRemaining) {
        super(name, posX, posY, maxHealth);
        this.livesRemaining = livesRemaining;
        this.score = 0;
    }

    @Override
    public void onKilled() {
        livesRemaining--;
        System.out.println(name + " has been killed. Lives remaining: " + livesRemaining);
        if (livesRemaining > 0) {
            health = maxHealth;
            System.out.println(name + " respawns with full health.");
        } else {
            System.out.println(name + " has no lives remaining. Game over.");
        }
    }
}
