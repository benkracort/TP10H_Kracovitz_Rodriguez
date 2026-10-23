package urna;

import java.util.ArrayList;
import java.util.Random;

public class Urna<T> {
    private ArrayList<T> elementos;
    private Random random;

    public Urna() {
        elementos = new ArrayList<>();
        random = new Random();
    }

    public void agregar(T elemento) {
        elementos.add(elemento);
    }

    public T extraer() {
        if (estaVacia()) {
            return null;
        }
        int indice = random.nextInt(elementos.size());
        return elementos.remove(indice);
    }

    public int cantidad() {
        return elementos.size();
    }

    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}