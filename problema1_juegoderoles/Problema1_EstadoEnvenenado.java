package problema1_juegoderoles;

// OCP: Se añade nueva funcionalidad de veneno respetando la interfaz sin modificar GestorEstados.
public class Problema1_EstadoEnvenenado implements Problema1_IEstadoAlterado {
    @Override
    public void aplicarEfecto(Problema1_Personaje personaje) {
        System.out.println(personaje.getNombre() + " sufre daño por veneno.");
        personaje.recibirDano(5);
    }
}