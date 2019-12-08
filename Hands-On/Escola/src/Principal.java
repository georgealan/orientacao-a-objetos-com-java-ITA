import com.escola.beans.Aluno;

public class Principal {
    public static void main(String[] args) {
        Aluno George = new Aluno();

        George.bim1 = 70;
        George.bim2 = 60;
        George.bim3 = 80;
        George.bim4 = 90;

        System.out.println("A média do aluno é: " + George.media());
        System.out.println("O aluno passou de ano? " + George.passouDeAno());
    }
}
