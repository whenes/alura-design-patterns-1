package br.com.alura.loja.pedido;

import br.com.alura.loja.orcamento.Orcamento;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;

public class GeraPedidoHandler {
    //Construtor com injeção de dependencias.

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQuantidadeItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        EnviarEmailPedido enviarEmailPedido = new EnviarEmailPedido();
        SalvarPedidoNoBancoDeDados salvarPedidoNoBancoDeDados = new SalvarPedidoNoBancoDeDados();

        enviarEmailPedido.executar(pedido);
        salvarPedidoNoBancoDeDados.executar(pedido);
    }
}
