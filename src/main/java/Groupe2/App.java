package Groupe2;

/**
 * Hello world!
 *
 */
public class App{

    static int somme(int nombre1, int nombre2){

        return nombre1 + nombre2;
    }

    public static void main( String[] args )
    {
        int a = 10;
        int b = 30;
        System.out.println(a + " + "  + b + " = " + somme(a, b) );
    }
}
