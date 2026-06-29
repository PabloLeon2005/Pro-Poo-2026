package problema1_juegoderoles;

public abstract class Problema1_Personaje {
    protected String nombre;
    protected int salud;
    protected Problema1_Inventario inventario;
    protected Problema1_GestorEstados gestorEstados;

    public Problema1_Personaje(String nombre, int salud) {
        this.nombre = nombre;
        this.salud = salud;
        this.inventario = new Problema1_Inventario();
        this.gestorEstados = new Problema1_GestorEstados();
    }

    public abstract void atacar(); // LSP: Las subclases definirán cómo atacan.

    public void recibirDano(int cantidad) {
        this.salud -= cantidad;
        System.out.println(nombre + " recibe " + cantidad + " de daño. Salud: " + salud);
    }

    public void curar(int cantidad) {
        this.salud += cantidad;
        System.out.println(nombre + " se cura " + cantidad + " puntos. Salud: " + salud);
    }

    public String getNombre() { return nombre; }
    public Problema1_Inventario getInventario() { return inventario; }
    public Problema1_GestorEstados getGestorEstados() { return gestorEstados; }
}

