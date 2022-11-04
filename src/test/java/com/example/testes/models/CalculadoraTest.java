package com.example.testes.models;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Before;    
    
public class CalculadoraTest {

    @Before
    public void setup(){

    }
        
    @Test
    public void test() {
        Calculadora calc = new Calculadora();
        int soma = calc.somar("1+1+3");
        assertEquals(5, soma); 
    }
    
}
    