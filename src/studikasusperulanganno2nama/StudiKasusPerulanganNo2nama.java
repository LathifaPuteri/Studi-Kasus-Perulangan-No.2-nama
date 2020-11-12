/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studikasusperulanganno2nama;

/**
 *
 * @author MOKLET-2
 */
public class StudiKasusPerulanganNo2nama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Deklarasi Variabel
        String Nama = "Salsabila rahmawati ningsih";
        char huruf = 'i';
        int counter = 0;
        
        //looping ke setiap huruf di variabel nama
        for (int i = 0; i<Nama.length(); i++){
            //cek apakah huruf ke-i = huruf yang dicari
            if(Nama.charAt(i)== huruf){
                 //jika iya maka dihitung satu
                counter++;
        }
            }
           //menampilkan hasil perhitungan
       System.out.println("Jumlah huruf i : "+counter);
    }
    
}
