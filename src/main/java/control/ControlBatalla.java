package control;

import java.util.Random;

public class ControlBatalla extends javax.swing.JFrame {

    int misiles = 70;
    int derribados = 0;
    int oceano[][] = new int[10][10];

    public void limpiar() {
        for (int fila = 0; fila < 10; fila++) 
        {
            for (int col = 0; col < 10; col++) 
            {
                oceano[fila][col] = 0;
            }

        }
    }

    public void imprimir() {
        System.out.println("\n\n");
        for (int fila = 0; fila < 10; fila++) 
        {
            System.out.println("");
            for (int col = 0; col < 10; col++) {
                System.out.println("\t" + oceano[fila][col]);
            } 
        }
    }

    public void asignarSubmarinos() {
        Random aleatorio = new Random();
        for (int fila = 0; fila < 10; fila++) {
            oceano[fila][aleatorio.nextInt(10)] = 1;
            //Para que el aleatorio de el valor desde 0 a 9
        }
    }

    public void dispararComparandoOceano(int fila, int columna) {
        //if
        //haces lo de if por cada boton (o sea eso de private)

    }

}
