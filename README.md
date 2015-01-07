# spring-social-odnoklassniki
Spring social OAuth authentication for odnoklassniki.ru

Using of the plugin:
Define bean in some Spring xml context file:

	<bean id="connectionFactoryLocator" class="org.springframework.social.security.SocialAuthenticationServiceRegistry">
		<property name="authenticationServices">
			<list>
				<bean class="org.springframework.social.odnoklassniki.security.OdnoklassnikiAuthenticationService">
					<constructor-arg>
						<map>
							<entry>
								<key>
									<value>appId</value>
								</key>
								<value>${odnoklassniki.appId}</value>
							</entry>
							<entry>
								<key>
									<value>secretKey</value>
								</key>
								<value>${odnoklassniki.secretKey}</value>
							</entry>
							<entry>
								<key>
									<value>publicKey</value>
								</key>
								<value>${odnoklassniki.publicKey}</value>
							</entry>
						</map>
					</constructor-arg>
				</bean>
				<bean class="org.springframework.social.vkontakte.security.VKontakteAuthenticationService">
					<constructor-arg type="java.lang.String" value="${vkontakte.consumerKey}" />
					<constructor-arg type="java.lang.String" value="${vkontakte.consumerSecret}" />
				</bean>
				<bean class="org.springframework.social.facebook.security.FacebookAuthenticationService">
					<constructor-arg type="java.lang.String" value="${facebook.clientId}" />
					<constructor-arg type="java.lang.String" value="${facebook.clientSecret}" />
				</bean>
			</list>
		</property>
	</bean>

	
	
