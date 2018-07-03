package Domain;

public class Rocket {
    private String rocketID;
    private int propellers;
    public Rocket(String rocketID) throws Exception {
        if (rocketID.length() != 8) throw new Exception();
        propellers = 0;
    }

    public Rocket(String rocketID, int propellers) throws Exception {
        if (rocketID.length() != 8) throw new Exception();
        this.rocketID = rocketID.toUpperCase();
        if (propellers < 0) throw new Exception();
        this.propellers = propellers;
    }

    public String getRocketID() { return rocketID; }

    public int getPropellers() { return propellers; }
}