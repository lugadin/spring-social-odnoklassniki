package org.springframework.social.odnoklassniki.security;

import org.springframework.social.odnoklassniki.api.Odnoklassniki;
import org.springframework.social.odnoklassniki.connect.OdnoklassnikiConnectionFactory;
import org.springframework.social.security.provider.OAuth2AuthenticationService;

public class OdnoklassnikiAuthenticationService extends OAuth2AuthenticationService<Odnoklassniki> {
	
	private final static String publicKey = "CBAKGPJDEBABABABA";

	public OdnoklassnikiAuthenticationService(String appId, String secretKey) {
		super(new OdnoklassnikiConnectionFactory(appId, secretKey, publicKey));
	}
}
