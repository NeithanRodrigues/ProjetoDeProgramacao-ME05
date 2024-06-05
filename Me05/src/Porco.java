public class Porco extends Animal implements Pesado, Cor {
    @Override
    public void setCor(String cor) {
        this.cor = cor;
        System.out.println("Seu porco é " + cor);
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
        System.out.println("Seu porco pesa: " + peso);
    }
}
