package com.manuelsenatore.security.security.Security;

import java.security.Key;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

// first type (String) is the attribute type
// second type, is the converted type
//@PropertySource(value="classpath:application.properties")
//@Configuration
@Converter
public class StringConverter implements AttributeConverter<String, String> {

//	creare un algoritmo di conversione che shifta le vocali di 3 caratteri e le consonanti di -3 caratteri e in piu concatenare un salt in chiaro all'inizio della stringa
//	ciao ->  EPICODExkih
	
//	@Value("${string_converter.secret}")
	private static final String ALGORITHM = "AES/ECB/PKCS5Padding";
			
	
	private static final byte[] KEY = "MySuperSecretKey".getBytes();

	@Override
	public String convertToDatabaseColumn(String clearString) {
		Key key = new SecretKeySpec(KEY, "AES");
		try {
			Cipher c = Cipher.getInstance(ALGORITHM);
			c.init(Cipher.ENCRYPT_MODE, key);
			return Base64.getEncoder().encodeToString((c.doFinal(clearString.getBytes())));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	@Override
	public String convertToEntityAttribute(String dbData) {
		Key key = new SecretKeySpec(KEY, "AES");
		try {
			Cipher c = Cipher.getInstance(ALGORITHM);
			c.init(Cipher.DECRYPT_MODE, key);
			return new String(c.doFinal(Base64.getDecoder().decode(dbData)));
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

}
