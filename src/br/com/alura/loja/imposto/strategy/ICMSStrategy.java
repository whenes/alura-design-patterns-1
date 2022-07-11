package br.com.alura.loja.imposto.strategy;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMSStrategy implements TipoImpostoStrategy {
    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
