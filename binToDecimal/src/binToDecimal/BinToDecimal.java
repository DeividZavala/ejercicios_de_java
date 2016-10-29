package binToDecimal;
//import java.lang.reflect.*;
public class BinToDecimal {
	
	/*public static int bintoDes(String[] s){
		int result = 0;
		for (int i = s.length-1 ;i>=0;i--){
			if(s[i] == "1"){
				result += (int)Math.pow((double)2,(double)i);
			}
		}
		System.out.print(result);
		return result;
	}*/
	
	public static int bintoDes(String[] s){
		
		int result = 0;
		for (int i = s.length-1 ;i >= 0;i--){
			if(s[i] == "1"){
				System.out.print(i);
				result += (int)Math.pow((double)2,(double)i);
			}
		}
		System.out.print("el resultado "+ result);
		return result;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] test = new String[]{"1","0"};
		bintoDes(test);
		
		
		
	}

}
