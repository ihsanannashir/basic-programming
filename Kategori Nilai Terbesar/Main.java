import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Deklarasi variable
        int[] angka = new int[100];
        int terbesar, terkecil;
        int total = 5;

        //Input
        Scanner inp = new Scanner(System.in);

        for (int i = 0; i < total; i++) {
            System.out.println("Masukkan nilai ke-" + (i+1) + ": ");
            angka[i] = inp.nextInt();
        }

        terbesar = angka[0];
        terkecil = angka[0];

        //Mencari nilai terkecil dan terbesar
        for (int i = 0; i < total; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            } else if (angka[i] < terkecil) {
                terkecil = angka[i];
            }
        }

        //Menentukan kategori nilai terbesar
        if (Math.abs(terbesar) % 2 == 0) {
            if (terbesar > 0) {
                System.out.println("Terbesar : " + terbesar + ", merupakan bilangan genap positif");
            } else if (terbesar < 0) {
                System.out.println("Terbesar : " + terbesar + ", merupakan bilangan genap negatif");
            } else {
                System.out.println(terbesar + " masuk genap");
            }
        } else if (Math.abs(terbesar) % 2 == 1) {
            if (terbesar > 0) {
                System.out.println("Terbesar : " + terbesar + ", merupakan bilangan ganjil positif");
            } else if (terbesar < 0) {
                System.out.println("Terbesar : " + terbesar + ", merupakan bilangan ganjil negatif");
            } else {
                System.out.println(terbesar + " masuk ganjil");
            }
        }

        //Menentukan kategori nilai terkecil
        if (Math.abs(terkecil) % 2 == 0) {
            if (terkecil > 0) {
                System.out.println("Terkecil : " + terkecil + ", merupakan bilangan genap positif");
            } else if (terkecil < 0) {
                System.out.println("Terkecil : " + terkecil + ", merupakan bilangan genap negatif");
            } else {
                System.out.println(terkecil + " masuk genap");
            }
        } else if (Math.abs(terkecil) % 2 == 1) {
            if (terkecil > 0) {
                System.out.println("Terkecil : " + terkecil + ", merupakan bilangan ganjil positif");
            } else if (terkecil < 0) {
                System.out.println("Terkecil : " + terkecil + ", merupakan bilangan ganjil negatif");
            } else {
                System.out.println(terkecil + " masuk ganjil");
            }
        }
    }
}