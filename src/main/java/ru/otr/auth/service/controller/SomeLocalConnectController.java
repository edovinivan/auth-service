package ru.otr.auth.service.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.otr.auth.service.service.SomeService;

@RestController
@RequestMapping("/some")
@RequiredArgsConstructor
public class SomeLocalConnectController {

    private final SomeService someService;


    @GetMapping("/view")
    public String someview(){
        return someService.getSomeData();
    }
}
