package proyecto;
import java.util.Scanner;

public class p1 {

	public static void main(String[] args){
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            vida++;
            System.out.println("Vida: " + vida + "\t¿Cual es tu número? ");
            rp = scanner.nextInt();
            if (rp == 150){
                fl = true;
            }
        } while (vida < 3 && !fl);
        if (fl){
            System.out.println("Adivinaste!!! ");
            System.out.println(regalo.elegir(vida));
        }
        else
            System.out.println("ups, perdiste...");
    }
}
