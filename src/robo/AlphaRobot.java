package robo;

public class AlphaRobot extends  AbstractRobot {
    private String name;
    private String model;
    private int x;
    private int y;

    public AlphaRobot() {
    }

    public AlphaRobot(String name, String model) {
        setName(name);
        setModel(model);
        setX(0);
        setY(0);
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        } else
            System.err.println("Error Name");
    }

    public void setModel(String model) {
        if (model != null) {
            this.model = model;
        } else
            System.err.println("Error Model");
    }


    public void setX(int x) {
        if (x >= 0 && x <= 100)
            this.x = x;
        else
            System.err.println("Error X");
    }

    public void setY(int y) {
        if (y >= 0 && y <= 100)
            this.y = y;
        else
            System.err.println("Error Y");
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }


    public boolean moveRight() {
        if (getX() < 100) {
            setX(getX() + 1);
            return true;
        } else
            return false;
    }


    public boolean moveLeft() {
        if (getX() > 0) {
            setX(getX() - 1);
            return true;
        } else
            return false;
    }


    public boolean moveDown() {
        if (getY() < 100) {
            setY(getY() + 1);
            return true;
        } else
            return false;
    }


    public boolean moveUp() {
        if (getY() > 0) {
            setY(getY() - 1);
            return true;
        } else
            return false;
    }


    @Override
    public void setCharge(int charge) {

    }

    @Override
    public byte getCharge() {
        return 0;
    }

    @Override
    public byte getBattery() {
        return 0;
    }

    @Override
    public void setBattery(int battery) {

    }

}
