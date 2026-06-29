package problema1_juegoderoles;

public class Problema1_Guerrero extends Problema1_Personaje {
    public Problema1_Guerrero(String nombre) {
        super(nombre, 150);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " ataca cuerpo a cuerpo con furia.");
    }
}