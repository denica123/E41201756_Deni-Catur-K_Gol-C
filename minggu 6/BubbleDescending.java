
package minggu_6;

public class BubbleDescending {
    
    private static void bubbleSort(int[] intArray) {
        
        int n = intArray.length;
        int temp = 0;
 
        for(int i=0; i < n; i++){
            for(int j=1; j < (n-i); j++){
 
                if(intArray[j-1] < intArray[j]){
                //swap the elements!
                temp = intArray[j-1];
                intArray[j-1] = intArray[j];
                intArray[j] = temp;
                }
 
            }
        }
 
    }
    
    public static void main(String[] args) {
 
        int intArray[] = new int[]{3,60,35,2,45,320,5};
 
        System.out.println("Array Before Bubble Sort Descending");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println("");
 
        bubbleSort(intArray);
 
        System.out.println("");
 
        System.out.println("Array After Bubble Sort Descending");
        for(int i=0; i < intArray.length; i++){
            System.out.print(intArray[i] + " ");
        }
 
    }
    
}
    


    
