package entities;

public class cliente {
    public String nome;
    private int cpf;
    private String pagamento;
    private String endereco;
    private int id;

    public cliente(){}
    public cliente(String nome, int cpf, String pagamento, String endereco, int id) {
        this.nome = nome;
        this.cpf = cpf;
        this.pagamento = pagamento;
        this.endereco = endereco;
        this.id = id;
    }

    public cliente( String nome,String endereco, String pagamento , int id) { // opção caso não infome cpf
        this.nome = nome;
        this.endereco = endereco;
        this.pagamento = pagamento;
        this.id = id;
    }
}
