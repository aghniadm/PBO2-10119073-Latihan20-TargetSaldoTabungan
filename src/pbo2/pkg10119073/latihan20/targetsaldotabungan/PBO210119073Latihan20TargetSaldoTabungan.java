package pbo2.pkg10119073.latihan20.targetsaldotabungan;

/**
 *
 * @author 
 * NAMA     : Aghnia Dewi Mahiranie
 * KELAS    : PBO2
 * NIM      : 10119073
 * Deskripsi Program : Program ini berisi program untuk menghitung lama
 * tabungan sampai mencapai saldo target
 *
 */
public class PBO210119073Latihan20TargetSaldoTabungan {

    public static void main(String[] args) {
        int saldo = 3500000;
        int bunga = 8;
        int saldotarget = 6000000;
        int jumlahbunga;
        int i;
        
        i = 1;
        while (saldo <= saldotarget){
            jumlahbunga = (saldo * bunga) / 100;
            saldo += jumlahbunga;
            
            String matauang = String.format("Rp.%,3d", saldo).replaceAll(",", ".");
            System.out.printf("Saldo di bulan ke-" + i + " %s%n",matauang);
            i++;
        }
    }
    
}