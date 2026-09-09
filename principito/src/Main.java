public class Main {
    public static void main(String[] args) {
        Flor florPrincipito = new Flor();
        Flor florPrincipito2 = new Flor();
        florPrincipito.setActitud("vanidosa");
        florPrincipito.setApariencia("hermosa");
        florPrincipito.setEstado("sola");
        florPrincipito.setOrugas(100);
        florPrincipito2.setActitud("odiosa");
        florPrincipito2.setApariencia("horrible");
        florPrincipito2.setEstado("acompañada");
        florPrincipito2.setOrugas(1);
        Principito principito = new Principito();
        Principito principito2= new Principito();
        principito.setFlorPrincipito(florPrincipito);
        principito2.setFlorPrincipito(florPrincipito2);
        principito.imprimirFlorPrincipito();
        principito2.imprimirFlorPrincipito();
        System.out.println("-------------------------------BIENVENIDO AL FRAGMENTO DEL LIBRO DEL PRINCIPITO VERSION 1-------------------------------\n");
        System.out.println("    El principito tenía una flor que amaba mucho. Cuidaba de ella todos los\r\n" +
                "días, la regaba y le quitaba las orugas. La flor, aunque un poco " + florPrincipito.getActitud()
                + ",\r\n" +
                "era muy " + florPrincipito.getApariencia()
                + " y agradecía al principito por su dedicación. Un día, el\r\n" +
                "principito decidió explorar otros planetas y, aunque no quería dejar " + florPrincipito.getEstado()
                + " \r\n" +
                "a su flor, sabía que debía continuar su viaje para aprender más sobre el\r\n" +
                "universo.\r\n" +
                "");
        System.out.println("-------------------------------BIENVENIDO AL FRAGMENTO DEL LIBRO DEL PRINCIPITO VERSION 2-------------------------------\n");
        System.out.println("    El principito tenía una flor que amaba mucho. Cuidaba de ella todos los\r\n" +
                "días, la regaba y le quitaba las orugas. La flor, aunque un poco " + florPrincipito2.getActitud()
                + ",\r\n" + 
                "era muy " + florPrincipito2.getApariencia()
                + " y agradecía al principito por su dedicación. Un día, el\r\n" + 
                "principito decidió explorar otros planetas y, aunque no quería dejar " + florPrincipito2.getEstado()
                + " \r\n" +
                "a su flor, sabía que debía continuar su viaje para aprender más sobre el\r\n" +
                "universo.\r\n" +
                "");

    }

}
