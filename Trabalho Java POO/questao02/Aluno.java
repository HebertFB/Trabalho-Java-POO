package questao02;

public class Aluno {

    //Atributos
    private String matricula;
    private String nome;
    private double nota1Prova;
    private double nota2Prova;
    private double notaTrabalho;

    //Metodos
    //Este metodo ira imprimir todos dados do aluno
    public void status() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Matricula (RGM): " + this.getMatricula());
        System.out.printf("Nota da Prova 1: %.2f", this.getNota1Prova());
        System.out.printf("\nNota da Prova 2: %.2f", this.getNota2Prova());
        System.out.printf("\nNota do Trabalho: %.2f", this.getNotaTrabalho());
    }

    //Este metodo ira calcular a media final do aluno 
    public double calculaMedia() {
        return (((nota1Prova + nota2Prova) * 2.5) + (notaTrabalho * 2)) / 6;
    }
    //Este metodo ira calcular quanto o aluno precisa para a prova final
    public double calculaFinal() {
        double notaFinal = calculaMedia();
        if (notaFinal >= 6) {
            return 0;
        }
        return 6 - notaFinal;
    }
    //Metodo ira testar e chama os métodos acima
    public void teste() {
        status();
        System.out.println(" ");
        System.out.printf("Media: %.2f", this.calculaMedia());
        System.out.printf("\nO aluno precisa de %.2f para a Prova Final", this.calculaFinal());
        System.out.println("\nOBS: Caso apareca zero na Prova Final o aluno esta aprovado!!");
    }

    //Getters e Setters
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1Prova() {
        return nota1Prova;
    }

    public void setNota1Prova(double nota1Prova) {
        this.nota1Prova = nota1Prova;
    }

    public double getNota2Prova() {
        return nota2Prova;
    }

    public void setNota2Prova(double nota2Prova) {
        this.nota2Prova = nota2Prova;
    }

    public double getNotaTrabalho() {
        return notaTrabalho;
    }

    public void setNotaTrabalho(double notaTrabalho) {
        this.notaTrabalho = notaTrabalho;
    }

}
