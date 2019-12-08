import br.com.beans.Carro;

public class Principal {
    public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();

        c1.setPotencia(10);
        c1.setNome("Corcel");
        c1.setVelocidade(0);

        c2.setPotencia(10);
        c2.setNome("Corsa");
        c2.setVelocidade(0);

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.frear();


        c1.imprimir();
        c2.imprimir();


    }
}
