public abstract class Animal extends Carro implements Pesado, Cor{
    public double peso;
    public String cor;
    public void emitirSom(){
        System.out.println("*Emitindo som...*");
    }
    public void obterPeso(double peso){
        setPeso(peso);
    }
    public void obterCor(String cor){
        setCor(cor);
    }
}
