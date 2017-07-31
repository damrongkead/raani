import java.util.Random;

public class url_sta {
	public static void main(String[] args) {
	    final String alphabet = "0123456789ABCDEFGIHJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz=-";
	    final int N = alphabet.length();

	    Random r = new Random();

	    for (int i = 0; i < 50; i++) {
	        System.out.print(alphabet.charAt(r.nextInt(N)));
	    }
	}
	public static char randomSeriesForThreeCharacter() {
	    Random r = new Random();
	    char random_3_Char = (char) (48 + r.nextInt(47));
	    return random_3_Char;
	}
}
