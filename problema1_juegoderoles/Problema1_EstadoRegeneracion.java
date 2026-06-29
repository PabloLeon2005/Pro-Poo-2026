package problema1_juegoderoles;

// OCP: Extensión del sistema para permitir regeneración.
public class Problema1_EstadoRegeneracion implements Problema1_IEstadoAlterado {
    @Override
    public void aplicarEfecto(Problema1_Personaje personaje) {
        System.out.println(personaje.getNombre() + " regenera salud.");
        personaje.curar(10);
    }
}