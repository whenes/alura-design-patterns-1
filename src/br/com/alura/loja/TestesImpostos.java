package br.com.alura.loja;

import br.com.alura.loja.imposto.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.TipoImposto;
import br.com.alura.loja.imposto.strategy.CalculadoraDeImpostosStrategy;
import br.com.alura.loja.imposto.strategy.ICMSStrategy;
import br.com.alura.loja.imposto.strategy.ISSStrategy;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        //Teste sem Strategy
        Orcamento orcamento = new Orcamento(new BigDecimal("100"));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();
        System.out.println(calculadora.calcular(orcamento, TipoImposto.ISS));

        //Teste com Strategy
        CalculadoraDeImpostosStrategy calculadoraDeImpostosStrategy = new CalculadoraDeImpostosStrategy();
        System.out.println(calculadoraDeImpostosStrategy.calcular(orcamento, new ISSStrategy()));
        System.out.println(calculadoraDeImpostosStrategy.calcular(orcamento, new ICMSStrategy()));
    }
}
