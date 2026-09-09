public class Principito {
    private Flor florPrincipito;

    public Principito(Flor florPrincipito) {
        this.florPrincipito = florPrincipito;
    }

    public Principito() {
    }

    public static void cuidar() {

    }

    public static void regar() {

    }

    public static void quitar() {

    }

    public static void explorar() {

    }

    public static void amar() {
        System.out.println("Tenia una flor que amaba mucho");
    }

    public Flor getFlorPrincipito() {
        return florPrincipito;
    }

    public void setFlorPrincipito(Flor florPrincipito) {
        this.florPrincipito = florPrincipito;
    }

    public void imprimirFlorPrincipito() {
        System.out.println("ATRIBUTOS DE LA FLOR PRINCIPITO\n");
        System.out.println("Actitud: " + florPrincipito.getActitud());
        System.out.println("Apariencia: " + florPrincipito.getApariencia());
        System.out.println("Estado: " + florPrincipito.getEstado());
        System.out.println("Oruga: " + florPrincipito.getOrugas()+"\n");

    }

}