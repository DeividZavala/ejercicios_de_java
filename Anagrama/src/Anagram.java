import java.util.*;

public class Anagram {
	
	public static boolean esAnagram(String test, String original) {
	    if( test == null || original == null || test.length() != original.length())
	      return false;
	      
	    char ch1 [] = test.toLowerCase().toCharArray(); 
	    char ch2 [] = original.toLowerCase().toCharArray(); 
	    
	    Arrays.sort(ch1);
	    Arrays.sort(ch2);
	    
	    if(Arrays.equals(ch1, ch2)){
	    		System.out.print("Anagrama");
	    }else{
	    		System.out.print("No es un Anagrama");
	    }
	    return Arrays.equals(ch1, ch2);
	    
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		esAnagram("mora","rora");
	}

}
