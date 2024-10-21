package com.ikeda.teste;
import java.util.*;
public class CarrosManager {
    private List<Carro> carros;
    public CarrosManager() {
        this.carros = new ArrayList<>();
        this.carros.add(new Carro("Fusca", "Volkswagen"));
        this.carros.add(new Carro("Gol", "Volkswagen"));
    }
    public List<Carro> getCarros() {
        return carros;
    }
    
}
