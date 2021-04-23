
package Tugas1;

/**
 *
 * @author denic
 */
public class User {
    public static void main(String[] args){
        Televisi tv = new Televisi ("TV Tempoe Doloe, 14 inches", 10);
        String[] semuaChannels = {"RCTI","SCTV","INDOSIAR","LA TV",
                                 "METRO TV","TRANS","TPI","TV 7",
                                 "TVRI","TV G","AN TV"};
        String[] channelFavorit = {"RCTI","SCTV","INDOSIAR","LA TV",
                                   "METRO TV","TRANS","TPI","TV 7"};
        System.out.println("Pak Lukman, membeli Televisi : " + tv.getDeskripsi());
       
        tv.getChannels();
        tv.setChannels(semuaChannels);
        tv.setChannels(channelFavorit);
        
        tv.setChannelAktif(3);
        tv.setVolume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
       
       
    }
}
