package robotTurnamentTwo;


class DefaultRobot {
    StatRandomizer random = new StatRandomizer();
        private String name = "Dou";
        private String mark = "NonameInc";
        private int strength;
        private int agility;
        private int health;
        private int mass;


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    String[] infoArr() {// массив параметры робота
        return new String[] {name, mark, String.valueOf(strength), String.valueOf(agility),
                String.valueOf(health), String.valueOf(mass)};
    }
    int attack() {
        return strength + random.roll();
    }
    int defense() {
        return agility + random.roll();
    }
    public DefaultRobot() {
        name = String.format("%s-%d", name, random.getNameNum());
        mark = String.format("%s-%d", mark, random.getSeries());
        mass = random.getMass();
        strength = mass / 30;
        agility = 4 - strength;
        health = mass / 10;
    }


}
