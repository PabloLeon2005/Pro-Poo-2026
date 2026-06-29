package problema1_juegoderoles;

// SRP (Single Responsibility Principle): Esta clase tiene la única responsabilidad de manejar las propiedades de un arma.
public class Problema1_Arma implements Problema1_Objeto {
    private String nombre;
    private int dano;

    public Problema1_Arma(String nombre, int dano) {
        this.nombre = nombre;
        this.dano = dano;
    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public void usar() {
        System.out.println("Atacando con " + nombre + " causando " + dano + " de daño.");
    }
}