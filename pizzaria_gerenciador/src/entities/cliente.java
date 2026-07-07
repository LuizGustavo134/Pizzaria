package entities;

import java.util.Calendar;

public class cliente {
    public String nome;
    private int cpf;
    private String pagamento;
    private String endereço;

    public cliente(){}
    public cliente(String nome, int cpf, String pagamento, String endereço) {
        this.nome = nome;
        this.cpf = cpf;
        this.pagamento = pagamento;
        this.endereço = endereço;
    }

}
