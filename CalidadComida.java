import java.util.Scanner;
public class CalidadComida {
    public static void main(String[] args) {

        int[] respuestas = new int[10];
        int[] Calificaciones = new int[5];
        String[] nombresCalificaciones = {"Pesimo", "Malo", "Bueno", "Muy Bueno", "Excelente"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese las calificaciones de los 30 estudiantes:");

        for (int i = 0; i < respuestas.length; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            respuestas[i] = scanner.nextInt();

            Calificaciones[respuestas[i] - 1]++;

        }
        System.out.println("Frecuencia de la calificaciones: ");

        for (int i = 0; i < Calificaciones.length; i++) {
            System.out.println(Calificaciones[i] + " Personas votaron "+ nombresCalificaciones[i]);
        }
    }
}