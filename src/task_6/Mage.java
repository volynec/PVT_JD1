package task_6;

/**
 * Created by user on 07.12.2017.
 */
public class Mage extends Hero {


    public Mage(String name, int health) {
        super(name, health);
    }

    public void attackEnemy(Enemy enemy) {
        if (enemy.isAlive()) {
            enemy.takeDamage(300);
            System.out.println("Mage " + getName() + " attacks the enemy " + enemy.getName());
        } else {
            System.out.println(enemy.getName() + " dead. His health= " + enemy.getHealth());
        }

    }

    public void healing(Hero hero) {
        hero.setHealth(200);
        System.out.println("Mage "+ getName()+" healing " + hero.getName() );

    }


}
