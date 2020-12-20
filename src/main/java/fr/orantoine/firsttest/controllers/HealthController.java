package fr.orantoine.firsttest.controllers;


import fr.orantoine.firsttest.services.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/health")
public class HealthController {

    @Autowired
    private TestService testService;


    @GetMapping("ping")
    public ResponseEntity<String> pingController() {
        return new ResponseEntity<>("pong", HttpStatus.OK);
    }

    @GetMapping("test")
    public ResponseEntity<String> testController(@RequestParam String input) {
        return new ResponseEntity<>(testService.returnInput(input), HttpStatus.OK);
    }
}
