public class Aula4 {
    
    public static void main(String[] args){
        Caneta c1 = new Caneta("NIC", "Amarela", 0.5f);
        c1.status();

        Caneta c2 = new Caneta("Strint", "Vermelha", 0.3f);
        c2.status();
        /*
        Caneta c1 = new Caneta();
        c1.status();
         
        c1.setModelo("Bic");
        //c1.modelo = "Bic";

        c1.setPonta(1.0f);
        //c1.ponta = 1.0f;

        //c1.status();
        System.out.println("Tenho uma caneta " + c1.getModelo() + ", de ponta " + c1.getPonta());
        */

    }
}
