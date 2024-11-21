package game;

public class GameDemo {
    public static void main(String[] args) {
        // Create a player

        Player player = new Player("Alucard", 10, 20, 100, 3);
        System.out.println("===================================");
        System.out.println("Ivan picked: " + player.name + "(Fighter)");
        System.out.println("===================================");
        // Create a monster
        Monster monster = new Monster("Lord", 50, 75, 200, 5, "Blue");
        System.out.println("Monster summoned: " + monster.name + "(Creep)");
        System.out.println("===================================");
        // Player takes damage
        player.takeDamage(30);
        player.takeDamage(80);
        System.out.println("===================================");
        // Monster takes damage
        monster.takeDamage(50);
        monster.takeDamage(160);
        System.out.println("===================================");
        // Monster makes noise
        System.out.println(monster.makeNoise());
    }
}
