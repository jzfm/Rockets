package Aplication;

import Domain.Propeller;
import Domain.Rocket;

import java.util.ArrayList;
import java.util.List;

public class Controlador {

    private List<Rocket> rocketList = new ArrayList<>();

    public void createRocket(String rocketID) throws Exception {
        Rocket rocket = new Rocket(rocketID);
        rocketList.add(rocket);
    }

    private Rocket getRocket (String id) throws Exception {
        for (Rocket rocket : rocketList) {
            if (rocket.getRocketID() != null && rocket.getRocketID().contains(id)) {
                return rocket;
            }
        }
        throw new Exception();
    }

    public int getPropellersAmount(String id) throws Exception {
        Rocket rocket = getRocket(id);
        return rocket.getPropellersAmount();
    }

    public StringBuilder getPropellersState(String id) throws Exception {
        Rocket rocket = getRocket(id);
        List<Propeller> propellers = rocket.getPropellers();
        StringBuilder propellerstate = new StringBuilder();
        for (Propeller propeller : propellers) {
            propellerstate.append('[');
            propellerstate.append(propeller.getPotency());
            propellerstate.append('/');
            propellerstate.append(propeller.getMaxPotency());
            propellerstate.append(']');
        }
        return propellerstate;
    }

    public int getActualSpeed(String id) throws Exception{
        Rocket rocket = getRocket(id);
        return rocket.getActualSpeed();
    }

    public void addPropellers(String id, int maxPotency) throws Exception {
        Rocket rocket = getRocket(id);
        Propeller propeller = new Propeller(maxPotency);
        rocket.addPropellers(propeller);
    }

    public void speedUp(String id, int rounds) throws Exception {
        Rocket rocket = getRocket(id);
        rocket.speedUp(rounds);
    }

    public void brake(String id, int rounds) throws Exception {
        Rocket rocket = getRocket(id);
        rocket.brake(rounds);
    }
}
