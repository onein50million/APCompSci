import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class hashtest {

	public static void main(String[] args) {

		byte[] data = "password".getBytes();
		
		MessageDigest md;
		try {
			md = MessageDigest.getInstance("SHA-256");
			md.update(data);
			byte[] hash = md.digest();
			String s = new String(hash);
			System.out.println(hash);
			
		} catch (NoSuchAlgorithmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
