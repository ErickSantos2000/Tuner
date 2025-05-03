public class Main {
    public static void main(String[] args) {

        Carro carro = new Carro("Nissan", "Skyline GTR R34", 2002, "Azul");
        BodyShop oficina = new BodyShop(carro);
        ColorShop pintura = new ColorShop(carro);
        Menu menu = new Menu(carro, oficina, pintura);

        carro.setOficina(oficina);
        menu.menuPrincipal();

    }
}