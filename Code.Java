code:
-------------------------------------------------------------------------------------------------------------------------------------------------------

import java.util.*;
public class Main
{
    
    static Scanner sc= new Scanner(System.in);
	static int arr[]= new int[5];
	static int size= arr.length,i=0;
	
	   
	    
    public static int[] backward(int arr2[], int i){
        
        for(int j=i;j<arr2.length;j++){
            if(j==arr2.length-1){
                arr2[j]=0;
                break;
            }
            arr2[j]= arr2[j+1];
        }
        
        return arr2;
    }
    
	public static void main(String[] args) {

	    
	    for(int j=0;j<arr.length;j++){
	      arr[j]=sc.nextInt();
	    } 
	    while(true){
	        
	        if(arr[i]%2==0 && arr[i]!=0){
	            arr=backward(arr,i);
	            size--;
	        }else{
	            i++;
	        }
	        if(i==arr.length){
	            break;
	        }
	    }
	    
	    System.out.println("\n");
	    
	    for(int j=0;j<size;j++){
	      System.out.print(arr[j]+" ");
	    } 
		
	}
}


OutPut:


testcase 1:
7 6 7 5 4 //input

7 7 5 //output

testcase 2:
7 2 4 9 1 //input

7 9 1 //output
