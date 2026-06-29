package problema1_juegoderoles;

public class Problema1_Arquero extends Problema1_Personaje {
    public Problema1_Arquero(String nombre) {
        super(nombre, 100);
    }

    @Override
    public void atacar() {
        System.out.println(nombre + " dispara una flecha a larga distancia.");
    }
}
