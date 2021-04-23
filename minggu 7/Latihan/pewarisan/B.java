
package pewarisan;

/**
 *
 * @author denic
 */
public class B extends A { //mendeklarasikan class B yang diturunkan dari class A
    int z;

    void TampilkanJumlah() {
        //subclass mengakses member dari superclass
        System.out.println("Jumlah : " + (x + y + z));
    }
}
