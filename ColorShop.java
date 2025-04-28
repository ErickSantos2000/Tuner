public class ColorShop {

    private Carro carro;
    private String cor;
    private String neon;
    private String adesivo;

    public ColorShop(Carro carro){
        this.carro = carro;
    }

    public void pintura(int novaCor) {
        switch (novaCor) {
            case 1:
                carro.setCor("Prata");
                break;

            case 2:
                carro.setCor("Vermelho");
                break;

            case 3:
                carro.setCor("Preto");
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção invalida.");
        }
    }

    public void colocarNeon( int neon) {
        switch (neon) {
            case 1:
                carro.setNeon("Azul");
                break;

            case 2:
                carro.setNeon("Vermelho");
                break;

            case 3:
                carro.setNeon("Branco");
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção invalida.");
        }
    }

    public void colocarAdesivo(int tipo) {
        switch (tipo) {
            case 1:
                carro.setAdesivo("Faixa Esportiva");
                break;
            case 2:
                carro.setAdesivo("Chamas");
                break;
            case 3:
                carro.setAdesivo("Logo Personalizado");
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção invalida.");
        }
    }

    public void exbirVisual(Carro carro){
        System.out.println("Adesivo: " + carro.getAdesivo());
        System.out.println("Pintura: " + carro.getCor());
        System.out.println("Neon: " + carro.getNeon());
    }
}