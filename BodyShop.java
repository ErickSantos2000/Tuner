public class BodyShop {
    int aerofolioS = 0;
    int bodyKitS = 0;
    int rodasS = 0;
    int capoS = 0;
    Carro carro;

    public BodyShop(Carro carro){
        this.carro = carro;
    }


    public void mostrarAceleracao(BodyShop oficina) {
        int aceleracao = oficina.getVeloAerofolio() + oficina.getVeloBodyKit() + oficina.getVeloRodas() + oficina.getVelocapo();
        System.out.println("Aceleração: " + aceleracao + "Kmh");
    }

    public int getVeloAerofolio(){
        return aerofolioS;
    }
    public int getVeloBodyKit(){
        return bodyKitS;
    }
    public int getVeloRodas(){
        return rodasS;
    }
    public int getVelocapo(){
        return capoS;
    }

    public void mostrarCarroceria(Carro carro) {
        System.out.println("----Carroceria----");
        System.out.println(carro.getAeroFolio());
        System.out.println(carro.getBodyKit());
        System.out.println(carro.getCapo());
        System.out.println(carro.getRodas());
        System.out.println();
    }

    public void instalarAerofolio(int aerofolio) {
        switch (aerofolio) {
            case 1:
                carro.setAerofolio("Aerofólio Fixo");
                this.aerofolioS = 5;
                break;

            case 2:
                carro.setAerofolio("Aerofólio Ativo");
                this.aerofolioS = 10;
                break;

            case 3:
                carro.setAerofolio("Aerofólio Regulável");
                this.aerofolioS = 15;
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção invalida.");
        }
    }

    public void instalarBodyKit(int bodyKit) {
        switch (bodyKit) {
            case 1:
                carro.setBodyKit("Bodykit Estético");
                this.bodyKitS = 5;
                break;

            case 2:
                carro.setBodyKit("Bodykit Aerodinâmico");
                this.bodyKitS = 10;
                break;

            case 3:
                carro.setBodyKit("Widebody Kit");
                this.bodyKitS = 15;
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção invalida.");
        }
    }

    public void instalarRodas(int rodas) {
        switch (rodas){
            case 1:
                carro.setRodas("Rodas de Liga Leve");
                this.rodasS = 5;
                break;

            case 2:
                carro.setRodas("Rodas Esportivas");
                this.rodasS = 10;
                break;

            case 3:
                carro.setCapo("Rodas de Corrida");
                this.rodasS = 15;
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção invalida.");
        }
    }

    public void instalarCapo(int capo){
        switch (capo){
            case 1:
                carro.setRodas("Capô de Fibra de Carbono");
                this.capoS = 5;
                break;

            case 2:
                carro.setCapo("Capô Transparente");
                this.capoS = 10;
                break;

            case 3:
                carro.setCapo("Capô com Tomada de Ar");
                this.capoS = 15;
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção invalida.");
        }
    }
}