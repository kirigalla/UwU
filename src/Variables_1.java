import java.util.Scanner;

public class Variables_1 {
    public static int nacimiento, actual, edad;
    public Variables_1(){

    }

    public void metodo1_1() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("¿En que año naciste?");
        nacimiento = entrada.nextInt();
        System.out.println("¿Que año es?");
        actual = entrada.nextInt();
    }

    public static void metodo1_2() {
        edad = actual-nacimiento;
        System.out.println("Tu edad es "+edad+" años");
    }
}


