package ru.example.prometheustestapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.example.prometheustestapp.model.LocalDateWrapper;

import java.time.LocalDate;

@RestController
public class MainController {

    @GetMapping(path = "/")
    public LocalDateWrapper getCurrentServerTime() {
        return new LocalDateWrapper(LocalDate.now());
    }

    @GetMapping(path = "/task")
    public String doLongTask() {
        Double sum = .0;
        for (int i=0; i<500_000_000;i++){
            sum += i;
        }
        return "ok";
    }

}
