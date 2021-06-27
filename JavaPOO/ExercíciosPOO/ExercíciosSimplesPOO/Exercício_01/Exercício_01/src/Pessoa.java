public class Pessoa {
    private String name;
    private int anoNascimento;
    private float altura;
    
    public String getName(){
        return this.name;
    }

    public void setName(String n){
        this.name = n;
    }

    public int getAnoNascimento(){
        return this.anoNascimento;
    }

    public void setAnoNascimento(int dn){
        this.anoNascimento = dn;
    }

    public float getAltura(){
        return this.altura;
    }

    public void setAltura(float a){
        this.altura = a;
    }

    public void status(){
        System.out.println("Nome: " + this.getName());
        System.out.println("Data de nascimento: " + this.getAnoNascimento());
        System.out.println("Altura: " + this.getAltura());
        System.out.println("-----------");
    }

    // Não conseguir entender como calcular a idade da pessoa.
    /*
    public void idade(){
        int idade = this.getDateNascimento() - 2021;
        System.out.println("Idade: " + idade);
    }
    */
}
