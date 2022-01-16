package mrk.klb.example.service;

import mrk.klb.example.core.model.UserDto;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private InMemoryUserDetailsManager userDetailsService;

    public UserService(InMemoryUserDetailsManager userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    public boolean validateUser(String username) {
       return userDetailsService.userExists(username);
    }

    public void createUser(UserDto userDto) {
        userDetailsService.createUser(usedDtoToUserDetails(userDto));
    }

    public boolean isUserUnique(String username) {
        return userDetailsService.userExists(username);
    }

    private UserDetails usedDtoToUserDetails(UserDto userDto) {
        return  User.withDefaultPasswordEncoder()
                .username(userDto.getUsername())
                .password(userDto.getPassword())
                .roles("USER")
                .build();
    }
}
