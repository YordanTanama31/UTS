package UTS;

public class NilaiStudi {
    /* nama: Yordan Tanama
       kelas: 20TI2
       nim: 03082200010*/

    /*Mata Kuliah */
    MataKuliah matakuliah;
    /*Nilai Huruf*/
    char NilaiHuruf;
    static int count = 1;

    public NilaiStudi(MataKuliah mk,char NilaiHuruf) {
        this.matakuliah = mk;
        this.NilaiHuruf = NilaiHuruf;
    }

    public int getSKS(){
        int sks = matakuliah.SKS;
        return sks;
    }

    public MataKuliah getMataKuliah() {
        return this.matakuliah;
    }

    public void setMataKuliah(MataKuliah MataKuliah) {
        this.matakuliah = MataKuliah;
    }

    public char getNilaiHuruf() {
        return this.NilaiHuruf;
    }

    public void setNilaiHuruf(char NilaiHuruf) {
        this.NilaiHuruf = NilaiHuruf;
    }

    public double getNilaiAngka() {
        Double nilaiangka = 0.0;
        if (NilaiHuruf == 'A'){
            nilaiangka = 4.0;
        }
        else if (NilaiHuruf == 'B'){
            nilaiangka = 3.0;
        }
        else if (NilaiHuruf == 'C'){
            nilaiangka = 2.0;
        }
        else if (NilaiHuruf == 'D'){
            nilaiangka = 1.0;
        }
        else {
            nilaiangka = 0.0;
        }
        return nilaiangka;
    }

    @Override
    public String toString() {
        return "" +
            "\t" + matakuliah.getKodeMataKuliah() + "\t\t" +
            " " + matakuliah.getNamaMataKuliah() + "\t\t" +
            " " + matakuliah.getSKS() + "\t\t" +
            " " + this.NilaiHuruf;
    }
}