package robotTurnamentTwo;


public class Main {
    public static void main(String[] args) {

        PrintVs vs = new PrintVs();
        Round round = new Round();

        DefaultRobot robot0 = new DefaultRobot();
        DefaultRobot robot1 = new DefaultRobot();

        vs.robotVs(robot0, robot1);// выводит табличку с щ статами противников
        round.newRound(robot0,robot1);// бой

    }


}