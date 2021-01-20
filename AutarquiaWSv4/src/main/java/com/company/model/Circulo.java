package com.company.model;

import com.company.exception.RaioInvalidoException;

public class Circulo extends Forma {
    
    private double raio;
    
    public Circulo(double raio) {
        setRaio(raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio (double raio) throws RaioInvalidoException {
        if (raio > 0) {
            this.raio = raio;
        } else {
            throw new RaioInvalidoException(raio + ": raio inválido");
        }
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio, 2);
    }
    
}
