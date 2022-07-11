package br.com.alura.loja.desconto;

import br.com.alura.loja.desconto.chainofresponsibility.Desconto;
import br.com.alura.loja.desconto.chainofresponsibility.DescontoParaOrcamentoComMaisDeCincoItens;
import br.com.alura.loja.desconto.chainofresponsibility.DescontoParaOrcamentoComValorMaiorQueQuinhentos;
import br.com.alura.loja.desconto.chainofresponsibility.SemDesconto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    public BigDecimal calcular(Orcamento orcamento) {
        Desconto desconto = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()));
        return desconto.calcular(orcamento);
    }
}
