package PhiEurolero.unibs.it;

public class Servizi {

    public static int phi(int numero) {
        int fi = 1;
        if (numero == 1) {
            return fi;
        } else {
            for (int i = 1; i < numero; i++) {
                for (int j = 1; j < numero; j++) {
                    if (ePrimo(i)) {
                        if (esponenziale(numero, i, j)) {
                            fi = (i - 1) * (int) Math.pow(i, j - 1);
                            return fi;
                        }
                    } else {
                        if (min_com_m(i, j)) {
                            if (numero == i * j) {
                                fi = phi(i) * phi(j);
                                return fi;
                            }
                        }
                    }
                }
            }
        }
            return fi;
        }

        public static boolean ePrimo ( int p){
            int divisori = 0;
            for (int i = 1; i <= p; i++) {
                if (p % i == 0) divisori++;
            }

            if (divisori == 2)
                return true;
            else return false;
        }


        public static boolean min_com_m ( int a, int b){
            int min_com_multiplo = 1;
            int prodotto=a*b;
            for (int i = 1; i <prodotto; i++) {
                if ((a % i) == 0 && (b % i) == 0) {
                    if (i == min_com_multiplo)
                        return true;
                }
            }
            return false;
        }

        public static boolean esponenziale ( int n, int p, int k){
            int exp = (int) Math.pow(p, k);
            if (n == exp) return true;
            else return false;
        }
    }

