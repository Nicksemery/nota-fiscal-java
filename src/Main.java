
public class Main {
    public static void main(String[] args) {

        Produto p1 = new Produto("PC POSITIVO",1,  3000);
        Produto p2 = new Produto("Mouse Gamer",1,50);
        Produto p3 = new Produto("Teclado brabo",1,100);
        Cliente c = new Cliente("Pedro","400.289.222-65");
        NotaFiscal n = new NotaFiscal();

        n.adicionarCliente(c);
        n.adicionaProduto1(p1);
        n.adicionaProduto2(p2);
        n.adicionaProduto3(p3);

        n.ExibirNota();


    }
}