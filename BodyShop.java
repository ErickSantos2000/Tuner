public class BodyShop {
    int aerofolioS = 0;
    int bodyKitS = 0;
    int rodasS = 0;
    int capoS = 0;

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

    public void mostrarAceleracao(BodyShop oficina) {
        int aceleracao = oficina.getVeloAerofolio() + oficina.getVeloBodyKit() + oficina.getVeloRodas() + oficina.getVelocapo();
        System.out.println("Aceleração: " + aceleracao + "Kmh");
    }

    public void mostrarCarroceria(Carro carro) {
        System.out.println("----Carroceria----");
        System.out.println(carro.getAeroFolio());
        System.out.println(carro.getBodyKit());
        System.out.println(carro.getCapo());
        System.out.println(carro.getRodas());
        System.out.println();
    }

    public void instalarAerofolio(Carro carro, int aerofolio) {
        switch (aerofolio) {
            case 1:
                carro.setAerofolio("Aerofólio Fixo");
                this.aerofolioS = 5;
                System.out.println("Aerofólio Fixo instalado!");
                break;

            case 2:
                carro.setAerofolio("Aerofólio Ativo");
                this.aerofolioS = 10;
                System.out.println("Aerofólio Ativo instalado!");
                break;

            case 3:
                carro.setAerofolio("Aerofólio Regulável");
                this.aerofolioS = 15;
                System.out.println("Aerofólio Regulável instalado!");
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção invalida.");
        }
    }

    public void instalarBodyKit(Carro carro, int bodyKit) {
        switch (bodyKit) {
            case 1:
                carro.setBodyKit("Bodykit Estético");
                this.bodyKitS = 5;
                System.out.println("Bodykit Estético instalado!");
                break;

            case 2:
                carro.setBodyKit("Bodykit Aerodinâmico");
                this.bodyKitS = 10;
                System.out.println("Bodykit Aerodinâmico instalado!");
                break;

            case 3:
                carro.setBodyKit("Widebody Kit");
                this.bodyKitS = 15;
                System.out.println("Widebody Kit instalado!");
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção invalida.");
        }
    }

    public void instalarRodas(Carro carro, int rodas) {
        switch (rodas){
            case 1:
                carro.setRodas("Rodas de Liga Leve");
                this.rodasS = 5;
                System.out.println("Rodas de Liga Leve instaladas!");
                break;

            case 2:
                carro.setRodas("Rodas Esportivas");
                this.rodasS = 10;
                System.out.println("Rodas Esportivas instaladas!");
                break;

            case 3:
                carro.setCapo("Rodas de Corrida");
                this.rodasS = 15;
                System.out.println("Rodas de Corridas instaladas!");
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção invalida.");
        }
    }

    public void instalarCapo(Carro carro, int capo){
        switch (capo){
            case 1:
                carro.setRodas("Capô de Fibra de Carbono");
                this.capoS = 5;
                System.out.println("Capô de Fibra de Carbono instalado!");
                break;

            case 2:
                carro.setCapo("Capô Transparente");
                this.capoS = 10;
                System.out.println("Capô Transparente instalado!");
                break;

            case 3:
                carro.setCapo("Capô com Tomada de Ar");
                this.capoS = 15;
                System.out.println("Capô com Tomada de Ar instalado!");
                break;

            case 0:
                System.out.println("Saindo...");
                break;

            default:
                System.out.println("Opção invalida.");
        }
    }
}