public class Produto implements Calculavel{
    private String nome;
    private int quantidade;
    private double preco;

    public Produto(){}
    public Produto(String nome, int quantidade, double preco){
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularImposto() {
        return 0;
    }

    @Override
    public double calcularJuros() {
        return 0;
    }

    @Override
    public double calcularLucro() {
        return 0;
    }

    @Override
    public double calcularDesconto() {
        return 0;
    }

    @Override
    public double calcularTaxaManuseiro() {
        return 0;
    }

    @Override
    public double calcularPrecoFinal() {
        return 0;
    }

    @Override
    public double calcularTotal() {
        return 0;
    }
}
