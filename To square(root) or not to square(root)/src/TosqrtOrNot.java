
public class TosqrtOrNot {

	public static int[] squareOrSquareRoot(int[] array)
	  {
	    int len = array.length;
	      
	      for (int i = 0; i < len; i++) {    
	        if (Math.sqrt(array[i]) % 1.0 == 0.0) {  
	          array[i] = (int) Math.sqrt(array[i]);
	        } else {
	          array[i] = array[i] * array[i] ;
	        }
	      }
	      for (int i=0;i < array.length;i++){
	    	  	System.out.print(","+array[i]);
	      }
	      return array;
	    
	  }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input = new int[] { 4, 3, 9, 7, 2, 1 };
		squareOrSquareRoot(input);
	}
	
	//{ 4, 3, 9, 7, 2, 1 }
	//{ 2, 9, 3, 49, 4, 1}
	
	
	
	
	

}
