import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        char letra;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1.-Calcular la edad de una persona");
            System.out.println("2.-Area y perimetro de una figura");
            System.out.println("3.-Costo de llamadas de celular");

            opcion = entrada.nextInt();

            switch (opcion){
                case 1:
                    Ejercicio_1 obj = new Ejercicio_1();
                    obj.metodo1();
                    break;

                case 2:
                    Ejercicio_2 obj2 = new Ejercicio_2();
                    obj2.metodo2();
                    break;

                case 3:
                    Ejercicio_3 obj3 = new Ejercicio_3();
                    obj3.metodo3();
                    break;
            }

            System.out.println("Programa realizado por 3IV8 Rivas Gutierrez Leonardo");
            System.out.println("¿Deseas volver al menu?, si lo deseas escribe s");
            letra = entrada.next().charAt(0);

        }while (letra == 's');
    }
}
