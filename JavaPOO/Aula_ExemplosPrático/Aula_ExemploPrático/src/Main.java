public class Main {
    
    public static void main(String[] args){
        CBanco c1 = new CBanco();
        c1.setDono("Luccas");
        c1.setNumConta(1203);
        c1.setTipo("cc");
        c1.abrirConta();
        c1.deposita(50f);
        c1.pagarMensal();
        c1.StatusC();
        
    }
}
