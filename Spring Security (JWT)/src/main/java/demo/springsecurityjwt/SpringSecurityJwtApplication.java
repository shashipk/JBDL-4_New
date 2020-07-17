package demo.springsecurityjwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.core.context.SecurityContextHolder;

@SpringBootApplication
public class SpringSecurityJwtApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringSecurityJwtApplication.class, args);
	}

	@Autowired
	UserServiceRepository userServiceRepository;

	@Override
	public void run(String... args) throws Exception {
		userServiceRepository.save(new MyUserDetails("piyush", "pass1234", true, "admin"));
		userServiceRepository.save(new MyUserDetails("rahul", "rahul1234", true, "admin"));

	}
}