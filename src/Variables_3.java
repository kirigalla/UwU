import java.util.Scanner;

public class Variables_3 {
    public static double credito, local, internacionales, celulares, costo1, costo2, costo3, nuevo;
    public Variables_3(){

    }

    public static void metodo3_1() {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingresa tu credito base");
        credito = entrada.nextDouble();
        System.out.println("¿Cuantas llamadas internacionasles has realizado?");
        internacionales = entrada.nextDouble();
        System.out.println("¿Cuantas llamadas locales has realizado?");
        local = entrada.nextDouble();
        System.out.println("¿Cuantas llamadas a celular has realizado?");
        celulares = entrada.nextDouble();

        metodo3_2();
        metodo3_3();
    }

    public static void metodo3_2() {
        costo1 = local*0.5;
        costo2 = internacionales*0.6;
        costo3 = celulares*0.2;
        nuevo = credito-costo1-costo2-costo3;
    }

    public static void metodo3_3() {
        System.out.println("Tu credito actual deberia ser: "+nuevo);
        System.out.println("Consulte su historial de llamadas para que las cuentas resulten correctas");
    }
}
