package main;

import robo.*;
import stations.StationFactory;
import tests.ChargeTest;
import tests.Charging;
import tests.DiagonalWalkTest;
import tests.SimpleTest;

public class Application {
    public static void main(String[] args) {


        AbstractRobot IronManMark_32 = RobotFactory.getRobot("IronMan","charlie");
        AbstractRobot IronManMark_33 = RobotFactory.getRobot("IronMan","beta");
        StationFactory f1 = new StationFactory();



//        System.out.printf("Simple test passed %d%%\n", ChargeTest.chargeTest((CharlieRobot)IronManMark_32));
//        System.out.println();
//        System.out.println();
//        System.out.printf("Simple test passed %d%%\n", SimpleTest.runCase(IronManMark_32));
//        System.out.println();
//        System.out.println();
//        System.out.printf("Simple test passed %d%%\n", DiagonalWalkTest.diagonalWalkTest((CharlieRobot)IronManMark_32));
//        System.out.println();
//        System.out.println();
//



        System.out.printf("Simple test passed %d%%\n", Charging.charging((BetaRobot)IronManMark_33,f1));



    }
}
