package UTS;

import java.util.ArrayList;

public class KartuHasilStudi {
    /* nama: Yordan Tanama
       kelas: 20TI2
       nim: 03082200007 */

    /* Semester */
    int semester;
    /* Mahasiwa */
    Mahasiswa Mahasiswa;
    /* ListNilaiStudi */
    ArrayList<NilaiStudi> NilaiStudi = new ArrayList<NilaiStudi>();
    /* Import SKS */
    MataKuliah Matakuliah;

    public KartuHasilStudi(int semester, Mahasiswa mhs) {
        this.semester = semester;
        this.Mahasiswa = mhs;
    }

    public int getSemester() {
        return this.semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public Mahasiswa getMahasiswa() {
        return this.Mahasiswa;
    }

    public void setMahasiswa(Mahasiswa Mahasiswa) {
        this.Mahasiswa = Mahasiswa;
    }

    public ArrayList<NilaiStudi> getNilaiStudi() {
        return this.NilaiStudi;
    }

    public void setNilaiStudi(ArrayList<NilaiStudi> NilaiStudi) {
        this.NilaiStudi = NilaiStudi;
    }

    public void tambahNilaiStudi(MataKuliah mk, char nilai) {
        NilaiStudi nilstudi = new NilaiStudi(mk, nilai);
        NilaiStudi.add(nilstudi);
    }

    public int totalSKS() {
        int total = 0;
        for (NilaiStudi nilai : NilaiStudi){
            total += nilai.getSKS();
        }
        return total;
    }

    public double ipk() {
        double totalsatu = 0.0, totaldua = 0.0;
        for(NilaiStudi i : NilaiStudi){
            totalsatu += i.getNilaiAngka() * i.getMataKuliah().getSKS();
            totaldua += i.getSKS();
        }
        return totalsatu/totaldua;
    }

    public void tampilkanKHS() {
        int count = 1;
        System.out.println("Nama Mahasiswa: " + Mahasiswa.nama);
        System.out.println("Semester ke: " + semester);
        System.out.println("IPK: " + ipk());
        System.out.println("Total SKS: " + totalSKS());
        System.out.println("");
        System.out.println("Nilai");
        System.out.println("No.\t" +  "Kode MataKuliah\t\t" + "Nama MataKuliah\t\t" + "Sks\t\t" + "Nilai");
        for(NilaiStudi a : NilaiStudi){
            System.out.print(count);
            System.out.println(a.toString());
            count++;
        }
    }
}

