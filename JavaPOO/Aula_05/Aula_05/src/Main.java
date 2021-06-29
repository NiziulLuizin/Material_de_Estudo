public class Main {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(24143);
        p1.setDono("Jubileu");
        p1.abrirConta("CC");
        p1.depositar(150);
        p1.estadoAtual();
    }
}
