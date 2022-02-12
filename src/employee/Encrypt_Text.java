package employee;

import java.security.Key;
import java.util.Base64;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;

public class Encrypt_Text {
    private static final String ALGORITHM = "AES";
    private static final byte[] keyValue = "1234567891234567".getBytes();

    public String encrypt(String valueToEnc) throws Exception {
        Key key = new SecretKeySpec(keyValue, ALGORITHM);
        Cipher cipher = Cipher.getInstance(ALGORITHM);
        cipher.init(Cipher.ENCRYPT_MODE, key);

        byte[] encValue = cipher.doFinal(valueToEnc.getBytes());
        byte[] encryptedByteValue = Base64.getEncoder().encode(encValue);
        System.out.println("Encrypted Value :: " + new String(encryptedByteValue));
        return new String(encryptedByteValue);
    }
}
