package entities;

public class pedido {
    private int id_pedido;
    private String tamanho;
    private double preco;
    private String sabor1,sabor2,sabor3,sabor4;
    private String endereco;
    private String entrega;

    public pedido(){}
    public pedido(int id_pedido, String tamanho,double preco,String entrega,String endereco,
                  String sabor1, String sabor2, String sabor3, String sabor4) {
        this.id_pedido = id_pedido;
        this.tamanho = tamanho;
        this.preco = preco;
        this.sabor1 = sabor1;
        this.sabor2 = sabor2;
        this.sabor3 = sabor3;
        this.sabor4 = sabor4;
        this.entrega = entrega;
        this.endereco = endereco;
    }
    public void Identificacao(int id_cliente ){}
}
