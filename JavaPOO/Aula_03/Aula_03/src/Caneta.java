public class Caneta {
    //Atributos:
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

	//Métodos:
    public void status() {
        System.out.println("O modelo da caneta: " + this.modelo);
        System.out.println("Uma caneta da cor: " + this.cor);
        System.out.println("Tamanho da ponta: " + this.ponta);
        System.out.print("A carga da caneta está em: " + this.carga + "% portanto,");
        if (carga == 100) {
            System.out.println(" está com a carga cheia!");
        }else if (carga >= 50 && carga < 100){
            System.out.println(" a carga está começando a ficar vazia!");
        }else if(carga < 50 && carga >= 15){
            System.out.println( " a carga está um pouco vazia!");
        }else if (carga < 15 && carga >= 1){
            System.out.println(" está praticamente vazia!");
        }else if (carga == 0){
            System.out.println(" a caneta está sem tinta!");
        }
        System.out.print("Está tampada: ");
        if (tampada == true){
            tampar();
        }else {
            destampar();
        }
        
    }

    public void rabiscar(){
        if (this.tampada == true || this.carga == 0) {
            System.out.println("Erro! Não posso rabiscar!");
        }else {
            System.out.println("Rabiscando...");
        }
    }

    public void tampar() {
        this.tampada = true;
        System.out.println("Sim!");
        System.out.println("-----------");
    }

    public void destampar() {
        this.tampada = false;
        System.out.println("Não!");
        System.out.println("-----------");
    }
}
