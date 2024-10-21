package com.ikeda.teste;

import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.GetMapping;
import java.util.*;

@RestController
@RequestMapping("api/carros")
public class CarroController {
    private final CarrosManager carrosManager = new CarrosManager();

    @GetMapping
    public List<Carro> all() {
        return carrosManager.getCarros();
    }
}