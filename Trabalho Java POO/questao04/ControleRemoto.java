package questao04;

public class ControleRemoto extends Televisao {
    //Atributos
    private int volumeMaximo =100;
    private int canalMaximo = 50;
    private int volumeAtual;
    private int canalAtual;
    //Metodos
    //Metodo para aumentar volume
    public void aumentarVolume(){
        this.volumeAtual = this.getVolumeTV();
        if(this.volumeAtual < this.volumeMaximo){
            this.volumeAtual++;
            this.setVolumeTV(volumeAtual);
            System.out.println("Volume aumentado: " + this.volumeAtual);
        }else{
            System.out.println("Volume ja esta no limite maximo!");
        }
    }
    //Metodo para diminuir volume
    public void diminuirVolume(){
        this.volumeAtual = this.getVolumeTV();
        if(this.volumeAtual < this.volumeMaximo){
            this.volumeAtual--;
            this.setVolumeTV(volumeAtual);
            System.out.println("Volume diminuido: " + this.volumeAtual);
        }else{
            System.out.println("Volume ja esta no limite maximo!");
        }
    }
    //Metodo para aumentar canal
    public void aumentarCanal(){
        this.canalAtual = this.getCanalTV();
        if(this.canalAtual < this.canalMaximo){
            this.canalAtual++;
            this.setCanalTV(canalAtual);
            System.out.println("Canal aumentado: " + this.canalAtual);
        }else{
            System.out.println("Ja esta no ultimo canal!");
        }
    }
    //Metodo para diminuir canal
    public void diminuirCanal(){
        this.canalAtual = this.getCanalTV();
        if(this.canalAtual < this.canalMaximo){
            this.canalAtual--;
            this.setCanalTV(canalAtual);
            System.out.println("Canal diminuido: " + this.canalAtual);
        }else{
            System.out.println("Ja esta no ultimo canal!");
        }
    }
    //Metodo para mudar canal
    public void mudarCanal(int canal){
        this.canalAtual = this.getCanalTV();
        if(this.canalAtual == canal){
            System.out.println("Canal escolhido igual ao atual: " + this.canalAtual);
        }else if(this.canalAtual < this.canalMaximo){
            this.setCanalTV(canal);
        }else{
            System.out.println("Canal escolhido e invalido!");
        }
    }
    //Metodo para obter informacoes do canal e volume atual
    public void info(){
        System.out.println("\n***INFORMACOES***");
        System.out.println("Canal atual: " + this.getCanalTV());
        System.out.println("Volume atual: " + this.getVolumeTV());
        System.out.println(" ");
    }
    //Getters e Setters
    public int getVolumeMaximo() {
        return volumeMaximo;
    }
    
    public int getCanalMaximo() {
        return canalMaximo;
    }
}
