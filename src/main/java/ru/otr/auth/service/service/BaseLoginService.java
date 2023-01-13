package ru.otr.auth.service.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import ru.otr.auth.service.dto.LoginDto;
import ru.otr.auth.service.property.LoginProperty;

@Service
@RequiredArgsConstructor
public class BaseLoginService implements LoginService{

    private final RestTemplate restTemplate;
    private final LoginProperty loginProperty;

    @Override
    /*TODO дописать*/
    public String getToken(LoginDto loginDto) {
        Long s = 5L;
        return null;
    }
}
