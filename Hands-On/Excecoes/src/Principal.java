public class Principal {
    public static void main(String[] args) {
        a(-100);
        System.out.println("Terminando a execução de main()");
    }

    public static void a(int i){
        System.out.println("Executando a() com " + i);
        try {
            b(i);
        } catch (Exception e) {
            System.out.println("Tratando a excecao: " + e.getMessage());
        }
        System.out.println("Terminando a execução de a()");
    }

    public static void b(int i) throws Exception {
        System.out.println("Executando b() com " + i);
        if (i > 0)
            throw new Exception("Mensagem");
        System.out.println("Terminando execução de b()");
    }
}
