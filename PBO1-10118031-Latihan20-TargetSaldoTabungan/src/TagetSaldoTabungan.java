
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;


/**
 *
 * @author Vendetta 
 * NAMA              : Rizki Aria Putra 
 * KELAS             : PBO1 
 * NIM               : 10118031
 * Deskripsi Program : Program ini berisi program untuk memperkirakan mencapai saldo target
 */
public class TagetSaldoTabungan {

    public static void main(String[] args) {
        double saldoAwal = 3500000, saldoTarget = 6000000, saldoSekarang = saldoAwal, bunga = 0.08;
        int bulanKe = 1;

        do {
            saldoSekarang += saldoSekarang * bunga;
            System.out.printf("Saldo di bulan ke-%d Rp. %.0f\n", bulanKe, saldoSekarang);
            bulanKe++;
        } while (saldoSekarang < saldoTarget);
    }

}
