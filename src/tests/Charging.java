package tests;

import robo.AbstractRobot;
import robo.BetaRobot;
import stations.ChargingStation;
import stations.StationFactory;

public class Charging {

    public static int charging(BetaRobot robot, StationFactory factory) {

        int percentage = 0;

        factory.setX(10);
        factory.setY(10);
        factory.setBattery(100);

        robot.setY(20);
        robot.setX(20);
        robot.setCharge(10);
        if (factory.getY() == robot.getY() && factory.getX() == robot.getX() && ChargingStation.charge(factory, robot)) {
            System.err.println("Charge test failed\n");
            return percentage;
        }
        percentage += 33;


        robot.setY(10);
        robot.setX(10);
        robot.setCharge(50);
        if ((factory.getY() == robot.getY() && factory.getX() == robot.getX())) {
            while (robot.getCharge() != 100) {

                ChargingStation.charge(factory, robot);

            }
            System.out.println(factory.getBattery());
            System.out.println(robot.getCharge());
            percentage += 33;

        }

        
        if ((factory.getY() == robot.getY() && factory.getX() == robot.getX()) && robot.getCharge() < 100) {
            System.err.println("Charge test failed\n");
            while (robot.getCharge() != 100) {

                ChargingStation.charge(factory, robot);

            }
            return percentage;
        }


        percentage += 34;
        return percentage;
    }
}
