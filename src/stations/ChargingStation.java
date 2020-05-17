package stations;

import interfaces.HasBatteryInterface;
import robo.AbstractRobot;
import robo.BetaRobot;

public class ChargingStation {

    public static boolean charge(StationFactory factory,HasBatteryInterface chargeable) {

            while (factory.getBattery() >= 5) {
                if (chargeable.getCharge() <= 100 ) {
                    chargeable.setCharge(chargeable.getCharge() + 10);
                    factory.setBattery(factory.getBattery() - 1);
                }
                return true;
            }
            return false;



    }
}
