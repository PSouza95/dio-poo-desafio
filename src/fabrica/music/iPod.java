package fabrica.music;

public class iPod implements musicPlayer{
    public void tocarMusica() {
        System.out.println("INICIANDO A MÚSICA");
    }

    public void pausarMusica() {
        System.out.println("PAUSANDO A MÚSICA");
    }

    public void selecionarMusica() {
        System.out.println("SELECIONANDO MÚSICA");
    }

}
