public class PedidoOnline extends ProcessadorPedido {
    @Override
    protected void selecionarItens() {
        System.out.println("Selecionando itens do carrinho de compras online");
    }

    @Override
    protected void calcularFrete() {
        System.out.println("Calculando frete para entrega online");
    }

    @Override
    protected void pagamento() {
        System.out.println("Processando pagamento online");
    }

    @Override
    protected void emitirNotaFiscal() {
        System.out.println("Emitindo nota fiscal eletrônica");
    }

    @Override
    protected void enviarItens() {
        System.out.println("Enviando itens pelo correio");
    }
}
