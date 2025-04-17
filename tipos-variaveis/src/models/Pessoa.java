package models;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Pessoa {

    private String nomeCompleto;
    private String apelido;
    private int idade;
    private double altura;
    private double peso;
    char sexo;
    boolean doadorOrgaos;
    Date dataNascimento = new Date();

    public Pessoa(String nomeCompleto, String apelido, int idade, double altura, double peso, char sexo,
            boolean doadorOrgaos, Date dataNascimento) {
        this.nomeCompleto = nomeCompleto;
        this.apelido = apelido;
        this.idade = idade;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.doadorOrgaos = doadorOrgaos;
        this.dataNascimento = dataNascimento;
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

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public boolean isDoadorOrgaos() {
        return doadorOrgaos;
    }

    public void setDoadorOrgaos(boolean doadorOrgaos) {
        this.doadorOrgaos = doadorOrgaos;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String toString() {
        String pesString = "Dados Principais: ";
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

    public void atualizarIdade() {

        Date dataAtual = new Date();
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(dataAtual);
        int anoAtual = calendar.get(Calendar.YEAR);
        int mesAtual = calendar.get(Calendar.MONTH) + 1;
        int diaAtual = calendar.get(Calendar.DAY_OF_MONTH);

        if ((anoAtual - dataNascimento.getYear()) != idade) {

            if (mesAtual > dataNascimento.getMonth()) {
                idade = (anoAtual - dataNascimento.getYear());
            } else if (mesAtual == dataNascimento.getMonth()) {
                if (diaAtual >= dataNascimento.getDay()) {
                    idade = (anoAtual - dataNascimento.getYear());
                }
            } else {
                idade = (anoAtual - dataNascimento.getYear()) - 1;
            }
        }
    }
}
