public class Warrior extends Character {
    private boolean isBlocking = false;

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println("Мечом в лицо!");
    }

    public void block() {
        isBlocking = true;
        System.out.printf("%s заблокировал урон!\n", getName());
    }

    @Override
    public void takeDamage(int damage) {
        if (isBlocking == true) {
            super.takeDamage(damage / 2);
            isBlocking = false;
        } else {
            super.takeDamage(damage);
        }
    }
}