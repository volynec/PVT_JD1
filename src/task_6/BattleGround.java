package task_6;

/**
 * Created by user on 07.12.2017.
 */
public class BattleGround {
    public static void main(String[] args) {

        Warrior warrior=new Warrior("Thor",1000);
        Mage mage = new Mage("Starfire",1000);
        Archer archer = new Archer("Green Arrow",1000);
        Zombie zombie = new Zombie("Zomboid",1000);

        warrior.attackEnemy(zombie);
        zombie.attackHero(archer);
        mage.attackEnemy(zombie);
        mage.healing(archer);
        archer.attackEnemy(zombie);
        zombie.revive(zombie);

    }
}
