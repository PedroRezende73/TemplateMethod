public class Main {
    public static void main(String[] args) {
        ProcessadorPedido pedidoOnline = new PedidoOnline();
        pedidoOnline.processarPedido();

        ProcessadorPedido pedidoLojaFisica = new PedidoLojaFisica();
        pedidoLojaFisica.processarPedido();
    }
}