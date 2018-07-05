package com.Main.java;

import java.util.Scanner;
import Aplication.Controlador;

import javax.naming.ldap.Control;

public class Main {

    public static void main(String[] args) throws Exception {
        Controlador controlador = new Controlador();
        controlador.createRocket("32WESSDS");
        controlador.createRocket("LDSFJA32");
        controlador.addPropellers("32WESSDS", 10);
        controlador.addPropellers("32WESSDS", 30);
        controlador.addPropellers("32WESSDS", 80);
        controlador.addPropellers("LDSFJA32", 30);
        controlador.addPropellers("LDSFJA32", 40);
        controlador.addPropellers("LDSFJA32", 50);
        controlador.addPropellers("LDSFJA32", 50);
        controlador.addPropellers("LDSFJA32", 30);
        controlador.addPropellers("LDSFJA32", 10);
        System.out.println("Rocket 1: " + "32WESSDS " + "Propellers: " + controlador.getPropellersAmount("32WESSDS")
                + " " + controlador.getPropellersState("32WESSDS"));
        System.out.println("Rocket 2: " + "LDSFJA32 " + "Propellers: " + controlador.getPropellersAmount("LDSFJA32")
                + " " + controlador.getPropellersState("LDSFJA32"));
        System.out.println("Rocket 1 actual speed: " + controlador.getActualSpeed("32WESSDS")
        + " " + controlador.getPropellersState("32WESSDS"));
        System.out.println("Rocket 2 actual speed: " + controlador.getActualSpeed("LDSFJA32")
        + " " + controlador.getPropellersState("LDSFJA32"));
        controlador.speedUp("32WESSDS", 3);
        controlador.speedUp("LDSFJA32", 3);
        System.out.println("Rocket 1 actual speed: " + controlador.getActualSpeed("32WESSDS")
                + " " + controlador.getPropellersState("32WESSDS"));
        System.out.println("Rocket 2 actual speed: " + controlador.getActualSpeed("LDSFJA32")
                + " " + controlador.getPropellersState("LDSFJA32"));
        controlador.brake("32WESSDS",5);
        controlador.speedUp("LDSFJA32",7);
        System.out.println("Rocket 1 actual speed: " + controlador.getActualSpeed("32WESSDS")
                + " " + controlador.getPropellersState("32WESSDS"));
        System.out.println("Rocket 2 actual speed: " + controlador.getActualSpeed("LDSFJA32")
                + " " + controlador.getPropellersState("LDSFJA32"));
        controlador.speedUp("32WESSDS",15);
        controlador.speedUp("LDSFJA32",15);
        System.out.println("Rocket 1 actual speed: " + controlador.getActualSpeed("32WESSDS")
                + " " + controlador.getPropellersState("32WESSDS"));
        System.out.println("Rocket 2 actual speed: " + controlador.getActualSpeed("LDSFJA32")
                + " " + controlador.getPropellersState("LDSFJA32"));

    }
}
