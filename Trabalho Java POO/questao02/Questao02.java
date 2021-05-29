package questao02;

public class Questao02 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        
        //Informando dados
        a1.setNome("Hebert");
        a1.setMatricula("2067336-1");
        a1.setNota1Prova(3.1);
        a1.setNota2Prova(5.8);
        a1.setNotaTrabalho(7.0);
        
        //Chamando metodos
        /*Metodo teste faz a chamada de todos os metodos do programa para 
        verificar se esta tudo funcionando*/
        a1.teste();

    }
    
}
