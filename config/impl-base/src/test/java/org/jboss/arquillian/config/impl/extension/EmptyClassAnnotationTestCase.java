package org.jboss.arquillian.config.impl.extension;

import org.arquillian.smart.testing.strategies.affected.ComponentUnderTest;
import org.junit.Test;

@ComponentUnderTest(packages = "org.jboss.arquillian.config.*")
public class EmptyClassAnnotationTestCase {


    @Test
    public void should_run_test() {
        System.out.println("Black box test");
    }

}
