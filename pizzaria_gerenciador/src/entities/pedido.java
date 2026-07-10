package entities;

public class pedido {
    private String nomePedido;
    private String tamanho;
    private double preço;
    private String sabor1,sabor2,sabor3,sabor4;
    private int id;
    private String destinoFinal;

    public pedido(){}
    public pedido(String nomePedido, String tamanho,double preço,String destinoFinal,
                  String sabor1, String sabor2, String sabor3, String sabor4, int id) {
        this.nomePedido = nomePedido;
        this.tamanho = tamanho;
        this.preço = preço;
        this.sabor1 = sabor1;
        this.sabor2 = sabor2;
        this.sabor3 = sabor3;
        this.sabor4 = sabor4;
        this.id = id;
        this.destinoFinal = destinoFinal;
    }
}
