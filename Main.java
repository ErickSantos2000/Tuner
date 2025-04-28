import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro("Nissan", "Skyline GTR R34", 2002, "Azul");
        BodyShop oficina = new BodyShop(carro);
        carro.setOficina(oficina);
        ColorShop pintura = new ColorShop(carro);
        Menu menu = new Menu(carro, oficina, pintura);

        menu.menuPrincipal();

    }
}