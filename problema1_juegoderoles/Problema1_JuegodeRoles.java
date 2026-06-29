package problema1_juegoderoles;

public class Problema1_JuegodeRoles {
    public static void main(String[] args) {
        Problema1_Personaje guerrero = new Problema1_Guerrero("Thor");
        
        Problema1_Arma espada = new Problema1_Arma("Espada Larga", 25);
        Problema1_Armadura escudo = new Problema1_Armadura("Escudo de Hierro", 15);
        
        guerrero.getInventario().agregarObjeto(espada);
        guerrero.getInventario().agregarObjeto(escudo);
        
        guerrero.getInventario().usarObjetos();
        guerrero.atacar();
    }
}