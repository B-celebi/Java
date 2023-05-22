public class Boxer {
    String name;
    int weight;
    int damage;
    int health = 100;

    Boxer(String name, int weight, int damage) {
        this.name = name;
        this.weight = weight;
        this.damage = damage;
    }

    void dealDamage(Boxer damageTaken) {
        damageTaken.health -= this.damage;
    }
}
