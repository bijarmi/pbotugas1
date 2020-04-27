package Tugas;
import java.util.Scanner;
public class Perhitungan_Array {

    public static void main (String[] args){

        Scanner input = new Scanner (System.in);

        System.out.println("--------Input-------");

        System.out.print("Input Jumlah Panjang Array : ");

        int n = input.nextLine();

	int hasil = 0;

        System.out.print("Input Data yang Dihitung : ");

        for (int i= 0; i < n; i++) {
	hasil = hasil + input.nextInt();
   }
	
	 System.out.println("--------Output------")
	 System.out.println(" Output Jumlah atau Panjang Array : " + n);
	 System.out.println(" Output Hasil Penjumlahan : " + hasil);

    }

}
