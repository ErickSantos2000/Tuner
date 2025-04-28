
public class Carro {
    private String fabricante;
    private String modelo;
    private String cor;
    private int ano;

    private boolean ligado;
    private int velocidade;
    private int aerodinamica;
    private int aceleracaoModificada;

    private String aeroFolio;
    private String bodyKit;
    private String rodas;
    private String capo;
    private String neon;
    private String adesivo;

    private BodyShop oficina;

    public Carro(String fabricante, String modelo, int ano, String cor){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
        velocidade = 0;
        aeroFolio = "Padrão de fabrica";
        bodyKit = "Padrão de fabrica";
        rodas = "Padrão de fabrica";
        capo = "Padrão de fabrica";
        ligado = false;
        aerodinamica = 0;
        aceleracaoModificada = 0;
    }

    public void ligarCarro(){
        if(!ligado){
            ligado = true;
            System.out.println("Carro ligado!");
        } else {
            System.out.println("Carro já esta ligado!");
        }
    }

    public void desligarCarro(){

        if(getVelocidade() != 0) {
            System.out.println("Não é possivel Desligá-lo em movimento. Pare-o antes de desligar.");
        }
        else if(ligado){
            ligado = false;
            System.out.println("Carro desligado!");
        } else {
            System.out.println("Carro já esta desligado!");
        }
    }

    public void acelerar(int valor){
        int vezes = 0;
        aceleracaoModificada = oficina.getVeloAerofolio() + oficina.getVeloBodyKit() + oficina.getVeloRodas() + oficina.getVelocapo();

        if(getLigado() == true){
            valor += aceleracaoModificada;
            while (vezes < valor){
                vezes++;
                velocidade++;
                if(velocidade % 10 == 0){
                    System.out.println("Acelerando..." + velocidade + "Kmh");
                }
            }
        } else {
            System.out.println("Não é possivel acelerar, carro está desligado!");
        }

    }

    public void parar(){
        if(velocidade > 0){
            while (velocidade >= 0) {
                System.out.println("Parando..." + velocidade + "Kmh");
                velocidade -= 10;
            }
            velocidade = 0;
            System.out.println("Carro parado.");
        } else {
            System.out.println("Carro desligado, não é possivel frear!");
        }
    }

    public void exibir(){
        System.out.println("Fabricante: " + fabricante + "\nModelo: "+ modelo + "\nAno de lançamento: "+ ano + "\nCor: " + cor);
    }

    //
    public int getAceleracaoModificada(){
        return aceleracaoModificada;
    }

    //
    public String getModelo(){
        return modelo;
    }

    //
    public String getCor(){
        return cor;
    }
    public void setCor(String color){
        cor = color;
    }

    public String getAeroFolio(){
        return aeroFolio;
    }
    public void setAerofolio(String aeroFolio){
        this.aeroFolio = aeroFolio;
    }

    //
    public String getBodyKit() {
        return bodyKit;
    }

    public void setBodyKit(String bodyKit) {
        this.bodyKit = bodyKit;
    }

    //
    public String getRodas() {
        return rodas;
    }

    public void setRodas(String rodas) {
        this.rodas = rodas;
    }

    //
    public String getCapo() {
        return capo;
    }

    public void setCapo(String capo) {
        this.capo = capo;
    }

    //
    public int getVelocidade(){
        return velocidade;
    }

    //
    public boolean getLigado(){
        return ligado;
    }

    //
    public String getNeon(){
        return neon;
    }
    public void setNeon(String neon){
        this.neon = neon;
    }

    //
    public String getAdesivo(){
        return adesivo;
    }
    public void setAdesivo(String adesivo){
        this.adesivo = adesivo;
    }

    //
    public int getAerodinamica(){
        return aerodinamica;
    }

    public void setOficina(BodyShop oficina) {
        this.oficina = oficina;
    }
}