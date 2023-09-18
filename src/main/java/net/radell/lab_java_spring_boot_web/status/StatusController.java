package net.radell.lab_java_spring_boot_web.status;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping(value = "/", produces = "application/json")
    public StatusResponse index() {
        return new StatusResponse();
    }

}