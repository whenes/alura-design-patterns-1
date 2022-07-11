package br.com.alura.loja.imposto.strategy;

import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public interface TipoImpostoStrategy {
    BigDecimal calcular(Orcamento orcamento);
}
