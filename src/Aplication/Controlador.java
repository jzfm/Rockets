package Aplication;

import Domain.Rocket;

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    //class Attributes
    private List<Rocket> rocketList = new ArrayList<>();
    //methods
    public void createRocket(String rocketID) throws Exception {

        Rocket rocket = new Rocket(rocketID);
        rocketList.add(rocket);

    }

    public void createRocket(String rocketID, int propellers) throws Exception {

        Rocket rocket = new Rocket(rocketID, propellers);
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

    public int getPropellers (String id) throws Exception {

        Rocket rocket = getRocket(id);
        return rocket.getPropellers();

    }

}