package com.shashi.userservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

//@EntityScan(
//		basePackageClasses = {GWalletApplication.class, Jsr310JpaConverters.class}
//)
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
@EnableSwagger2
public class GWalletApplication {

    private static final String BASE_PACKAGE = "com.shashi.userservice.Controller";
	public static void main(String[] args) {
		SpringApplication.run(GWalletApplication.class, args);
	}

    /*
    Customizing swagger
 */
    @Bean
    public Docket swaggerConfiguration()
    {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))//It will allows Apis of this package only.
                .build();
    }

}
