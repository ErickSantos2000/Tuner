import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Carro carro = new Carro("Nissan", "Skyline GTR R34", 2002, "Azul");
        BodyShop oficina = new BodyShop();
        ColorShop pintura = new ColorShop();
        Menu menu = new Menu();

        menu.menuPrincipal(carro, oficina, pintura);

    }
}