package one.digitalinnovation.gof.sigleton;

/**
 * Singleton "preguiçoso"
 * 
 * @author leanddrodev
 */
public class SingletonLazy {

    private static SingletonLazy instancia;

    private SingletonLazy() {
        super();
    }

    public static SingletonLazy getInstancia() {
        if(instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
