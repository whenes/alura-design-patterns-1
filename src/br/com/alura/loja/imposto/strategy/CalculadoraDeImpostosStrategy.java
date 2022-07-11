package br.com.alura.loja.imposto.strategy;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostosStrategy {
    public BigDecimal calcular(Orcamento orcamento, TipoImpostoStrategy tipoImpostoStrategy) {
        return tipoImpostoStrategy.calcular(orcamento);
    }
}
