public class Tabungan{
    int saldo;

    public Tabungan(int initsaldo){ // method constructor
        saldo = initsaldo;
    }
    void ambilUang(int jumlah){ // methoid void
        saldo = saldo - jumlah;
    }
}