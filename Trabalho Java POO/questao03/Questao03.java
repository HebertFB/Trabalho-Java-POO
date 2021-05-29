package questao03;

public class Questao03 {

    public static void main(String[] args) {
        Elevador elevador = new Elevador(10, 8);
        
        //Informando dados e testando os metodos do programa
        elevador.entra(3);
        elevador.sobe(3);
        elevador.sai(2);
        elevador.desce(1);
        elevador.entra(4);

    }
    
}
