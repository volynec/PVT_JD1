package task_6;

/**
 * Created by user on 07.12.2017.
 */
public class Warrior extends Hero {

    public Warrior(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackEnemy(Enemy enemy) {
        if (enemy.isAlive()) {
            enemy.takeDamage(200);
            System.out.println("Warrior " +  getName() + " attacks the enemy " +enemy.getName());
        } else {
            System.out.println(enemy.getName() + " dead. His health= " + enemy.getHealth());
        }
    }

}