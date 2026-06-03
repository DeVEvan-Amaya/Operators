import java.util.Scanner;
import java.util.Random;

public class BatallaOperadores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("¡Bienvenido a la Batalla de Operadores!");
        System.out.println("Tu objetivo es reducir la vida del monstruo a 0.");
        
        // Operador de asignación simple (=)
        int vidaJugador = 30;
        int vidaMonstruo = 30;
        int turno = 0;

        // Operadores relacionales (>) y lógicos (&&)
        while (vidaJugador > 0 && vidaMonstruo > 0) {
            // Operador unario (++)
            turno++; 
            
            System.out.println("\n--- Turno " + turno + " ---");
            System.out.println("Tu vida: " + vidaJugador + " | Vida Monstruo: " + vidaMonstruo);
            System.out.println("Presiona ENTER para atacar...");
            scanner.nextLine();

            // Operadores aritméticos (+)
            int ataqueJugador = random.nextInt(10) + 1; // Genera daño del 1 al 10
            int ataqueMonstruo = random.nextInt(8) + 1;  // Genera daño del 1 al 8

            // Operadores de asignación compuesta (-=)
            vidaMonstruo -= ataqueJugador; 
            vidaJugador -= ataqueMonstruo;

            System.out.println("¡Atacaste y causaste " + ataqueJugador + " de daño!");
            System.out.println("El monstruo contraatacó con " + ataqueMonstruo + " de daño!");

            // Operador aritmético de módulo (%) y relacional (==)
            if (turno % 3 == 0) {
                System.out.println("¡Turno múltiplo de 3! La fatiga afecta a ambos (-2 de vida extra).");
                vidaJugador -= 2;
                vidaMonstruo -= 2;
            }

            // Operadores relacionales (>=, <=) y lógicos (&&)
            if (ataqueJugador >= 8 && ataqueMonstruo <= 3) {
                System.out.println("¡GOLPE CRÍTICO Y EVASIÓN! Recuperas 5 puntos de vida.");
                // Operador de asignación compuesta (+=)
                vidaJugador += 5; 
            }
        }

        System.out.println("\n=======================");
        System.out.println("    FIN DEL JUEGO");
        System.out.println("=======================");

        // Operadores relacionales (<=, >) y lógicos (&&)
        if (vidaJugador > 0 && vidaMonstruo <= 0) {
            System.out.println("¡Felicidades! Has derrotado al monstruo.");
        } else if (vidaJugador <= 0 && vidaMonstruo > 0) {
            System.out.println("Has sido derrotado. ¡Mejor suerte la próxima vez!");
        } else {
            System.out.println("¡Es un empate! Ambos cayeron en batalla al mismo tiempo.");
        }
        
        scanner.close();
    }
}




