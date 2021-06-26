public class Aula3 {
    public static void main(String[] args){
    //Primeira caneta:
        Caneta c1 = new Caneta();
        c1.modelo = "bic cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f; 
        c1.carga = 10;
        //c1.tampada = false;
        c1.tampar();
        c1.status();
        c1.rabiscar();
    }
}
