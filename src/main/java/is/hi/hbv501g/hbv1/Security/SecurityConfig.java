package is.hi.hbv501g.hbv1.Security;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@EnableWebSecurity
public class SecurityConfig {
    private final LogoutHandler logoutHandler;

    public SecurityConfig(LogoutHandler logoutHandler) {
        this.logoutHandler = logoutHandler;
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.cors().and().csrf().disable();
        http.authorizeRequests()
                .mvcMatchers(HttpMethod.GET, "/api/**").permitAll() // allow all users to access the home pages and the static images directory
                .anyRequest().authenticated() // all other requests must be authenticated
//               .and().oauth2Login().defaultSuccessUrl("https://hbv1-framendi.herokuapp.com/")
                .and().oauth2Login().defaultSuccessUrl("https://localhost:5173")
                .and().logout()
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout")) // handle logout requests at /logout path
                .addLogoutHandler(logoutHandler); // customize logout handler to log out of Auth0
        return http.build();
    }
}