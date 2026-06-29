package problema1_juegoderoles;

// SRP: Únicamente maneja las propiedades de una armadura.
public class Problema1_Armadura implements Problema1_Objeto {
    private String nombre;
    private int defensa;

    public Problema1_Armadura(String nombre, int defensa) {
        this.nombre = nombre;
        this.defensa = defensa;
    }

    @Override
    public String getNombre() { return nombre; }

    @Override
    public void usar() {
        System.out.println("Equipando " + nombre + " aumentando " + defensa + " de defensa.");
    }
}