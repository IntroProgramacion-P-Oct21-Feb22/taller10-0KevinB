/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete5;

/**
 *
 * @author reroes
 */
public class Problema05 {

    public static void main(String[] args) {
        String[][] estudiantes = {{"Sarah Ward", "Philip Payne"},
        {"Carrie Burton", "Lauren Rice"},
        {"Emma Escobar", "Lori Flores"},
        {"Steven West", "Toni Martin"}
        };
        String cadenaAcumuladora = "";
        for (int i = 0; i < estudiantes.length; i++) {
            for (int j = 0; j < estudiantes[i].length; j++) {
                if (estudiantes[i][j].charAt(0) == 'S'
                        || estudiantes[i][j].charAt(0) == 'P'
                        || estudiantes[i][j].charAt(0) == 'T') {
                    cadenaAcumuladora = String.format("%s%s\n", cadenaAcumuladora,
                            estudiantes[i][j]);
                }
            }

        }
        System.out.println(cadenaAcumuladora);
    }
}
