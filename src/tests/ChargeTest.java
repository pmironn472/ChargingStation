package tests;

import robo.AbstractRobot;
import robo.AlphaRobot;
import robo.BetaRobot;

public class ChargeTest {
    public static int chargeTest(BetaRobot robot) {
        int percentage = 0;


        robot.setCharge(-100);
        if (robot.getCharge() < 0) {
            System.err.println("Charge test failed\nREASON: Values les than 0 not allowed!");
            return percentage;
        }
        percentage += 33;


        robot.setCharge(1000);
        if (robot.getCharge() > 100) {
            System.err.println("Charge test failed\nREASON: Values more than 0 not allowed!");
            return percentage;
        }
        percentage += 33;


        robot.setCharge(50);
        while (robot.getCharge() > 5)
            robot.moveRight();
        System.out.println("the charge level is : " + robot.getCharge());
        percentage += 34;
        return percentage;
    }


}

