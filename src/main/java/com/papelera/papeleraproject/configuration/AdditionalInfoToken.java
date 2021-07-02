package com.papelera.papeleraproject.configuration;

import com.papelera.papeleraproject.account.model.User;
import com.papelera.papeleraproject.account.service.module.UserModuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.common.DefaultOAuth2AccessToken;
import org.springframework.security.oauth2.common.OAuth2AccessToken;
import org.springframework.security.oauth2.provider.OAuth2Authentication;
import org.springframework.security.oauth2.provider.token.TokenEnhancer;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AdditionalInfoToken implements TokenEnhancer {

    @Autowired
    private UserModuleService userModuleService;

    @Override
    public OAuth2AccessToken enhance(OAuth2AccessToken accessToken, OAuth2Authentication authentication) {
        User user = new User();
        try {
            user = userModuleService.findUserByUsername(authentication.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        Map<String, Object> info = new HashMap<>();
        info.put("user-name", user.getUserName());
        info.put("user-email", user.getEmail());
        info.put("user-full-name", user.getName());
        info.put("user-date-from", user.getUserDateFrom());
        info.put("user-date-to", user.getUserDateTo());
        ((DefaultOAuth2AccessToken) accessToken).setAdditionalInformation(info);
        return accessToken;
    }
}
