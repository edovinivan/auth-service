package ru.otr.auth.service.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

@Data
@NoArgsConstructor
public class LoginDto {

    @JsonProperty("client_id")
    private String clientId;
    @JsonProperty("username")
    private String username;
    @JsonProperty("password")
    private String password;
    @JsonProperty("grant_type")
    private String grantType = "password";

    @JsonIgnore
    public MultiValueMap<String, String> getCredentials(){
        MultiValueMap<String, String> credentials = new LinkedMultiValueMap();
        credentials.add("client_id", clientId);
        credentials.add("username", username);
        credentials.add("password", password);
        credentials.add("grant_type", grantType);
        return credentials;
    }

}
