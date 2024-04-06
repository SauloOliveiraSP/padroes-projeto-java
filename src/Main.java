import Padroes.Facade.Facade;
import Padroes.Singleton.SingletonEager;
import Padroes.Singleton.SingletonLazy;
import Padroes.Singleton.SingletonLazyHolder;
import Padroes.Strategy.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Testes relacionados ao Design Pattern;

        // Singleton

        SingletonLazy lazyClass = SingletonLazy.getInstancia();
        System.out.println(lazyClass);
        lazyClass = SingletonLazy.getInstancia();
        System.out.println(lazyClass);

        SingletonEager eagerClass = SingletonEager.getInstancia();
        System.out.println(eagerClass);
        eagerClass = SingletonEager.getInstancia();
        System.out.println(eagerClass);

        SingletonLazyHolder lazyHolderClass = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolderClass);
        lazyHolderClass = SingletonLazyHolder.getInstancia();
        System.out.println(lazyHolderClass);

        // Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        // Facede

        Facade facede = new Facade();
        facede.migrarCliente("Saulo de Oliveira", "04829290");
    }
}