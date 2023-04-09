package padroes.strategy;

public class ComportamentoAgresivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("Movendo-se agressivamente...");
    }

}
