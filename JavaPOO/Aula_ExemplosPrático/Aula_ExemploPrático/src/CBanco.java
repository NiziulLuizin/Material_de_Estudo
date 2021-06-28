public class CBanco {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;
    
    public CBanco(){
        setStatus(true);
    }
    // Métodos especias
    public int getNumConta(){
        return this.numConta;
    }

    public void setNumConta(int nc){
        this.numConta = nc;
    }
    
    public String getTipo(){
        return this.tipo;
    }

    public void setTipo(String d){
        this.tipo = d;
    }

    public String getDono() {
        return this.dono;
    }
    
    public void setDono(String n) {
        this.dono = n;
    }

    public float getSaldo() {
        return this.saldo;
    }

    public void setSaldo(float s) {
        this.saldo = s;
    }
    
    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean n){
        this.status = n;
    }
    
    // Métodos
    public void StatusC(){
        System.out.println("---------- Conta ----------");
        System.out.println("Dono da conta: " + getDono());
        System.out.println("Número da conta: " + getNumConta());
        
        if (getTipo() == "cc"){
            System.out.println("Tipo da conta: Corrente");
        }else if(getTipo() == "cp"){
            System.out.println("Tipo da conta: Poupança");
        }
        System.out.println("Saldo da conta: " + getSaldo());
        if(getStatus() == true){
            System.out.println("Status da conta: Ativo" );
        }else{
            System.out.println("Status da conta: Inativo" );
        }
        System.out.println("---------------------------");
    }

    public void abrirConta(){
        if (getStatus() == true && getTipo() == "cc" && getSaldo() == 0){
            setSaldo(50.0f + getSaldo());

        }else if (getStatus() == true && getTipo() == "cp" && getSaldo() == 0){
            setSaldo(150.0f + getSaldo());

        }else if(getStatus() == true && getSaldo() == 0){
            System.out.println("Erro! Escolha [cc] para Conta Correte ou [cp] para conta poupança.");
        
        }else if(getSaldo() == 0){

        }
        System.out.println("---------------------------");
    }

    public void fecharConta(){
        if (getSaldo() > 0 && getNumConta() > 0){
            setNumConta(0);
            setStatus(false);
            System.out.println("Conta desativada!");
        }else{
            System.out.println("Erro! Número da conta não encontrado.");
        }
        System.out.println("---------------------------");
    }

    public void deposita(float sd){
        if (getStatus() == true && getNumConta() > 0 && getSaldo() >= 0){
            setSaldo(sd + getSaldo());
            System.out.println("Deposito de R$" + sd + " Reais, na conta de " + getDono() + ", foi realizado com sucesso!");
        }else if(getStatus() == false && getNumConta() == 0 && getSaldo() <= 0){
            System.out.println("Erro! É necessário ter uma conta para realizar essa função.");
        }
        System.out.println("---------------------------");
    }
    // Bug! Quando o método "sacar" ou quando é feito uma substração em qualquer método, o valor é passado com valores negativos. 
    public void sacar(float vs){
        if (getSaldo() >= vs && getSaldo() >= 0){
            setSaldo(getSaldo() - vs);
            System.out.println("Saque R$" + vs + " realizado com sucesso!");  
        }else{
            System.out.println("Erro! Saldo insuficiente.");
        }
        System.out.println("---------------------------");
    }

    public void pagarMensal(){
        if (getSaldo() >= 12 && getStatus() == true && getTipo() == "cc"){
            setSaldo(getSaldo() - 12);
            System.out.println("Pagamento mensal de R$12 Reais, foi realizado com sucesso!");
        }else if(getSaldo() >= 20 && getStatus() == true && getTipo() == "cp"){
            setSaldo(getSaldo() - 20);
            System.out.println("Pagamento mensal de R$20 Reais, foi realizado com sucesso!");
        }else if(getStatus() == false && getNumConta() == 0){
            System.out.println("Erro! Conta não registrada.");
        }else{
            System.out.println("Erro! Saldo insuficiente.");
        }
        System.out.println("---------------------------");
    }
    
}
