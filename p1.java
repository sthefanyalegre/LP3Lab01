
package proyecto;
import java.util.Scanner;
public class p1 {

	public static void main(String[] args){
        int vida,rp;
        boolean fl=false;
        vida=0;
        Scanner sc = new Scanner(System.in);
        do{
            vida++;
            System.out.println("vida: "+vida+"\t¿Puedes adivinar el numero secreto?");
            rp = sc.nextInt();
            if(rp ==1234)
                
                fl = true;
        }while(vida<3 && !fl);
        if(fl=true)
            System.out.println("Adivinaste!!!!!!!");
        else
            System.out.println("PERDISTE :(!!!");
        if(fl=true)
            System.out.println("Su premio es un viaje a Hawaii!!!!");
        
    }
}
