package ru.otr.auth.service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.otr.auth.service.dto.AuthResponse;
import ru.otr.auth.service.dto.LoginDto;
import ru.otr.auth.service.property.LoginProperty;

@Service
@RequiredArgsConstructor
public class BaseLoginService implements LoginService{

    private final RestTemplate restTemplate;
    private final LoginProperty loginProperty;

    @Override
    public String getToken(LoginDto login) {
        return getAuthResponse(login).getAccessToken();
    }

    //TODO: обработка ошибок при авторизации
    private AuthResponse getAuthResponse(LoginDto loginDto) {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        ResponseEntity<AuthResponse> objectResponseEntity = restTemplate.postForEntity(
                loginProperty.getUrl().getBase() + loginProperty.getUrl().getLogin(),
                new HttpEntity<>(loginDto.getCredentials(), headers), AuthResponse.class);

        return objectResponseEntity.getBody();
    }
}
