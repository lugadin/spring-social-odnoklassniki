# spring-social-odnoklassniki
Spring social OAuth authentication for odnoklassniki.ru

Using of the plugin:
Define bean in some Spring xml context file:

	<bean id="connectionFactoryLocator" class="org.springframework.social.connect.support.ConnectionFactoryRegistry">
        <property name="connectionFactories">
            <list>                
                <bean class="org.springframework.social.odnoklassniki.connect.OdnoklassnikiConnectionFactory">
                    <constructor-arg value="${odnoklassniki.clientId}" />
                    <constructor-arg value="${odnoklassniki.clientSecret}" />
                    <constructor-arg value="${odniklassniki.applicationKey}" />
                </bean>
            </list>
        </property>
    </bean>

	
	
