
package overriding;

/**
 *
 * @author denic
 */
public class B extends A {
    public void tampilkanKeLayar(){
        super.tampilkanKeLayar(); // memanggil method dari superclassnya.
        System.out.println(" Method milik class B dipanggil");
    }
    
}
