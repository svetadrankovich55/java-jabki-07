public class Character {
    private String name;
    private int health;

    public Character(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void attack(){
        System.out.println("Атакую!");
    }

    public void takeDamage(int damage){
        if (health < damage) {
            health = 0;
        } else {
            health -= damage;
        }
        System.out.println(name + " получает " + damage + " урона. Осталось здоровья: " + health);
    }
}