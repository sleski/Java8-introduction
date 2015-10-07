package it.tostao.j8ia.newfeatures;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by Slawomir Leski <slawomir.leski@buschgroup.com> on 07.10.2015.
 */
public class NewFeaturesTest {

    private static final Logger LOG = LoggerFactory.getLogger(NewFeaturesTest.class);

    /**
     * Default Methods for Interfaces
     * Java 8 enables us to add non-abstract method implementations to interfaces by utilizing the default keyword.
     * This feature is also known as Extension Methods.
     */
    @Test
    public void formula(){

        Formula f = (int a) -> Math.sqrt(a * 5);

        LOG.info("formula calc(5) = " + f.calculate(5));
        LOG.info("formula sqrt(36) = " + f.sqrt(36));
    }
}
