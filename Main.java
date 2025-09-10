package JogoDaVelha;

import javax.xml.transform.stream.StreamSource;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);

        double[][] array = new double[3][3];

        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++) {
                System.out.println("Informe o valor da posição ["+i+"]["+j+"]");
                array[i][j] = Double.parseDouble(teclado.nextLine());
            }
        imprimeArrayBi(array);
    }

    public static void imprimeArrayBi(double[][] array){

        for(int i = 0; i < array.length; i++)
            for(int j = 0; j < array[i].length; j++) {

                if(j != array[i].length - 1)
                    System.out.print(array[i][j] + " | ");
                else
                    System.out.print(array[i][j] + "\n");
            }
        }
}
