package com.Main.java;

import java.util.Scanner;
import Aplication.Controlador;

import javax.naming.ldap.Control;

public class Main {

    public static void main(String[] args) throws Exception {
        Controlador controlador = new Controlador();
        controlador.createRocket("32WESSDS", 3);
        controlador.createRocket("LDSFJA32", 6);
        System.out.println("32WESSDS" + " " + controlador.getPropellers("32WESSDS") + "\n"
                + "LDSFJA32" + " " + controlador.getPropellers("LDSFJA32"));
    }
}
