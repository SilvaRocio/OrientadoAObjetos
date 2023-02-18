package EjercitacionClase6s;

public class Main {
    public static void main(String[] args) {
        UsuarioJuego jugador1 = new UsuarioJuego("Marquitos", "lala123");
        UsuarioJuego jugador2 = new UsuarioJuego("Rosita", "lala321");
        jugador1.aumentarPuntaje();
        System.out.println(jugador1.getNombre() + " Aumento su puntaje en " + jugador1.getPuntaje());
        jugador1.aumentarPuntaje();
        System.out.println(jugador1.getNombre() + " Aumento su puntaje en " + jugador1.getPuntaje());
        jugador1.bonus(35);
        System.out.println(jugador1.getNombre() + " Aumento su puntaje en " + jugador1.getNivel());
    }
}
