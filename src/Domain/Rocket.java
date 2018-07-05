package Domain;

import java.util.ArrayList;
import java.util.List;

public class Rocket {
    private String rocketID;
    private List<Propeller> propellers = new ArrayList<>();

    public Rocket(String rocketID) throws Exception {
        if (rocketID.length() != 8) throw new Exception();
        this.rocketID = rocketID;
    }

    public void addPropellers(Propeller propellers) {
        this.propellers.add(propellers);
    }

    public String getRocketID() {
        return rocketID;
    }

    public List<Propeller> getPropellers(){return propellers;}

    public int getPropellersAmount() {return propellers.size();}

    public void speedUp(int rounds) {
        for (int i = 0; i < rounds; i++) {
            for (Propeller propeller : this.propellers) {
                propeller.changePotency(10);
            }
        }
    }

    public void brake(int rounds) {
        for (int i = 0; i < rounds; i++) {
            for (Propeller propeller : this.propellers) {
                propeller.changePotency(-10);
            }
        }
    }

    public int getActualSpeed(){
        int actualSpeed = 0;
        for (Propeller propeller : this.propellers) {
            actualSpeed+=propeller.getPotency();
        }
        return actualSpeed;
    }
}

