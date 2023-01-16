package ru.otr.auth.service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otr.auth.service.dto.LoginDto;
import ru.otr.auth.service.service.LoginService;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @PostMapping(value = "/login")
    public String getToken(@RequestBody LoginDto loginDto){
        return loginService.getToken(loginDto);
    }

}
