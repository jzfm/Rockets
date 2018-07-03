package Domain;

public class Rocket {
    //class attributes
    private String rocketID;
    private int propellers;
    //class constructors
    public Rocket(String rocketID) throws Exception {

        if (rocketID.length() != 8) throw new Exception();
        //Default propellers
        propellers = 0;
    }

    public Rocket(String rocketID, int propellers) throws Exception {

        if (rocketID.length() != 8) throw new Exception();

        this.rocketID = rocketID.toUpperCase();

        if (propellers < 0) throw new Exception();
        this.propellers = propellers;
    }
    //get methods
    public String getRocketID() {

        return rocketID;

    }

    public int getPropellers() {

        return propellers;

    }

}