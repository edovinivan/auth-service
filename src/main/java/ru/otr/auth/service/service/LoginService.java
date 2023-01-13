package ru.otr.auth.service.service;

import ru.otr.auth.service.dto.LoginDto;

public interface LoginService {

    String getToken(LoginDto loginDto);

}
