package entities;

public class cliente {
    public String nome;
    private String endereco;
    private int id;

    public cliente(){}
    public cliente( String nome,String endereco, int id) { // opção caso não infome cpf
        this.nome = nome;
        this.endereco = endereco;
        this.id = id;
    }
}
