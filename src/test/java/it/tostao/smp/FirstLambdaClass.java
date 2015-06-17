package it.tostao.smp;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Slawomir Leski <slawomir.leski@buschgroup.com> on 17.06.2015.
 */
public class FirstLambdaClass {

    private static final Logger LOG = LoggerFactory.getLogger(FirstLambdaClass.class);

    @Test
    public void first() {
        List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));

        Comparator<Apple> c = (Apple param1, Apple param2) -> param1.getWeight().compareTo(param2.getWeight());

        LOG.info("first look:" + inventory);
        inventory.sort(c);
        LOG.info("lookafter sort:" + inventory);
    }
}
