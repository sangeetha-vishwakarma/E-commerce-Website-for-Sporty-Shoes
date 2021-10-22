package sportyshoe;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
        String rawpassword = "password";
        String encodedpassword =encoder.encode(rawpassword);
        System.out.println(encodedpassword);
        
	}

}
