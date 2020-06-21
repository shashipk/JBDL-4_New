package demo.springsecurityjwt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
class WebController {

    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private Utils jwtTokenUtil;

    @Autowired
    private MyUserDetailsService userDetailsService;

    @GetMapping(value = "/user" )
    public String firstPage(HttpServletRequest request) {
//        System.out.println(request.getHeader("Authorization"));
//        System.out.println(request.getCookies());
//        System.out.println(request.getAuthType());
        return "Hello Users";
    }

    @GetMapping("/home")
    public String homeRes(){
        return "this is visible to everyone";
    }

    @RequestMapping(value = "/authenticate", method = RequestMethod.POST)
    public AuthenticationResponse createAuthenticationToken(@RequestBody AuthenticationRequest authenticationRequest) throws Exception {

        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(authenticationRequest.getUsername(), authenticationRequest.getPassword())
            );
        }
        catch (BadCredentialsException e) {
            throw new Exception("Incorrect username or password", e);
        }


        final UserDetails userDetails = userDetailsService
                .loadUserByUsername(authenticationRequest.getUsername());

        final String jwt = jwtTokenUtil.generateToken(userDetails);

        return new AuthenticationResponse(jwt);
    }

}
