public class ContaBanco {
    // Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    // Métodos personalizados
    public void estadoAtual(){
        System.out.println("--------------------------");
        System.out.println("Conta: " + getNumConta());
        System.out.println("Tipo: " + getTipo());
        System.out.println("Dono: " + getDono());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Status: " + getStatus());
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if ("CC".equals(t)){
            setSaldo(50);
        }else if("CP".equals(t)){
            setSaldo(150);
        }

        System.out.println("Conta aberta com sucesso!");
    }

    public void fecharConta(){
        if (getSaldo() > 0){
            System.out.println("Conta não pode ser fechada porque ainda tem dinheiro.");
        }else if(getSaldo() < 0){
            System.out.println("Conta não pode ser fechada pois tem débito.");
        }else{
            setStatus(false);
            System.out.println("Conta fechada com sucesso!");
        }
    }

    public void depositar(float v){
        if (getStatus()){
            setSaldo(getSaldo() + v);
            System.out.println("Depósito realizado na conta de " + getDono());
        }else{
            System.out.println("Impossível depositar em uma conta fechada!");
        }
    }

    public void sacar(float v){
        if (getStatus()){
            if (getSaldo() >= v){
                setSaldo(getSaldo() + v);
                System.out.println("Saque realizado na conta de " + getDono());
            }else{
                System.out.println("Saldo insuficiente para saque.");
            }
        }else{
            System.out.println("Impossível sacar de uma conta fechada!");
        }
    }

    /*
    // O método abaixo que o professo fez no vídeo, não é funcional.
    public void pagarMensal(){
        float vt;
        if ("CC".equals(getTipo())){
            vt = 12f;
        }else if("CP".equals(getTipo())){
            vt = 20f;
        }

        if (getStatus()){
            setSaldo(getSaldo() - vy);
            System.out.println("Mensalidade paga com sucesso por " + getDono());
        }else{
            System.out.println("Impossível pagar uma conta fechada!");
        }
    }
    */

    // Métodos especias
    public ContaBanco(){
        this.setSaldo(0);
        this.setStatus(false);
    }

    public void setNumConta(int n){
        this.numConta = n;
    }
    public int getNumConta(){
        return this.numConta;
    }

    public void setTipo(String tc){
        this.tipo = tc;
    }
    public String getTipo(){
        return this.tipo;
    }

    public void setDono(String nd){
        this.dono = nd;
    }
    public String getDono(){
        return this.dono;
    }

    public void setSaldo(float s){
        this.saldo = s;
    }
    public float getSaldo(){
        return this.saldo;
    }

    public void setStatus(boolean st){
        this.status = st;
    }
    public boolean getStatus(){
        return this.status;
    }
}
