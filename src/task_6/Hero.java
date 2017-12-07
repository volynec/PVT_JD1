package task_6;

/**
 * Created by user on 07.12.2017.
 */
public abstract class Hero implements Mortal {
    private String name;
    private int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getHealth() {
        return health;

    }

    public String getName() {
        return name;
    }

    public void takeDamage(int damage) {
        health = health-damage;
    }
    public abstract void attackEnemy(Enemy enemy);

    @Override
    public boolean isAlive() {
        return getHealth()>=0;
    }
}
