package modelo;

public class Premio extends ElementoSorteable {
    private String nombre;
    private String descripcion;
    private double valor;

    public Premio(String nombre, String descripcion, double valor) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.valor = valor;
    }

    @Override
    public String mostrarInformacion() {
        return "Premio: " + nombre
                + " | Descripción: " + descripcion
                + " | Valor: $" + valor;
    }
}