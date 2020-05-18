package tests;

import robo.BetaRobot;
import stations.ChargingStation;
import stations.StationFactory;

public class Charging {

    public static int charging(BetaRobot robot, ChargingStation station) {

        int percentage = 0;

        station.setX(10);
        station.setY(10);
        station.setBattery(100);

        robot.setY(20);
        robot.setX(20);
        robot.setCharge(10);
        if (station.getY() == robot.getY() && station.getX() == robot.getX() && StationFactory.charge(station, robot)) {
            System.err.println("Charge test failed\n");
            return percentage;
        }
        percentage += 33;


        robot.setY(10);
        robot.setX(10);
        robot.setCharge(50);
        if ((station.getY() == robot.getY() && station.getX() == robot.getX())) {
            while (robot.getCharge() != 100) {

                StationFactory.charge(station,robot);

            }
            System.out.println(station.getBattery());
            System.out.println(robot.getCharge());
            percentage += 33;

        }


        if ((station.getY() == robot.getY() && station.getX() == robot.getX()) && robot.getCharge() < 100) {
            System.err.println("Charge test failed\n");
            while (robot.getCharge() != 100) {

                StationFactory.charge(station, robot);

            }
            return percentage;
        }


        percentage += 34;
        return percentage;
    }
}
