package com.eazybytes.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class ProjecrSecurityConfig {

	@Bean
	public SecurityFilterChain defaultSecurityFilterChain(HttpSecurity http)throws Exception{
		/*
		http.authorizeHttpRequests().anyRequest().authenticated();
			http.formLogin();
			http.httpBasic();
			return http.build();
		*/

		/*
		 *   Below is the custom security configurations
		 */
		 //  below code 19th video
		/*
			http.authorizeHttpRequests()
					.requestMatchers("/myAccount","myBalance","myLoans","myCards").authenticated()
		            .requestMatchers("notices","contact").permitAll()
					.and().formLogin()
					.and().httpBasic();
				return http.build();
*/
		/**
		 *   Configuration to deny all the requests
		 */
		//  below code 20th video
	/*
		http.authorizeHttpRequests().anyRequest().denyAll()
				.and().formLogin()
				.and().httpBasic();
		return http.build();
     */
		/**
		 *   Configuration to permit all the requests
		 */
		//  below code 21th video
		http.authorizeHttpRequests().anyRequest().permitAll()
				.and().formLogin()
				.and().httpBasic();
		return http.build();

	}


}
