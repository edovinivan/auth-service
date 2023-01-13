package ru.otr.auth.service.property;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties(
        prefix = "org.keycloak"
)
@Getter
@Setter
public class LoginProperty {

    @NestedConfigurationProperty
    private Url url;

    @Getter
    @Setter
    public static class Url {
        private String base;
        private String login;
    }

}
