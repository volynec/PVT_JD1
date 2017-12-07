package task_6;

/**
 * Created by user on 07.12.2017.
 */
public class Archer extends Hero {
    public final int DAMAGE = 100;

    public Archer(String name, int health) {
        super(name, health);
    }

    public void attackEnemy(Enemy enemy) {
        if (enemy.isAlive()) {
            enemy.takeDamage(DAMAGE);
            System.out.println("Archer " + getName() + " attacks the enemy " + enemy.getName());
        } else {
            System.out.println(enemy.getName() + " dead. His health= " + enemy.getHealth());
        }
    }


}
