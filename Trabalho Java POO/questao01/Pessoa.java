package questao01;

import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;

public class Pessoa {
    LocalDate dataAtual = LocalDate.now();
    DecimalFormat df = new DecimalFormat("#.00");
    //Atributos
    private String nome;
    private LocalDate dataNasc;
    private float peso;
    private float altura;
   
    //Metodos
    //Este metodo ira imprimir todos dados da pessoa
    public void status() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Data de Nascimento: " + this.getDataNasc());
        System.out.println("Peso: " + this.getPeso());
        System.out.println("Altura: " + this.getAltura());
    }

    //Este metodo ira calcular a idade da pessoa
     public int calculaIdade(LocalDate getDataNasc, LocalDate dataAtual) {
        if ((this.getDataNasc() != null) && (this.dataAtual != null)) {
            return Period.between(this.getDataNasc(), this.dataAtual).getYears();
        } else return 0;
    }

     //Este metodo ira calcular o IMC da pessoa
    public String calculaImc(float getPeso, float getAltura) {
        DecimalFormat df = new DecimalFormat("#.00");
        return df.format(this.getPeso()/(this.getAltura() * this.getAltura()));
    }
    
    //Metodo ira testar e chama os métodos acima
    public void teste() {
        status();
        System.out.println("Você tem: " + this.calculaIdade(dataNasc, dataAtual) + " Anos");
        System.out.println("IMC: " + this.calculaImc(peso, altura));
    }
    
    //Getters e Setters
    public DecimalFormat getDf() {
        return df;
    }

    public void setDf(DecimalFormat df) {
        this.df = df;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(LocalDate dataNasc) {
        this.dataNasc = dataNasc;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
}
