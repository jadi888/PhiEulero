package PhiEurolero.unibs.it;

import java.util.Scanner;


public class MainPhi {

    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.println("Inserisci un intero positivo:");
        int intero = scan.nextInt();
        int pfi = Servizi.phi(intero);
        System.out.printf("Il numero phi di eulero dell'intero inserito è %d", pfi);
    }

}
