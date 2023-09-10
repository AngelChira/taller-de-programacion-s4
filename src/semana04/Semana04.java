package semana04;

import java.util.Scanner;

public class Semana04 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el numero de horas: ");
        byte numeroHoras = teclado.nextByte();
        float montoPagar =0;
        switch (numeroHoras) {
            case 1, 2:
                montoPagar = (float) (numeroHoras * 5);
                break;
            case 3, 4, 5:
                montoPagar = (float) (5*2 + 4*(numeroHoras - 2));
                break;
            case 6, 7, 8, 9, 10:
                montoPagar = (float) (5*2 + 4*3 + 3*(numeroHoras - 5));
            default:
                montoPagar = (float) (5*2 + 4*3 + 3*5 + 2*(numeroHoras - 10));
        }
        System.out.printf("El monto total a pagar es S/%.2f soles por %d horas. %n",montoPagar,numeroHoras);
    }
    
}
