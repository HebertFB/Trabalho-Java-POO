package questao04;

public class Questao04 {

    public static void main(String[] args) {
        //iniciando objeto
        ControleRemoto controle = new ControleRemoto();

        //Informando dados e testando os metodos do programa
        controle.aumentarVolume();
        controle.aumentarVolume();
        controle.diminuirVolume();
        controle.mudarCanal(17);
        controle.info();
        controle.aumentarCanal();
        controle.aumentarCanal();
        controle.info();
        controle.diminuirCanal();
        controle.aumentarVolume();
        controle.info();
    }

}
