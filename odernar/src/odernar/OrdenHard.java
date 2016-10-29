package odernar;
import java.util.Arrays;

public class OrdenHard {
	
	public static Double[] sortItOut(Double[] array) {
	    Double[] sortedArray = new Double[array.length];
	    Arrays.sort(array);
	    int countOdd = 0;
	    int countEven = 0;
	    for(int i = 0; i < array.length; i++){
	      if(array[i].intValue() % 2 != 0){        
	        sortedArray[countOdd] = array[i];
	        countOdd++;
	      }
	    }    
	    for(int i = 0; i < array.length; i++){
	      if(array[i].intValue() % 2 == 0){
	        sortedArray[sortedArray.length - 1 - countEven] = array[i];
	        countEven++;
	      }
	    }
	    for(int i = 0;i<sortedArray.length; i++ ){
	    		System.out.print(i);
	    }
	    return sortedArray;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
