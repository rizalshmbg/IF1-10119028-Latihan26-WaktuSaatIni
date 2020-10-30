/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119028.latihan26.waktusaatini;

import java.util.*;

/**
 *
 * @author NAMA : Rizal Sihombing KELAS : IF1 NIM : 10119028 Deskripsi Program :
 * Program ini berisi program untuk menampilkan waktu saat ini
 */
public class IF110119028Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int detik, menit, jam, hari, tanggal, bulan, tahun;
        GregorianCalendar waktu = new GregorianCalendar();
        String namabulan[] = {"Januari", "Februari", "Maret", "April", "Mei", "Juni", "Juli", "Agustus", "September", "Oktober", "November", "Desember"};
        String nama_hari[] = {"Sabtu", "Minggu", "Senin", "Selasa", "Rabu", "Kamis", "Jumat"};
        detik = waktu.get(Calendar.SECOND);
        menit = waktu.get(Calendar.MINUTE);
        jam =  waktu.get(Calendar.HOUR_OF_DAY);
        hari = waktu.get(Calendar.DAY_OF_WEEK);
        tanggal = waktu.get(Calendar.DAY_OF_MONTH);
        bulan = waktu.get(Calendar.MONTH);
        tahun = waktu.get(Calendar.YEAR);
        System.out.println("Hari ini adalah hari : "+nama_hari[hari]+", "+tanggal+" "+namabulan[bulan]+" "+tahun+" "+jam+":"+menit+":"+detik);

    }
}