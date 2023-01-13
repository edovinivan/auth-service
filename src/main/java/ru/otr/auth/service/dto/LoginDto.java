package ru.otr.auth.service.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class LoginDto {

    private String clientId;
    private String userName;
    private String password;
    private String grantType = "password";

}
