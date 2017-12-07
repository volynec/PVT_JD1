package task_6;

/**
 * Created by user on 07.12.2017.
 */
public abstract class Enemy implements Mortal {
  private  String name;
    private int health;

    public Enemy(String name, int health) {
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

    public void takeDamage(int damage) {
        health = health-damage;
    }
public abstract void attackHero (Hero hero);



    @Override
    public boolean isAlive() {
        return health>=0;
    }
}
