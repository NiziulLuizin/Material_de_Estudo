public class Lutadores {
    public static void main(String[] args) {
        Lutador L1 = new Lutador("Luccas", "Ítalia", 23, 1.87f, 87.4f, 23, 12, 1);
        L1.apresentar();

        Lutador L2 = new Lutador("Victor", "França", 26, 1.78f, 84.4f, 27, 11, 4);
        L2.apresentar();

        Lutador L3 = new Lutador("Tylouis", "Guiana Francesa", 28, 1.84f, 82.3f, 27, 7, 4);
        L3.apresentar();

        Lutador L4 = new Lutador("Bernardo", "Brasil", 25, 1.79f, 89.7f, 33, 14, 6);
        L4.apresentar();

        Lutador L5 = new Lutador("Lorenzo", "Ilhas Caimão", 33, 1.91f, 97.4f, 34, 17, 6);
        L5.apresentar();

        Lutador L6 = new Lutador("Noah", "Canadá", 48, 1.85f, 99.6f, 37, 19, 9);
        L6.apresentar();
        L6.Status();
    }
}
