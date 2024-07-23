public class PedidoLojaFisica extends ProcessadorPedido {
    @Override
    protected void selecionarItens() {
        System.out.println("Selecionando itens na loja física");
    }

    @Override
    protected void calcularFrete() {
        System.out.println("Calculando frete para entrega a domicílio");
    }

    @Override
    protected void pagamento() {
        System.out.println("Processando pagamento no caixa");
    }

    @Override
    protected void emitirNotaFiscal() {
        System.out.println("Emitindo nota fiscal em papel");
    }

    @Override
    protected void enviarItens() {
        System.out.println("Entregando itens diretamente ao cliente");
    }
}
