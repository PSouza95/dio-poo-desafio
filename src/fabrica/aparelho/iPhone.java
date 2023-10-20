package fabrica.aparelho;


import fabrica.internet.internetBrowser;
import fabrica.music.iPod;
import fabrica.phone.smartPhone;


public class iPhone {
    public static void main(String[] args) {
        iPod iPod = new iPod();
        smartPhone smartPhone = new smartPhone();
        internetBrowser internetBrowser = new internetBrowser();

        
        iPod.tocarMusica();
        smartPhone.atender();
        iPod.pausarMusica();
        iPod.selecionarMusica();
        smartPhone.ligar();
        smartPhone.iniciarCorreioVoz();
        internetBrowser.exibirPagina();
        internetBrowser.adicionarNovaAba();
        internetBrowser.atualizarPagina();
        
    }
}
