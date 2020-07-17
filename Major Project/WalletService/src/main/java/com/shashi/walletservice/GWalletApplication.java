package com.shashi.walletservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

//@EntityScan(
//		basePackageClasses = {GWalletApplication.class, Jsr310JpaConverters.class}
//)
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class GWalletApplication {

	public static void main(String[] args) {
		SpringApplication.run(GWalletApplication.class, args);
	}

}
