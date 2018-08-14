public class TV {

    private boolean Power = false;
    private ListaCanais canais = new ListaCanais();
    private int Volume = 0;
    private int canal = 0;
    private boolean Mute = true;

    //liga ou desliga
    public void ligarDesligar() {
        if (Power == false) {
            Power = true;
            System.out.println("Aparelho ligado");
        } else {
            Power = false;
            System.out.println("Aparelho Desligado");
        }
    }
    //Mutar o Volume se tiver mutado, ele Dismuta;
    public void mutarOnOf() {
        if (Power == true) {//Verifica se a TV esta Ligada.
            if (Mute == true) {//Verifica se a TV esta no mute.
                Mute = false;
                System.out.println("Sistema Mutado");
            } else {
                Mute = true;
                System.out.println("Sistema Desmutado");
            }

        } else {
            System.out.println("aparelho desligado");
        }
    }

    //Amenta o volume da onde ele parou;
    public void mudarVolumeUp() {
        if (Power == true) {//Verifica se a TV esta Ligada.
            if (Mute == false) {//Verifica se a TV esta no mute.
                Volume = 0;
            }
            if (Volume < 100) {
                Volume++;
                System.out.println("Volume: " + Volume);
            } else {
                System.out.println("Volume: " + Volume);
            }
        } else {
            System.out.println("aparelho desligado");
        }
    }

    //Diminue o volume da onde ele parou;
    public void mudarVolumeDn() {
        if (Power == true) {//Verifica se a TV esta Ligada.
            if (Mute == false)//Verifica se a TV esta no mute.
            {
                Volume = 0;
            }

            if (Volume > 0) {
                Volume--;
                System.out.println("Volume: " + Volume);
            } else {
                System.out.println("Volume: " + Volume);
            }
        } else {
            System.out.println("aparelho desligado");
        }
    }

    public void storeChannel(int c, double f) {
        if (Power == true) {//Verifica se a TV esta Ligada.
            if (c >= 0 && c < 100) {//Verifica se o canal Digitado pertence a Lista de Canais
                if (f >= 40.0 && f < 60.0) {//Verifica se a frequencia esta entre 40 e 60.
                    canais.adicinarFrequencia(c, f);
                } else {
                    System.out.println("Faixa de frequencia nao existe");
                }
            } else {
                System.out.println("Numero de canal errado");
            }

        } else {
            System.out.println("aparelho desligado");
        }
    }

    public void mudaCanal(int c) {
        if (Power == true) {//Verifica se a TV esta Ligada.
            if (c >= 0 && c < 100) {//Verifica se o canal Digitado pertence a Lista de Canais
                canal = c;
                canais.printCanal(c);
            } else {
                System.out.println("Numero de canal errado");
            }
        } else {
            System.out.println("aparelho desligado");
        }

    }

    //Estes comandos nao fazem parte do aparelho 
    //caso contrario teria que verificar se o aparelho esta ligado.
    public void memoriaTV() {
        System.out.println("------Status da TV------");
        System.out.println("Ligado=true,Desligado=false -----> [" + Power + "]");
        System.out.println("Canal: " + canal);
        System.out.println("Volume: " + Volume);

    }

    public void printChannel() {
        canais.printCanais();

    }

}
