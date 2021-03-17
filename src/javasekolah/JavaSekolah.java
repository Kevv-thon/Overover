    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javasekolah;

/**
 *
 * @author LENOVO
 */
public class JavaSekolah {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Parent panggil = new Parent();
        anak baru = new anak();
        
        panggil.panggil();
        panggil.mulai();
        baru.pemilihan();
        //baru.lengkap(null, 0, 0);
        
    }
    
}
