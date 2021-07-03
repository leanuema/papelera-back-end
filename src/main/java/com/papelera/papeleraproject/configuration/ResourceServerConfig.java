package com.papelera.papeleraproject.configuration;

import com.papelera.papeleraproject.account.endpoint.UserEndPoint;
import com.papelera.papeleraproject.account.endpoint.UserRoleEndPoint;
import com.papelera.papeleraproject.configuration.enumerator.OriginsEnum;
import com.papelera.papeleraproject.configuration.enumerator.UserRoleEnum;
import com.papelera.papeleraproject.product.endpoint.ProductEndPoint;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.ResourceServerConfigurerAdapter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
@EnableResourceServer
public class ResourceServerConfig extends ResourceServerConfigurerAdapter {

    @Override
    public void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests().
                antMatchers(HttpMethod.GET,
                        ProductEndPoint.BASE_URL + ProductEndPoint.GET_ALL_PRODUCT,
                        ProductEndPoint.BASE_URL + ProductEndPoint.GET_PRODUCT_BY_ID + ProductEndPoint.GET_PRODUCT_BY_ID_PARAM,
                        ProductEndPoint.BASE_URL + ProductEndPoint.SEARCH_PRODUCT,
                        ProductEndPoint.BASE_URL + ProductEndPoint.GET_ALL_ALUMINUM_PRODUCT,
                        ProductEndPoint.BASE_URL + ProductEndPoint.GET_ALL_CARDBOARD_PRODUCT,
                        ProductEndPoint.BASE_URL + ProductEndPoint.GET_ALL_OTHER_PRODUCT,
                        ProductEndPoint.BASE_URL + ProductEndPoint.GET_ALL_PAPER_PRODUCT,
                        ProductEndPoint.BASE_URL + ProductEndPoint.GET_ALL_PLASTIC_PRODUCT).permitAll()
                .antMatchers(HttpMethod.GET,
                        UserEndPoint.BASE + UserEndPoint.FIND_USER_BY_ID + UserEndPoint.FIND_USER_BY_ID_PARAM).
                hasAnyRole(UserRoleEnum.ADMIN.getDescription(), UserRoleEnum.USER.getDescription())
                .antMatchers(UserEndPoint.ALL_OTHER_END_POINT,
                        ProductEndPoint.ALL_OTHER_END_POINT,
                        UserRoleEndPoint.ALL_OTHER_END_POINT).hasRole(UserRoleEnum.ADMIN.getDescription())
                /*Cuando este el servicio de compra y agregar al carrito se implementan estos endpoints
                .antMatchers("/comprar", "/agregar-al-carrito").authenticated()*/
                .anyRequest().authenticated().and().cors().configurationSource(corsConfigurationSource());
    }

    @Bean
    public CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        configuration.setAllowedOrigins(Arrays.asList(OriginsEnum.LOCAL_HOST.getClient(),
                OriginsEnum.HEROKU_CLIENT.getClient()));
        configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "OPTIONS"));
        configuration.setAllowCredentials(Boolean.TRUE);
        configuration.setAllowedHeaders(Arrays.asList("Content-Type", "Authorization"));

        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        Map<String, CorsConfiguration> corsConfigurationMap = new HashMap<>();
        corsConfigurationMap.put("/**", configuration);
        source.setCorsConfigurations(corsConfigurationMap);
        return source;
    }

    @Bean
    public FilterRegistrationBean<CorsFilter> corsFilterFilterRegistrationBean() {
        FilterRegistrationBean<CorsFilter> registrationBean =
                new FilterRegistrationBean<>(new CorsFilter(corsConfigurationSource()));
        registrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        return registrationBean;
    }
}
