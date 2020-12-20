package fr.orantoine.firsttest.services;


import io.micrometer.core.annotation.Timed;
import org.springframework.stereotype.Service;

@Service
public class TestService {



    @Timed(description = "Time spent return input")
    public String returnInput(String input){
        return input;
    }
}
