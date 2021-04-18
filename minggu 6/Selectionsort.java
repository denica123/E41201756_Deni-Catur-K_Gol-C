
package minggu_6;

public class Selectionsort {
    
    public static void selectionSort(int[] arr){  
        for (int i = 0; i < arr.length - 1; i++)  
        {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++){
                System.out.println(" A : " + arr[j-1] + " > " + " B : " + arr[j] );
                if (arr[j] < arr[index]){  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }
        System.out.println(" ");
    }  
       
    public static void main(String a[]){  
        int[] arr1 = {8,5,7,1,9,3};  
        System.out.println("Before Selection Sort");  
        for(int i:arr1){  
            System.out.print(i +" ");  
        } 
        System.out.println(" ");
        System.out.println();  
          
        selectionSort(arr1);//sorting array using selection sort  
         
        System.out.println("After Selection Sort");      
        for(int i:arr1){  
            System.out.print(i +" ");  
        }  
    }
}
