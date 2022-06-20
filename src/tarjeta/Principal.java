package tarjeta;

public class Principal {

    public static boolean esUnaTarjetaValida(Tarjeta tarjeta) {

        int[] numero;
        int s1 = 0;
        int s2 = 0;
        numero = tarjeta.getNumero();

        for (int i = 0; i < numero.length; i += 2) {

            if ((numero[i] * 2) < 10) {
                s1 += numero[i] * 2;
            } else {
                s1 += numero[i] * 2 - 9;
            }
        }

        for (int i = 1; i < numero.length; i += 2) {
            s2 += numero[i];
        }

        return (s1 + s2) % 10 == 0;
    }

    public static void get4UltimasCompras(Tarjeta tarjeta) {
        System.out.println("Últimas 4 compras realizadas con la tarjeta" + tarjeta.retornaOfuscado());
        tarjeta.listarCompras(4);
    }

    public static void escribeArrayInt(int[] arrayInt) {
        for (int digit : arrayInt) {
            System.out.print(digit);
        }
    }


    public static void main(String[] args) {

        //5656 3434 1212 7870
        int[] numero = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 1, 2, 3, 4, 5, 2};
        Tarjeta tarjeta = new Tarjeta(numero, "Banc 1");

        if (esUnaTarjetaValida(tarjeta)) {
            System.out.print("La tarjeta ");
            escribeArrayInt(tarjeta.getNumero());
            System.out.println(" es valida");
            System.out.println("Registrada correctamente.");
            tarjeta.anyadeCompra("Farmàcia", 8.60);
            tarjeta.anyadeCompra("Agència de viatges", 90.88);
            tarjeta.anyadeCompra("Mercat", 12.55);
            tarjeta.anyadeCompra("Cafeteria", 4.50);
            tarjeta.anyadeCompra("Mecànic", 40.00);
            tarjeta.anyadeCompra("Tenda d'esports", 29.95);
            get4UltimasCompras(tarjeta);
        } else {
            System.out.print("La tarjeta no es válida  ");
        }
    }


    //3. (20%) Explica breument com replantejaries l’apartat 1 si hi ha hagués varis tipus de targetes
    //de naturalesa similar amb petites variacions entre elles.

    /* Gracias a la herencia de la POO se podrían utilziar los principios SOLID para crear una clase abstracta llamada TarjetaSOLID
    sobre la que iríamos añadiendo nuevas funcionalidades a las ya existentes. Por ejemplo:
    */
    public abstract class TarjetaSOLID {
        public abstract boolean esPagoOnline();

        public abstract boolean tieneLimite();
    }

    public class Debito extends TarjetaSOLID {
        public boolean esPagoOnline() {
            return false;
        }

        public boolean tieneLimite() {
            return false;
        }

    }

    public class Credito extends TarjetaSOLID {
        public boolean esPagoOnline() {
            return true;
        }

        public boolean tieneLimite() {
            return true;
        }
    }
}

