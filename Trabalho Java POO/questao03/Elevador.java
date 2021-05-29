package questao03;

public class Elevador {
    //Atributos
    private int andarAtual;
    private int totalDeAndares;
    private int capacidadeDoElevador;
    private final int TERREO = 0;
    private int pessoasPresentes;
    private int quantidadeDePessoas;
    //Metodos
    public Elevador(int totalDeAndares, int capacidadeDoElevador) {
        this.totalDeAndares = totalDeAndares;
        this.capacidadeDoElevador = capacidadeDoElevador;
    }
    //Metodo entrar no elevador
    public void entra(int pessoaEntrou) {
        if (pessoasPresentes <= capacidadeDoElevador) {
            pessoasPresentes += pessoaEntrou;
            System.out.println("\nEntrou " + pessoaEntrou + " pessoa(s)!");
            System.out.println("Total de: " + pessoasPresentes + " pessoa(s) restante(s)!");
        } else {
            System.out.println("\nO elevador esta lotado!");
        }
    }
    //Metodo sair do elevador
    public void sai(int saiu) {
        if (pessoasPresentes <= 0) {
            System.out.println("\nO elevador esta vazio!!");
        } else {
            pessoasPresentes -= saiu;
            System.out.println("\nSaiu " + saiu + " pessoa(s)!"); 
            System.out.println("Total de: " + pessoasPresentes + " pessoa(s) restante(s)!");
        }
    }
    //Metodo subir o elevador
    public void sobe(int subi) {
        if (andarAtual == totalDeAndares) {
            System.out.println("\nImpossivel subir!! Pois o elevador ja se encontra no ultimo andar!");
        } else {
            andarAtual += subi;
            System.out.println("\nO Elevedor subiu para o andar: " + andarAtual);
            System.out.println("Andar anterior:" + (andarAtual - subi));
                    
        }
    }
    //Metodo descer o elevador
    public void desce(int desce) {
        if (andarAtual == TERREO) {
            System.out.println("\nImpossivel descer!! Pois o elevador ja se encontra no terreo!");
        } else {
            andarAtual -= desce;
            System.out.println("\nO Elevedor desceu para o andar: " + andarAtual);
            System.out.println("Andar anterior:" + (andarAtual + desce));
        }
}
    //Getters e Setters
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalDeAndares() {
        return totalDeAndares;
    }

    public void setTotalDeAndares(int totalDeAndares) {
        this.totalDeAndares = totalDeAndares;
    }

    public int getCapacidadeDoElevador() {
        return capacidadeDoElevador;
    }

    public void setCapacidadeDoElevador(int capacidadeDoElevador) {
        this.capacidadeDoElevador = capacidadeDoElevador;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }

    public int getQuantidadeDePessoas() {
        return quantidadeDePessoas;
    }

    public void setQuantidadeDePessoas(int quantidadeDePessoas) {
        this.quantidadeDePessoas = quantidadeDePessoas;
    }
}