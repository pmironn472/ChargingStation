package robo;

public class RobotFactory {
    public static AbstractRobot getRobot(String name, String model) {

        if (model.equals("alpha"))
            return new AlphaRobot(name, model);

        if (model.equals("beta"))
            return new BetaRobot(name, model);

        if (model.equals("charlie"))
            return new CharlieRobot(name, model);

       return null;
    }

}
