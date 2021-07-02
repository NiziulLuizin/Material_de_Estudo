public class Lutador {
    private String nome;
    private String nacionalidade; 
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        setNome(no);
        setNacionalidade(na);
        setIdade(id);
        setAltura(al);
        setPeso(pe);
        setVitorias(vi);
        setDerrotas(de);
        setEmpates(em);
    }

    private void setNome(String n){
        this.nome = n;
    }
    private String getNome(){
        return this.nome;
    }

    private void setNacionalidade(String nc){
        this.nacionalidade = nc;
    }
    private String getNacionalidade(){
        return this.nacionalidade;
    }

    private void setIdade(int id) {
        this.idade = id;
    }
    private int getIdade() {
        return this.idade;
    }

    private void setAltura(float at){
        this.altura = at;
    }
    private float getAltura(){
        return this.altura;
    }

    private void setPeso(float ps){ 
        this.peso = ps;
        setCategoria();
    }
    private float getPeso(){
        return this.peso;
    }

    private void setCategoria(){
        if (getPeso() < 52.2){
            this.categoria = "Inválido";
        }else if(getPeso() <= 70.3){
            this.categoria = "Leve";
        }else if(getPeso() <= 83.9){
            this.categoria = "Médio";
        }else if(getPeso() <=120.2){
            this.categoria = "Pesado";
        }else{
            this.categoria = "Inválido";
        }

    }
    private String getCategoria(){
        return this.categoria;
    }

    private void setVitorias(int nv){
        this.vitorias = nv;
    }
    private int getVitorias(){
        return this.vitorias;
    }

    private void setEmpates(int ep) {
        this.empates = ep;
    }
    private int getEmpates() {
        return this.empates;
    }

    private void setDerrotas(int dr) {
        this.derrotas = dr;
    }
    private int getDerrotas() {
        return this.derrotas;
    }


    public void apresentar(){
        System.out.println("------------ Ultra Emoji Combat ------------");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " anos");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando " + getPeso() + "Kg");
        System.out.println("Ganhou: " + getVitorias());
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());

    }

    public void Status(){
        System.out.println("------------ Lutador ------------");
        System.out.println(getNome());
        System.out.println("é um peso " + getCategoria());
        System.out.println(getVitorias() + " vitórias");
        System.out.println(getDerrotas() + " derrotas");
        System.out.println(getEmpates() + " empates");
    }

    public void ganharLuta(){
         setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        setEmpates(getEmpates() + 1);
    }
}
