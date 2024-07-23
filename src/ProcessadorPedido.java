public abstract class ProcessadorPedido {
    // Método Template
    public final void processarPedido() {
        selecionarItens();
        calcularFrete();
        pagamento();
        emitirNotaFiscal();
        enviarItens();
    }

    protected abstract void selecionarItens();
    protected abstract void calcularFrete();
    protected abstract void pagamento();
    protected abstract void emitirNotaFiscal();
    protected abstract void enviarItens();
}
