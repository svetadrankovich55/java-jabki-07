public class Mage extends Character{

    public Mage(String name, int health) {
        super(name, health);
    }

    @Override
    public void attack() {
        System.out.println("Огненный шар!");
    }

    public void heal(int amount) {
        setHealth(getHealth() + amount);
        System.out.printf("Восстановление здоровье на %s.Здоровье %s стало: %s \n",
                amount,
                getName(),
                getHealth());
    }
}