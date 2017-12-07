package task_6;

/**
 * Created by user on 07.12.2017.
 */
public class Zombie extends Enemy {
    public Zombie(String name, int health) {
        super(name, health);
    }

    @Override
    public void attackHero(Hero hero) {
        if (hero.isAlive()) {
            hero.takeDamage(300);
            System.out.println("Zombie " + getName() + " attacks the hero " + hero.getName());
        } else {
            System.out.println(hero.getName() + " dead. His health= " + hero.getHealth());
        }

    }

    public void revive(Zombie zombie) {
        if (zombie.isAlive()) {
            System.out.println(getName() + " Still alive");
        } else {
           zombie.setHealth(1000);
            System.out.println(getName() + " is revive");
        }

    }

}
