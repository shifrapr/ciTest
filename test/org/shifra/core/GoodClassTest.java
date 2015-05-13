package org.shifra.core;

import org.junit.Test;
import junit.framework.Assert;


/**
 * @author spridera
 */
public class GoodClassTest extends Assert {

    @Test
    public void testDoesStuff() throws Exception {
        GoodClass c = new GoodClass();
        assertTrue(c.doesStuff());
    }
}
