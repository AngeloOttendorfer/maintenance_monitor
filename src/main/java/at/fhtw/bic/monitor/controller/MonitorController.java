package at.fhtw.bic.monitor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MonitorController {
    private String message = "";

    @GetMapping("api/message/status")
    public String retrieveMessage(){
        return message;
    }
}
