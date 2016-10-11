/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.awt.Component;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author w8
 */
public class Helper {

    public static int mensaje(Component ventana, String info, String titulo, int tipo) {
        int retorno = -1;
        switch (tipo) {
            case 1:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.INFORMATION_MESSAGE);
                break;
            case 2:
                JOptionPane.showMessageDialog(ventana, info, titulo, JOptionPane.ERROR_MESSAGE);
                break;
            case 3:
                retorno = JOptionPane.showConfirmDialog(ventana, info, titulo, JOptionPane.YES_NO_OPTION);
                break;
        }
        return retorno;
    }

    public static String RecibirDatos(Component ventana, String info) {
        String aux;
        aux = JOptionPane.showInputDialog(ventana, info);
        return aux;
    }

    public static void HabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(true);

        }
    }

    public static void DeshabilitarBotones(JButton[] botones) {
        for (int i = 0; i < botones.length; i++) {
            botones[i].setEnabled(false);

        }
    }

    public static void LimpiarTabla(JTable tabla) {
        int nf, nc;
        nf = tabla.getRowCount();
        nc = tabla.getColumnCount();

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {

                tabla.setValueAt("", i, j);
            }
        }
    }

    public static void TablaPorDefecto(JTable tabla) {
        DefaultTableModel tm;
        tm = (DefaultTableModel) tabla.getModel();
        tm.setColumnCount(0);
        tm.setRowCount(0);

    }

    public static int[][] PasarDatosMatriz(JTable tabla1) {
        int nf, nc;
        nf = tabla1.getRowCount();
        nc = tabla1.getColumnCount();
        int m[][] = new int[nf][nc];

        for (int i = 0; i < m.length; i++) {

            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = (int) tabla1.getValueAt(i, j);
            }
        }
        return m;
    }

    public static String RecorridoHaciaArriba(int m[][], int j) {
        String aux = "";
        int nf = m.length;
        for (int i = (nf - 1); i >= 0; i--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;
    }

    public static String RecorridoHaciaArriba(int m[][], int j, int in, int fin) {
        String aux = "";
        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;
    }

    public static String RecorridoHaciaAbajo(int m[][], int j) {
        String aux = "";
        int nf = m.length;
        for (int i = 0; i < nf; i++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;
    }

    public static String RecorridoHaciaAbajo(int m[][], int j, int in, int fin) {
        String aux = "";
        for (int i = in; i < fin; i++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;
    }

    public static String RecorridoHaciaIzquierda(int[][] m, int i) {
        String aux = "";
        int nc = m[0].length;

        for (int j = (nc - 1); j >= 0; j--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;
    }

    public static String RecorridoHaciaIzquierda(int[][] m, int i, int in, int fin) {
        String aux = "";

        for (int j = in; j >= fin; j--) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;
    }

    public static String RecorridoHaciaDerecha(int[][] m, int i) {
        String aux = "";
        int nc = m[0].length;

        for (int j = 0; j < nc; j++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;
    }

    public static String RecorridoHaciaDerecha(int[][] m, int i, int in, int fin) {
        String aux = "";

        for (int j = in; j <= fin; j++) {
            aux = aux + m[i][j] + ", ";
        }
        return aux;
    }

    public static String RecorridoDiagonalSecundariaAbajo(int[][] m) {
        String aux = "";
        int nf = m.length;
        int nc = m[0].length;

        for (int i = 0; i < nf; i++) {
            aux = aux + m[i][nc - 1 - i] + ", ";
        }

        return aux;
    }

    public static String RecorridoDiagonalSecundariaArriba(int[][] m) {
        String aux = "";
        int nf = m.length;
        int nc = m[0].length;

        for (int i = nf - 1; i >= 0; i--) {
            aux = aux + m[i][nc - 1 - i] + ", ";
        }

        return aux;
    }

    public static String RecorridoDiagonalSecundariaArriba(int[][] m, int in, int fin) {
        String aux = "";
        int nf = m.length;
        int nc = m[0].length;

        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][nc - 1 - i] + ", ";
        }

        return aux;
    }

    public static String RecorridoDiagonalSecundariaAbajo(int[][] m, int in, int fin) {
        String aux = "";
        int nc = m[0].length;
        for (int i = in; i <= fin; i++) {
            aux = aux + m[i][nc - 1 - i] + ", ";
        }

        return aux;
    }

    public static String RecorridoDiagonalPrincipalAbajo(int[][] m) {
        String aux = "";
        int nf = m.length;

        for (int i = 0; i < nf; i++) {
            aux = aux + m[i][i] + ", ";
        }

        return aux;
    }

    public static String RecorridoDiagonalPrincipalArriba(int[][] m) {
        String aux = "";
        int nf = m.length;

        for (int i = (nf - 1); i >= 0; i--) {
            aux = aux + m[i][i] + ", ";
        }

        return aux;
    }

    public static String RecorridoDiagonalPrincipalArriba(int[][] m, int in, int fin) {
        String aux = "";

        for (int i = in; i >= fin; i--) {
            aux = aux + m[i][i] + ", ";
        }

        return aux;
    }

    public static String RecorridoDiagonalPrincipalAbajo(int[][] m, int in, int fin) {
        String aux = "";

        for (int i = in; i <= fin; i++) {
            aux = aux + m[i][i] + ", ";
        }

        return aux;
    }

    public static String Recorrido1(JTable tabla) {
        int[][] m = PasarDatosMatriz(tabla);
        int nf = m.length;
        int nc = m[0].length;
        String aux = "";

        for (int i = 0; i < nf; i++) {
            if (i == 0) {
                aux = aux + Helper.RecorridoHaciaDerecha(m, i);
            }
        }
        for (int j = 0; j < nc; j++) {
            if (j == nc - 1) {
                aux = aux + Helper.RecorridoHaciaAbajo(m, j, 1, nf / 2);
            }
        }
        for (int i = 0; i < nf; i++) {
            if (i == nf / 2) {
                aux = aux + Helper.RecorridoHaciaIzquierda(m, i);
            }
        }
        for (int j = 0; j < nc; j++) {
            if (j == 0) {
                aux = aux + Helper.RecorridoHaciaAbajo(m, j, (nf / 2) + 1, nf - 1);
            }
        }
        for (int i = 0; i < nf; i++) {
            if (i == nf - 1) {
                aux = aux + Helper.RecorridoHaciaDerecha(m, i);
            }
        }
        aux = aux.substring(0, aux.length() - 2);
        return aux;
    }

    public static String Recorrido2(JTable tabla) {
        int[][] m = PasarDatosMatriz(tabla);
        int nf = m.length;
        int nc = m[0].length;
        int in = 1;
        String aux = "";

        for (int j = 0; j < nc; j++) {
            if (j == 0) {
                aux = aux + Helper.RecorridoHaciaArriba(m, j);
            }
        }

        for (int i = 0; i < nf; i++) {
            if (i == 0) {
                aux = aux + Helper.RecorridoHaciaDerecha(m, i, in, nc / 2 - 1);
            }
        }

        for (int j = 0; j < nc; j++) {
            if (j == nc / 2) {
                aux = aux + Helper.RecorridoHaciaAbajo(m, j);
            }
        }

        for (int i = 0; i < nf; i++) {
            if (i == nf - 1) {
                aux = aux + Helper.RecorridoHaciaDerecha(m, i, nc / 2 + 1, nc - 2);
            }
        }

        for (int j = 0; j < nc; j++) {
            if (j == nc - 1) {
                aux = aux + Helper.RecorridoHaciaArriba(m, j);
            }
        }
        aux = aux.substring(0, aux.length() - 2);
        return aux;
    }

    public static String Caracol(JTable tabla) {
        int[][] m = PasarDatosMatriz(tabla);
        int nf = m.length;
        int nc = m[0].length;
        String aux = "";

        for (int i = 0; i < nf; i++) {
            for (int j = 0; j < nc; j++) {
                if (i == nf / 2 - 1 && j == nc / 2 - 1) {
                    aux = aux + Helper.RecorridoHaciaDerecha(m, i, nf / 2 - 1, nc / 2 - 1);
                }
            }
        }

        for (int j = 0; j < nc; j++) {
            if (j == nc / 2 || j == nc / 2) {
                aux = aux + Helper.RecorridoHaciaAbajo(m, j, nc / 2 - 1, nc / 2 + 1);
            }
        }

        for (int i = 0; i < nf; i++) {
            if (i == nf / 2) {
                aux = aux + Helper.RecorridoHaciaIzquierda(m, i, nc / 2 - 1, nc / 2 - 2);
            }
        }
        
        for (int j = 0; j < nc; j++) {
            if (j == nc / 2 - 2){
                aux = aux + Helper.RecorridoHaciaArriba(m, j, nc / 2 - 1, 1);
            }
        }
        
        for (int i = 0; i < nf; i++) {
            if (i == 1){
                aux = aux + Helper.RecorridoHaciaDerecha(m, i, 2, nc - 2);
            }
        }
        
        for (int j = 0; j < nc; j++) {
            if (j == nc - 2){
                aux = aux + Helper.RecorridoHaciaAbajo(m, j, 2, nf - 2);
            }
        }
        
        for (int i = 0; i < nf; i++) {
            if (i == nf - 2) {
                aux = aux + Helper.RecorridoHaciaIzquierda(m, i, nc - 2, 1);
            }
        }
        
        for (int j = 0; j < nc; j++) {
            if (j == 0){
                aux = aux + Helper.RecorridoHaciaArriba(m, j, nf - 2, 1);
            }
        }
        
        for (int i = 0; i < nf; i++) {
            if (i == 0) {
                aux = aux + Helper.RecorridoHaciaDerecha(m, i, 0, nc - 2);
            }
        }
        
        for (int j = 0; j < nc; j++) {
            if (j == nc - 1){
                aux = aux + Helper.RecorridoHaciaAbajo(m, j, 0, nf - 1);
            }
        }
        
        for (int i = 0; i < nf; i++) {
            if (i == nf - 1){
                aux = aux + Helper.RecorridoHaciaIzquierda(m, i);
            }
        }
        
        aux = aux.substring(0, aux.length() - 2);
        return aux;
    }

    public static String RecorridoZ(JTable tabla) {
        int[][] m = PasarDatosMatriz(tabla);
        int nf = m.length;
        int nc = m[0].length;
        String aux = "";

        for (int i = 0; i < nf; i++) {
            if (i == 0) {
                aux = aux + Helper.RecorridoHaciaDerecha(m, i, 0, nc - 2);
            }
        }
        aux = aux + Helper.RecorridoDiagonalSecundariaAbajo(m);

        for (int i = 0; i < nf; i++) {
            if (i == nf - 1) {
                aux = aux + Helper.RecorridoHaciaDerecha(m, i, 1, nc - 1);
            }
        }
        aux = aux.substring(0, aux.length() - 2);
        return aux;
    }

    public static String RecorridoM(JTable tabla) {
        int[][] m = PasarDatosMatriz(tabla);
        int nf = m.length;
        int nc = m[0].length;
        int fin = 1;
        int in = nf / 2;
        String aux = "";

        for (int j = 0; j < nc; j++) {
            if (j == 0) {
                aux = aux + Helper.RecorridoHaciaArriba(m, j, nf - 1, fin);
            }
        }

        aux = aux + Helper.RecorridoDiagonalPrincipalAbajo(m, 0, nf / 2 - 1);

        aux = aux + Helper.RecorridoDiagonalSecundariaArriba(m, in, 0);

        for (int j = 0; j < nc; j++) {
            if (j == nc - 1) {
                aux = aux + Helper.RecorridoHaciaAbajo(m, j, 1, nf);
            }
        }

        aux = aux.substring(0, aux.length() - 2);
        return aux;
    }

}
