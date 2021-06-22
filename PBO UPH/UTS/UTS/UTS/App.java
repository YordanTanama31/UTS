import UTS.KartuHasilStudi;
import UTS.Mahasiswa;
import UTS.MataKuliah;
import java.util.Scanner;

public class App {

    /* nama: Yordan Tanama
       kelas: 20TI2
       nim: 03082200007 */
    public static void main(String[] args) throws Exception {
        Scanner masukan = new Scanner(System.in);
        int pilih;
        char yn;

        do{

            Mahasiswa mhs = new Mahasiswa("Yordan Tanama");

            MataKuliah mk1 = new MataKuliah("03082200007", "Filsafat", 3);
            MataKuliah mk2 = new MataKuliah("03082200008", "Pemrograman Berorientasi Objek", 3);
            MataKuliah mk3 = new MataKuliah("03032200009", "Bahasa Indonesia", 4);

            KartuHasilStudi khs = new KartuHasilStudi(3,mhs);
            khs.tambahNilaiStudi(mk1, 'A');
            khs.tambahNilaiStudi(mk2, 'B');
            khs.tambahNilaiStudi(mk3, 'C');

            Mahasiswa mhs1 = new Mahasiswa("Felix");
            MataKuliah mk4 = new MataKuliah("03082200007", "Filsafat", 3);
            MataKuliah mk5 = new MataKuliah("03082200008", "Pemrograman Berorientsi Objek", 3);
            MataKuliah mk6 = new MataKuliah("03082200009", "Bahasa Indonesia", 4);

            KartuHasilStudi khs1 = new KartuHasilStudi(3,mhs1);
            khs1.tambahNilaiStudi(mk4, 'A');
            khs1.tambahNilaiStudi(mk5, 'B');
            khs1.tambahNilaiStudi(mk6, 'C');

            System.out.println("Program Nilai Mahasiswa");

            System.out.println("Ketik 1 : KHS");
            System.out.println("Ketik 2 : Exit");

            System.out.print("Pilih no : ");
            pilih = masukan.nextInt();
            System.out.println("");
            
            if (pilih == 1){
                khs.tampilkanKHS();
                System.out.println();
                khs1.tampilkanKHS();
                System.out.println();
            }
            else if(pilih == 2){
                break;
            }

            System.out.print("Ulangi Perhitungan Nilai ? (y/n) : ");
            masukan.nextLine();
            String yesno = masukan.nextLine();
            yn = yesno.charAt(0);
        }while(yn=='Y' || yn=='y');

        masukan.close();
    }
}