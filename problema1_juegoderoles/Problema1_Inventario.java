package problema1_juegoderoles;

import java.util.ArrayList;
import java.util.List;

// SRP: Clase responsable exclusivamente de gestionar la colección de objetos del personaje.
public class Problema1_Inventario {
    private List<Problema1_Objeto> objetos = new ArrayList<>();

    public void agregarObjeto(Problema1_Objeto objeto) {
        objetos.add(objeto);
        System.out.println(objeto.getNombre() + " agregado al inventario.");
    }

    public void usarObjetos() {
        for (Problema1_Objeto obj : objetos) {
            obj.usar();
        }
    }
}