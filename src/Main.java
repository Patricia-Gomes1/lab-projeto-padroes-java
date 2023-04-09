
/*import padroes.singleton.SingletonEager;
import padroes.singleton.SingletonLazy;
import padroes.singleton.SingletonLazyHolder;*/
import padroes.strategy.Comportamento;
import padroes.strategy.ComportamentoAgresivo;
import padroes.strategy.ComportamentoDefensivo;
import padroes.strategy.ComportamentoNormal;
import padroes.strategy.Robo;

public class Main {
    public static void main(String[] args) {

        // Singleton

        /*
         * SingletonLazy lazy = SingletonLazy.getInstancia();
         * System.out.println(lazy);
         * lazy = SingletonLazy.getInstancia();
         * System.out.println(lazy);
         * 
         * SingletonEager eager = SingletonEager.getInstancia();
         * System.out.println(eager);
         * eager = SingletonEager.getInstancia();
         * System.out.println(eager);
         * 
         * SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
         * System.out.println(holder);
         * holder = SingletonLazyHolder.getInstancia();
         * System.out.println(holder);
         */

        // Strategy

        /*
         * Comportamento defensivo = new ComportamentoDefensivo();
         * Comportamento normal = new ComportamentoNormal();
         * Comportamento agressivo = new ComportamentoAgresivo();
         * 
         * Robo robo = new Robo();
         * 
         * robo.setComportamento(normal);
         * robo.mover();
         * robo.mover();
         * 
         * robo.setComportamento(defensivo);
         * robo.mover();
         * 
         * robo.setComportamento(agressivo);
         * robo.mover();
         * robo.mover();
         * robo.mover();
         */

    }
}
