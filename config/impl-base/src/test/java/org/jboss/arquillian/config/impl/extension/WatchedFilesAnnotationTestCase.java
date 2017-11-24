package org.jboss.arquillian.config.impl.extension;

import org.arquillian.smart.testing.strategies.affected.WatchFile;
import org.junit.Test;

@WatchFile("src/main/resources/META-INF/p.xml")
public class WatchedFilesAnnotationTestCase {

    @Test
    public void should_run_test() {
        System.out.println("Black box test");
    }

}
