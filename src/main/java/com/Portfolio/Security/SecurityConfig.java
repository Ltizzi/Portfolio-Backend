
package com.Portfolio.Security;

import com.Portfolio.Filter.CAuthCFilter;
import com.Portfolio.Filter.CAuthZFilter;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import static org.springframework.http.HttpMethod.DELETE;
import static org.springframework.http.HttpMethod.GET;
import static org.springframework.http.HttpMethod.OPTIONS;
import static org.springframework.http.HttpMethod.PATCH;
import static org.springframework.http.HttpMethod.POST;
import static org.springframework.http.HttpMethod.PUT;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import static org.springframework.security.config.http.SessionCreationPolicy.STATELESS;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;


@Configuration @EnableWebSecurity @RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter{
    
    private final UserDetailsService userDetailsService;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(bCryptPasswordEncoder);
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers(GET, "/persona/**", "/exp/**", "/edu/**", "/skill/**", "/proyecto/**");
        web.ignoring().antMatchers(POST, "/contacto/**");
//        web.ignoring().antMatchers( HttpMethod.OPTIONS, "/**" );
        
    }
    
    
 
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        CAuthZFilter caf = new CAuthZFilter(authenticationManagerBean());
        caf.setFilterProcessesUrl("/api/login");
        http.cors().and().csrf().disable();
  
        http.sessionManagement().sessionCreationPolicy(STATELESS);
        http.anonymous();
        http.authorizeHttpRequests().antMatchers(OPTIONS, "/**").permitAll();
        http.authorizeHttpRequests().antMatchers(GET, "/persona/ver","/edu/**", "/exp/**","/skill/**","/api/login/", "/proyecto/**").permitAll();
        http.authorizeHttpRequests().antMatchers(POST,  "/contacto/**").permitAll();
        http.authorizeHttpRequests().antMatchers(POST, "/persona/**", "/exp/**", "/edu/**", "/skill/**","/proyecto/**").hasAnyAuthority("ROLE_ADMIN");
        http.authorizeHttpRequests().antMatchers(GET,  "/contacto/**").hasAnyAuthority("ROLE_ADMIN");
        http.authorizeHttpRequests().antMatchers(DELETE, "/persona/**", "/exp/**", "/edu/**", "/skill/**","/proyecto/**", "/contacto/**").hasAnyAuthority("ROLE_ADMIN");
        http.authorizeHttpRequests().antMatchers(PATCH, "/persona/**", "/exp/**", "/edu/**", "/skill/**","/proyecto/**", "/contacto/**").hasAnyAuthority("ROLE_ADMIN");
        http.authorizeRequests().antMatchers(GET, "/api/user/**").hasAnyAuthority("ROLE_USER");
        http.authorizeRequests().antMatchers(POST, "/api/user/save/**").hasAnyAuthority("ROLE_ADMIN");
        http.authorizeRequests().anyRequest().authenticated();
        http.addFilter(caf);
        http.addFilterBefore(new CAuthCFilter(), UsernamePasswordAuthenticationFilter.class);
        
    }

    @Bean
    @Override
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }
     
    
    
    
    
}
