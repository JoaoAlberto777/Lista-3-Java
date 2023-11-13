package Java;

public class Portas {
    boolean aberta;
    String cor;
    float dimensaoX;
    float dimensaoY;
    float dimensaoZ;

    public void abre() {
        if (aberta == true) {
            System.out.println("A porta já está Aberta!");
        } else {
            aberta = true;
            System.out.println("Você abriu a porta!");
        }
    }

    public void fecha() {
        if (aberta == false) {
            System.out.println("A porta já está fechada");
        } else {
            aberta = false;
            System.out.println("Você fechou a porta!");
        }
    }

    public void pintar(String cor) {
        this.cor = cor;
        System.out.println("Porta pintada de " + cor);
    }

    public boolean estaAberta() {
        return this.aberta;
    }

    public static void main(String[] args) {
        Portas porta = new Portas();

        porta.abre();
        porta.fecha();

        porta.pintar("azul");

        System.out.println("A porta está aberta? " + porta.estaAberta());
    }
}
