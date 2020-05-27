package webappservlet.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;
import webappservlet.controller.MyAuthenticationFailureHandler;
import webappservlet.controller.MyAuthenticationSuccessHandler;

import javax.sql.DataSource;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private DataSource dataSource;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                .antMatchers(
                        "/1",
                        "/login",
                        "/register",
                        "/js/**",
                        "/css/**",
                        "/img/**").permitAll()
                .antMatchers("/1").authenticated()
                .antMatchers("/create").authenticated()
                .anyRequest().authenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .successHandler(myAuthenticationSuccessHandler())
                .failureHandler(myAuthenticationFailureHandler())
                .and()
                .logout()
                .deleteCookies("JSESSIONID")
                .invalidateHttpSession(true)
                .clearAuthentication(true)
                .logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
                .logoutSuccessUrl("/1");
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.jdbcAuthentication().dataSource(dataSource)
                .usersByUsernameQuery("Select username, password, author_id from user where username=?")
                .authoritiesByUsernameQuery("Select username, role from user where username=?")
                .passwordEncoder(bCryptPasswordEncoder);
    }

    @Bean
    public AuthenticationSuccessHandler myAuthenticationSuccessHandler() {
        return new MyAuthenticationSuccessHandler();
    }

    @Bean
    public AuthenticationFailureHandler myAuthenticationFailureHandler() {
        return new MyAuthenticationFailureHandler();
    }

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}