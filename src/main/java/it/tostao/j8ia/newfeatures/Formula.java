package it.tostao.j8ia.newfeatures;

/**
 * Created by Slawomir Leski <slawomir.leski@buschgroup.com> on 07.10.2015.
 */
public interface Formula {
    double calculate(int a);

    default double sqrt(int a) {
        return Math.sqrt(a);
    }
}

