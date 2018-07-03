package com.Main.java;

import java.util.Scanner;
import Aplication.Controlador;

import javax.naming.ldap.Control;

public class Main {

    public static void main(String[] args) throws Exception {
        //Setting scanner
        Scanner input = new Scanner(System.in);
        //input data
        String rocket1 = "32WESSDS";
        int props1 = 3;
        String rocket2 = "LDSFJA32";
        int props2 = 6;
        //connecting with control
        Controlador controlador = new Controlador();
        //passing the data for instanciation
        controlador.createRocket(rocket1, props1);
        controlador.createRocket(rocket2, props2);
        //Print
        System.out.println(rocket1 + " " + controlador.getPropellers(rocket1) + "\n"
                + rocket2 + " " + controlador.getPropellers(rocket2));

    }

}
