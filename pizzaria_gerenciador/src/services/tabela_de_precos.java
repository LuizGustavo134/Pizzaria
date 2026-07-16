package services;

public class tabela_de_precos {
    private final double precoPequena = 25.00;
    private final double precoMedia = 35.00;
    private final double precoTamanhoFamilia = 45.00;
    private final double especialGigante = 50.00;
    private final double adicionalPorSabor= 0; // Valor somado por sabor 5.00
    private final double taxaEntrega = 0;          // 8.00 na entrega
    private final double Desconto = 10 + taxaEntrega; //calculo
    private Atendimento attP = new Atendimento();
    public tabela_de_precos(){}
    public void precificacao(int escolha){
    }

}
