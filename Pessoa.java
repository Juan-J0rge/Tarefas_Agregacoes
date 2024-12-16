package Atividade;

public abstract class Pessoa {

    private String NomeESobrenome;
    private Integer idade;
    private Long cpf;

    public String getNomeESobrenome() {
        return NomeESobrenome;
    }

    public void setNomeESobrenome(String nomeESobrenome) {
        NomeESobrenome = nomeESobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }
}
