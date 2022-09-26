package tarea1matriz;

import javax.swing.JOptionPane;

public class Tarea1Matriz {

    public static void main(String[] args) {
        int suma;
        byte tamanho;
        short conteoMatriz = 0, conteoDiag = 0, conteoDiagInversa = 0;
        short max = 100, min = 10;
        int range = max - min + 1;

        tamanho = Byte.parseByte(JOptionPane.showInputDialog("seleccione el tamano del arreglo max 10"));
        int[][] matriz = new int[tamanho][tamanho];

        for (short i = 0; i < tamanho; i++) { //imptrimir matriz o conteo total de los valores de la matriz FILAS
            for (int j = 0; j < tamanho; j++) {     //COLUMNAS  
                matriz[i][j] = (int) (Math.random() * range) + min; //asignar valores random a la matriz
                suma = (i + j);
                conteoMatriz += matriz[i][j]; 
                System.out.print("  " + matriz[i][j]);
                if (matriz[i] == matriz[j]) {   //codigo para el conteo de la matriz simple
                    conteoDiag += matriz[i][j];
                }
                if (suma == (tamanho - 1)) {    //codigo para conteo de la matriz inversa
                    conteoDiagInversa += matriz[i][j];
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("el total de la matriz es: " + conteoMatriz);
        System.out.println("el total de la diagonal de la matriz es: " + conteoDiag);
        System.out.println("el total de la diagonal inversa de la matriz es: " + conteoDiagInversa);
        System.out.println("el total de ambas diagonales es: " + (conteoDiagInversa + conteoDiag));
    }
}
