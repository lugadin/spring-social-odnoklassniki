package org.springframework.social.odnoklassniki.security;

import java.util.Map;

import org.springframework.social.odnoklassniki.api.Odnoklassniki;
import org.springframework.social.odnoklassniki.connect.OdnoklassnikiConnectionFactory;
import org.springframework.social.security.provider.OAuth2AuthenticationService;

public class OdnoklassnikiAuthenticationService extends
		OAuth2AuthenticationService<Odnoklassniki> {

	public OdnoklassnikiAuthenticationService(Map<String, String> parameters) {
		super(new OdnoklassnikiConnectionFactory(parameters.get("appId"),
				parameters.get("secretKey"), parameters.get("publicKey")));
	}
}
