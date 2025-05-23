import java.util.Scanner;

public class Menu {
    private Carro carro;
    private BodyShop oficina;
    private ColorShop pintura;

    Scanner sc = new Scanner(System.in);

    public Menu(Carro carro, BodyShop oficina, ColorShop pintura){
        this.carro = carro;
        this.oficina = oficina;
        this.pintura = pintura;
    }

    public void menuColorShop(){
        int corOpcao;
        do {
            System.out.println("\n-- COLORSHOP --");
            System.out.println("1 - Pintar carro");
            System.out.println("2 - Colocar Neon");
            System.out.println("3 - Colocar Adesivo");
            System.out.println("4 - Mostrar visual");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            corOpcao = sc.nextInt();

            switch (corOpcao) {
                case 1:
                    int opCor;
                    do {
                        System.out.println("1 - Prata");
                        System.out.println("2 - Vermelho");
                        System.out.println("3 - Preto");
                        System.out.println("0 - Sair");

                        System.out.print("Escolha uma opção: ");
                        opCor = sc.nextInt();

                        pintura.pintura(opCor);
                        System.out.println("Carro pintado de "+ carro.getCor());

                    }while (opCor != 0);

                    break;
                case 2:
                    int corNeon;
                    do {
                        System.out.println("1 - Azul");
                        System.out.println("2 - Vermelho");
                        System.out.println("3 - Branco");
                        System.out.println("0 - Sair");

                        System.out.print("Escolha uma opção: ");
                        corNeon = sc.nextInt();

                        pintura.colocarNeon(corNeon);
                        System.out.println("Neon "+ carro.getNeon() + " instalado!");

                    }while (corNeon != 0);

                    break;
                case 3:
                    int opcAdesivo;
                    do {
                        System.out.println("1 - Faixa Esportiva");
                        System.out.println("2 - Chamas");
                        System.out.println("3 - Logo Personalizado");
                        System.out.println("0 - Sair");

                        System.out.print("Escolha uma opção: ");
                        opcAdesivo = sc.nextInt();

                        pintura.colocarAdesivo(opcAdesivo);
                        System.out.println(carro.getAdesivo() + " aplicado!");

                    }while (opcAdesivo != 0);

                    break;
                case 4:
                    pintura.exbirVisual(carro);
                    break;
            }
        } while (corOpcao != 0);
    }
    public void menuCarro(Carro carro, BodyShop oficina){
        int carroOpc;
        do {
            System.out.println("---" + carro.getModelo() + "---");
            if(!carro.getLigado()){
                System.out.println("1 - Ligar ");
            }
            else {
                System.out.println("1 - Desligar ");
            }
            System.out.println("2 - Acelerar");
            System.out.println("3 - Parar ");
            System.out.println("4 - Exibir informações do carro");
            System.out.println("0 - Sair do carro");
            System.out.print("Escolha uma opção: ");
            carroOpc = sc.nextInt();

            switch (carroOpc){
                case 1:
                    if(!carro.getLigado()){
                        carro.ligarCarro();
                    }
                    else {

                        carro.desligarCarro();
                    }

                    break;
                case 2:
                    if(carro.getAceleracaoModificada() > 0){

                        if(360 > carro.getVelocidade()){
                            carro.acelerar(20);
                        }
                        else {
                            System.out.println("Velocidade máxima alcançada!");
                        }
                    }
                    else {
                        if(280 > carro.getVelocidade()){
                            carro.acelerar(20);
                        }
                        else {
                            System.out.println("Velocidade máxima alcançada!");
                        }
                    }
                    break;
                case 3:
                    carro.parar();

                    break;

                case 4:
                    carro.exibir();

                    break;
                case 0:
                    if(carro.getVelocidade() != 0){
                        System.out.println("Não pode sair do carro rapaz! Pare-o antes!");
                    } if(carro.getLigado() == true){
                    System.out.println("Não pode sair do carro rapaz! O c3arro está ligado!");
                    } else {
                    System.out.println("Saindo...");
                    }
                    break;

                default:
                    System.out.println("Opção inválida.");

            }
        } while (carroOpc != 0 || carro.getVelocidade() != 0 || carro.getLigado() == true);

    }
    public void menuBodyShop(){
        int escolha;
        do {
            System.out.println("\n-- BODYSHOP --");
            System.out.println("1 - Instalar BodyKit");
            System.out.println("2 - Instalar Rodas");
            System.out.println("3 - Instalar Capô");
            System.out.println("4 - Instalar Aerofólio");
            System.out.println("5 - Ver Carroceria");
            System.out.println("6 - Aceleração");
            System.out.println("0 - Voltar");
            System.out.print("Escolha uma opção: ");
            escolha = sc.nextInt();

            switch (escolha) {
                case 1:
                    int opcBody;
                    do {
                        System.out.println("1 - Bodykit Estético aumenta a aceleração em 5km");
                        System.out.println("2 - Bodykit Aerodinâmico aumenta a aceleração em 10km");
                        System.out.println("3 - Widebody Kit aumenta a aceleração em 15km");
                        System.out.println("0 - Sair");

                        System.out.print("Escolha uma opção: ");
                        opcBody = sc.nextInt();

                        oficina.instalarBodyKit(opcBody);
                        System.out.println(carro.getBodyKit() + " instalado!");

                    }while (opcBody != 0);

                    break;
                case 2:
                    int opcRodas;
                    do {
                        System.out.println("1 - Rodas de Liga Leve a aceleração em 5km");
                        System.out.println("2 - Rodas Esportivas aumenta a aceleração em 10km");
                        System.out.println("3 - Rodas de Corridas aumenta a aceleração em 15km");
                        System.out.println("0 - Sair");

                        System.out.print("Escolha uma opção: ");
                        opcRodas = sc.nextInt();

                        oficina.instalarRodas(opcRodas);
                        System.out.println(carro.getRodas() + " instalado!");

                    }while (opcRodas != 0);

                    break;
                case 3:
                    int opcCapo;
                    do {
                        System.out.println("1 - Capô de Fibra aumenta a aceleração em 5km");
                        System.out.println("2 - Capô Transparente aumenta a aceleração em 10km");
                        System.out.println("3 - Capô com Tomada de Ar aumenta a aceleração em 15km");
                        System.out.println("0 - Sair");

                        System.out.print("Escolha uma opção: ");
                        opcCapo = sc.nextInt();

                        oficina.instalarCapo(opcCapo);
                        System.out.println(carro.getCapo() + " instalado!");

                    }while (opcCapo != 0);

                    break;
                case 4:
                    int opcAerofolio;
                    do {
                        System.out.println("1 - Aerofólio Fixo aumenta a aceleração em 5km");
                        System.out.println("2 - Aerofólio Ativo aumenta a aceleração em 10km");
                        System.out.println("3 - Aerofólio Regulável aumenta a aceleração em 15km");
                        System.out.println("0 - Sair");

                        System.out.print("Escolha uma opção: ");
                        opcAerofolio = sc.nextInt();

                        oficina.instalarAerofolio(opcAerofolio);
                        System.out.println(carro.getAeroFolio() + " instalado!");

                    }while (opcAerofolio != 0);

                    break;
                case 5:
                    oficina.mostrarCarroceria(carro);
                    break;

                case 6:
                    oficina.mostrarAceleracao(oficina);
                    break;
            }
        } while (escolha != 0);

    }

    public void menuPrincipal(){

        int opcao;

        do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("1 - Ir para a BodyShop");
            System.out.println("2 - Ir para a ColorShop");
            System.out.println("3 - Entrar no carro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1:
                    menuBodyShop();
                    break;

                case 2:
                    menuColorShop();
                    break;

                case 3:
                    menuCarro(carro, oficina);
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 0);

        sc.close();
    }
}