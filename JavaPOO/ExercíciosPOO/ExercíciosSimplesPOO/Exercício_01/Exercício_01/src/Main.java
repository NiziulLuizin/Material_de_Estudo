public class Main {
    
    public static void  main(String[] args){
        Pessoa p1 = new Pessoa();
        p1.setName("Luciana");
        p1.setAnoNascimento(1983);
        p1.setAltura(1.76f);

        p1.status();


        Pessoa p2 = new Pessoa();
        p1.setName("Luiza");
        p1.setAltura(1.87f);
        p1.setAnoNascimento(1998);

        p1.status();
    }
}
