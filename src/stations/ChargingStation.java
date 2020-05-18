package stations;

import interfaces.Has2DCoordinatesInterface;
import interfaces.HasBatteryInterface;

public class ChargingStation implements Has2DCoordinatesInterface, HasBatteryInterface {

    private byte battery;
    private int x;
    private int y;

    public ChargingStation(){ }

    public ChargingStation(byte battery) {
        setBattery(battery);
        setX(x);
        setY(y);
    }

    @Override
    public void setCharge(int charge) {

    }

    @Override
    public byte getCharge() {
        return 0;
    }

    public byte getBattery() {
        return battery;
    }

    public void setBattery(int battery) {
        if (battery >= 0 && battery <= 100)
            this.battery = (byte) battery;
        else System.err.println("Error Battery");
    }

    @Override
    public void setX(int x) {
        this.x=x;

    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setY(int y) {
        this.y= y;
    }

    @Override
    public int getY() {
        return y;
    }
}
