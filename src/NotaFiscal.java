public class NotaFiscal {
    private Cliente cliente;
    private Produto produto1,produto2,produto3;


    public void adicionarCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void adicionaProduto1(Produto produto){
        this.produto1 = produto;
    }
    public enum CategoriaProduto{
        ELETRONICO, ALIMENTO, PAPELARIA;
    }

}
