package robotTurnamentTwo;

class Round {
    /* Процесс боя
    attack = сила + бросок кубика
    defense = ловкость + бросок кубика
    damage = атака - защита, если значение атаки выше
     */


    void newRound(DefaultRobot fighter0, DefaultRobot fighter1) {

        Boolean flag = true;              // флаг будет менять атакующего и защищаегося местами
        DefaultRobot attacker = fighter0;
        DefaultRobot defender = fighter1;

        while(defender.getHealth() > 0) {
            if(flag) {
                attacker = fighter0;
                defender = fighter1;
            }
            else {
                attacker = fighter1;
                defender = fighter0;
            }
            int att = attacker.attack();
            int def = defender.defense();
            int damage = att - def;
            if(damage < 0) {damage = 0;}
            defender.setHealth(defender.getHealth() - damage);
            System.out.printf("%s attack %d > < %d defense %s \n", attacker.getName(), att, def, defender.getName());
            System.out.printf("health : %d  vs  %d : health \n", attacker.getHealth(), defender.getHealth());
            if(damage > 0) {
                System.out.printf("урон %d \n", damage);
            }else {
                System.out.println("уклонение!");
            }

            System.out.println("______");
            flag = !flag;
        }
        System.out.printf("победа %s", attacker.getName());
    }
}
