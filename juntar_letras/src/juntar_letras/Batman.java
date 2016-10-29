package juntar_letras;

public class Batman {
	
	public static String tresLetras(String one, String two, String three) {
	    String result = "";
	    for (int i = 0; i < one.length(); ++i) {
	      result = result + one.charAt(i) + two.charAt(i) + three.charAt(i);
	    }
	    System.out.print(result);
	    return result;
	  }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String uno = "Bm";
		String dos = "aa";
		String tres = "tn";
		tresLetras(uno,dos,tres);
	}

}
