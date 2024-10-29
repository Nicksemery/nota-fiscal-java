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
        return preco + 300;
    }

    @Override
    public double calcularJuros() {
        return preco + 60;
    }

    @Override
    public double calcularLucro() {
        return 450;
    }

    @Override
    public double calcularDesconto() {
        return preco - 150 ;
    }

    @Override
    public double calcularTaxaManuseiro() {
        return preco + 10;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco;
    }

    @Override
    public double calcularTotal() {
        return preco;
    }
}
