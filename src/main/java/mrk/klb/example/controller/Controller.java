package mrk.klb.example.controller;

import mrk.klb.example.service.ControllerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Controller {
    private ControllerService controllerService;

    public Controller(ControllerService controllerService) {
        this.controllerService = controllerService;
    }

    @GetMapping("/greeting")
    public ResponseEntity<String> proceed(@RequestParam(value = "name", defaultValue = "Mark") String name) {
        return ResponseEntity.ok().body(controllerService.generateGreeting(name));
    }
}
