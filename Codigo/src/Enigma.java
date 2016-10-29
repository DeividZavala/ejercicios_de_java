
public class Enigma {
	
	static final String S1 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";  // coded
    static final String S2 = "hijklmnopqrstuvwxyzabcdefgHIJKLMNOPQRSTUVWXYZABCDEFG";  // decoded

    public static String Turing(String codedMessage){
        String decoded = "";
        for (char c : codedMessage.toCharArray()) {
          int idx = S1.indexOf(c);
          decoded += (idx >= 0) ? S2.charAt(idx) : c;
        }
        System.out.print(decoded);
        return decoded;
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Turing("t oxk lb kbytl");
	}

}
