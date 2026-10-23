import modelo.ElementoSorteable;
import modelo.Participante;
import modelo.Premio;
import modelo.Entrada;
import urna.Urna;

public class Main {
    public static void main(String[] args) {
        Urna<ElementoSorteable> urna = new Urna<>();

        urna.agregar(new Participante("Juan", "Pérez", 17));
        urna.agregar(new Participante("Lucía", "Gómez", 18));
        urna.agregar(new Premio("Auriculares", "Inalámbricos", 85000));
        urna.agregar(new Entrada("Festival de Música", "Sector VIP", 101));

        System.out.println("URNA DE SORTEO:");
        System.out.println("Cantidad inicial: " + urna.cantidad());

        System.out.println("\nREALIZANDO SORTEOS:");

        while (!urna.estaVacia()) {
            ElementoSorteable elemento = urna.extraer();

            System.out.println(elemento.mostrarInformacion());
            System.out.println("Elementos restantes: " + urna.cantidad());
            System.out.println();
        }

        System.out.println("URNA VACÍA:");
        System.out.println("¿Está vacía? " + urna.estaVacia());

        ElementoSorteable elemento = urna.extraer();

        if (elemento == null) {
            System.out.println("No se puede sortear: la urna está vacía.");
        }
    }
}