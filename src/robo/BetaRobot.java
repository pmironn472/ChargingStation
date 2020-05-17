package robo;

import interfaces.HasBatteryInterface;

public class BetaRobot extends AlphaRobot implements HasBatteryInterface {

    private byte charge;

    public BetaRobot(){ }

    public BetaRobot(String name,String model){
        super(name, model);
        setX(0);
        setY(0);
        setCharge(0);
    }

    public void setCharge(int charge){
        if(charge >= 0 && charge <= 100){
            this.charge = (byte)charge;
        }else System.err.println("Error Charge");
    }

    public byte getCharge(){
        return charge;
    }


    @Override
    public boolean moveRight() {
        if(checkCharge() && super.moveRight()){
            setX( getX() + 1);
            charge--;
            return true;
        }else return false;
    }

    @Override
    public boolean moveLeft() {
        if(checkCharge() && super.moveLeft()){
            setX( getX() - 1);
            charge--;
            return true;
        }else return false;

    }

    @Override
    public boolean moveDown() {
        if(checkCharge() && super.moveDown()){
            setY( getY() + 1);
            charge--;
            return true;
        }else return false;

    }

    @Override
    public boolean moveUp() {
        if(checkCharge() && super.moveUp()){
            setY( getY() - 1);
            charge--;
            return true;
        }else return false;
    }

    public boolean checkCharge(){
        if(getCharge() <=5)
            return false;
        else return true;
    }
}
