package models;

public class Pessoa {

    private String nomeCompleto;
    private String apelido;
    private int idade;
    private float altura;

    public Pessoa(String nomeCompleto, String apelido, int idade, float altura) {
        this.nomeCompleto = nomeCompleto;
        this.apelido = apelido;
        this.idade = idade;
        this.altura = altura;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String toString() {
        String pesString = "Dados da Pessoa: ";
        pesString = pesString.concat("\nNome Completo: ");
        pesString = pesString.concat(nomeCompleto);
        pesString = pesString.concat("\nApelido: ");
        pesString = pesString.concat(apelido);
        pesString = pesString.concat("\nIdade: ");
        pesString = pesString.concat(String.valueOf(idade));
        pesString = pesString.concat("\nAltura: ");
        pesString = pesString.concat(String.valueOf(altura));

        return pesString;
    }
}
