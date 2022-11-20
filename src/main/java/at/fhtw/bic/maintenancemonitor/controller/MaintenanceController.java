package at.fhtw.bic.maintenancemonitor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class MaintenanceController {

    @GetMapping("/hi")
    public int maintMessage(){
        int i = 5;
        return i;
    }

}
