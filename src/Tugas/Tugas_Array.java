package Tugas;

public class Tugas_Array {
    public static void main(String[] args) {
        String mahasiswa[] = new String[3];

        mahasiswa[0] = "Bijarmi";
        mahasiswa[1] = "Rasyid";
        mahasiswa[2] = "Maruf";
        
        System.out.println("------------------------------");
        for (int i = 0;
             i < mahasiswa.length;
             i++) {

            System.out.println(
                    "Pemenang Lomba ke-" + (i + 1) + " adalah " + mahasiswa[i]);
        }
    }
}
