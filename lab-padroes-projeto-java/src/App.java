import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.sigleton.SingletonEager;
import one.digitalinnovation.gof.sigleton.SingletonLazy;
import one.digitalinnovation.gof.sigleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class App {
    public static void main(String[] args) throws Exception {

        /*
         * Testes realizados para o Design Pattern Singleton
         */

        System.out.println("=== Singleton Lazy ===");
        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);

        System.out.println("=== Singleton Eager ===");
        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        System.out.println("=== Singleton Lazy Holder ===");
        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolder);

        /*
         * Testes realizados para o Design Pattern Strategy
         */

        System.out.println("=== Strategy ===");

        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento normal = new ComportamentoNormal();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();

        /*
         * Testes realizados para o Design Pattern Facade
         */

        System.out.println("=== Facade ===");
        Facade facade = new Facade();
        facade.migrarCliente("Leandro", "25000000");

    }
}
