/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_2;

import person.person;

/**
 *
 * @author denic
 */
public class Managingpeople {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        person p1 = new person("Arial", 37);
        person p2 = new person("Joseph", 15);
        
        if(p1.getAge()==p2.getAge()){
            
            System.out.println(p1.getName()+" is the same age as " + p2.getAge());
        }
        else {
            
            System.out.println(p1.getName()+" is Not the same age as " + p2.getAge());
        }
    }
    
}
