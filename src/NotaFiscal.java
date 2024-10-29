public class NotaFiscal {
    private Cliente cliente;
    private Produto produto1,produto2,produto3;


    public void adicionarCliente(Cliente cliente){
        this.cliente = cliente;
    }

    public void adicionaProduto1(Produto produto){
        this.produto1 = produto;
    }
    public void adicionaProduto2(Produto produto){
        this.produto2 = produto;
    }
    public void adicionaProduto3(Produto produto){
        this.produto3 = produto;
    }



    public void ExibirNota(){
        System.out.println("------------Nota Fiscal------------");
        System.out.println("Cliente: "+ cliente.getNome());
        System.out.println("CPF: "+cliente.getCPF());
        System.out.println(" ");
        System.out.println("Produtos:");
        System.out.println("- "+ produto1.getNome()+" | "+ "Categoria: ELETRONICO"+" | "+"Preço: "+produto1.getPreco()+ " | "+ "Quantidade: "+ produto1.getQuantidade()+ " | "+"Total: "+produto1.getPreco());
        System.out.println(" "+ "Imposto: "+produto1.calcularImposto()+" | "+ "Juros: "+produto1.calcularJuros()+" | "+"Lucro: "+produto1.calcularLucro()+" | "+"Desconto: "+produto1.calcularDesconto()+" | "+"Taxa de Manuseio: "+produto1.calcularTaxaManuseiro()+" | "+"Preço Final: "+produto1.calcularPrecoFinal());
        System.out.println("- "+ produto2.getNome()+" | "+ "Categoria: ELETRONICO"+" | "+"Preço: "+produto2.getPreco()+ " | "+ "Quantidade: "+ produto2.getQuantidade()+ " | "+"Total: "+produto2.getPreco());
        System.out.println(" "+ "Imposto: "+produto2.calcularImposto()+" | "+ "Juros: "+produto2.calcularJuros()+" | "+"Lucro: "+produto2.calcularLucro()+" | "+"Desconto: "+produto2.calcularDesconto()+" | "+"Taxa de Manuseio: "+produto2.calcularTaxaManuseiro()+" | "+"Preço Final: "+produto2.calcularPrecoFinal());
        System.out.println("- "+ produto3.getNome()+" | "+ "Categoria: ELETRONICO"+" | "+"Preço: "+produto3.getPreco()+ " | "+ "Quantidade: "+ produto3.getQuantidade()+ " | "+"Total: "+produto3.getPreco());
        System.out.println(" "+ "Imposto: "+produto3.calcularImposto()+" | "+ "Juros: "+produto3.calcularJuros()+" | "+"Lucro: "+produto3.calcularLucro()+" | "+"Desconto: "+produto3.calcularDesconto()+" | "+"Taxa de Manuseio: "+produto3.calcularTaxaManuseiro()+" | "+"Preço Final: "+produto3.calcularPrecoFinal());
        System.out.println("Valor Total da nota: "+(produto1.getPreco()+produto2.getPreco()+produto3.getPreco()));
        System.out.println("-----------------------------------");
    }

}
