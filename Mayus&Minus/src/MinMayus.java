
public class MinMayus {
	
	public static String MintoMayus(String string){
		
	      char[] charArr = string.toCharArray();
	      for(int i = 0; i < charArr.length; i++){
	         if(Character.isLowerCase(charArr[i])){
	            charArr[i] = Character.toUpperCase(charArr[i]);
	         }
	         else{
	            charArr[i] = Character.toLowerCase(charArr[i]);
	         }
	      }
	      System.out.print(charArr);
	      return new String(charArr);
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MintoMayus("Hola moRRos");
	}

}
