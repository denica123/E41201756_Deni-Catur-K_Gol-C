/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author denic
 */
class person {
            String fName;
            String IName;
            int stuld;
            String stuStatus;
            
            
            public void set (String fName, String IName, int stuld, String stuStatus) {
                this.fName = fName;
                this.IName = IName;
                this.stuld = stuld;
                this.stuStatus = stuStatus;
            }
            
            public void show (){
                System.out.println("Student Information");
                System.out.println("Student Name : " +fName +IName);
                System.out.println("Student ID : " + stuld);
                System.out.println("Student Status : " + stuStatus);
                
            }
        }
        public class Tugas_1 {
            public static void main(String[] args){
                person javaperson = new person();
                javaperson.set("Lisa ", "Palombo", 123456789, "Active");
                javaperson.show();
            }
        }
