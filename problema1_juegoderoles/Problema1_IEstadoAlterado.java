package problema1_juegoderoles;

// OCP (Open/Closed Principle): Permite crear nuevos estados alterados sin tener que modificar las clases existentes.
public interface Problema1_IEstadoAlterado {
    void aplicarEfecto(Problema1_Personaje personaje);
}