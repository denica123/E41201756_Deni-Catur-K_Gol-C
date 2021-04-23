
package Tugas2;

import Tugas1.Televisi;

/**
 *
 * @author denic
 */
public class TelevisiModern extends Televisi {
    static final String TELETEXT = "Teletext";
    static final String tv = "Televisi";
    
    private String modusTampilan;
    private String cdPlay;
    private String discTray;
    
    TelevisiModern(String deskripsi, int maxChannel){
        super(deskripsi, maxChannel);
    }
    
    public void setModusTampilan(String modusTampilan){
        System.out.println ("Modus Tampilan : " + modusTampilan);
        this.modusTampilan = modusTampilan;
    }
    
    public void setHalamanTeletext (int halamanTeletext){
        System.out.println("Berpindah ke Halaman Teletext " +halamanTeletext);
    }
    
    public void playCD(){
        if(discTray == null){
            System.out.println("Tidak ada CD di dalam disctray!");
        } else {
            System.out.println("Memutar Film  " + discTray);
        }
    }
    
    public void setDistray (String discTray){
        this.discTray = discTray;
    }
}
