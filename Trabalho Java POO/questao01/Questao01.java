package questao01;

import java.time.LocalDate;

public class Questao01 {

    public static void main(String[] args) {
        LocalDate dataAtual = LocalDate.now();
        
        Pessoa p1 = new Pessoa();
        //Informando dados
        p1.setNome("Hebert");
        p1.setPeso(53);
        p1.setAltura(1.7f);
        p1.setDataNasc(LocalDate.of(1997, 8, 7));
        
        //Chamando metodos
        /*Metodo teste faz a chamada de todos os metodos do programa para 
        verificar se esta tudo funcionando*/
        
        p1.teste();
    }
}
