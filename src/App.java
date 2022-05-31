import bangunruang.Bola;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("----------------------");
        System.out.println("Menghitung Volume Bola");
        System.out.println("----------------------");

        Scanner keyboard = new Scanner(System.in);
        System.out.print("Masukkan jari-jari bola (cm): ");

        Bola bola = new Bola();
        bola.r = keyboard.nextInt();
        bola.tampilkanVolumeBola();

        keyboard.close();
    }
}
