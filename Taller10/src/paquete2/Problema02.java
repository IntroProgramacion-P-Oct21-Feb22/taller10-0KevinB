/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Problema02 {

    public static void main(String[] args) {

        double[][] ventasDiarias = {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}};
        String[] vendedores = {"Jessica Cole", "Robert Wallace"};
        double[] ventas = new double[3];
        double suma;
        String reporte = "";

        for (int i = 0; i < ventasDiarias.length; i++) {
            suma = 0;
            for (int j = 0; j < ventasDiarias[i].length; j++) {
                suma = suma + ventasDiarias[i][j];
            }
            ventas[i] = suma;
        }
        for (int i = 0; i < vendedores.length; i++) {
            reporte = String.format("%sVendedor(a) %s Ha realizado un total de "
                    + "%s en ventas\n",
                    reporte,
                    vendedores[i],
                    ventas[i]);
        }

        System.out.printf("%s\n", reporte);
    }
}
