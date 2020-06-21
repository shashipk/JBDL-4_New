package demo.springsecurityjwt;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UserServiceRepository extends JpaRepository<MyUserDetails, Integer> {

    public UserDetails findByUserName(String username);
}
