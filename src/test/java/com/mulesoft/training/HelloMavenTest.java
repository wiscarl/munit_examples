package com.mulesoft.training;

import org.junit.Test;
import org.mule.tck.junit4.FunctionalTestCase;

public class HelloMavenTest extends FunctionalTestCase {

    @Test
    public void mavenFlowReturnsHelloMaven() throws Exception {
        runFlowAndExpect("mavenFlow", "Hello Maven");
    }
    
//    @Override
//    protected String getConfigFile() {
//        return "mavensetup.xml";
//    }
    
    @Override
    protected String[] getConfigFiles(){
    	return new String[]{"mavensetup.xml", "global.xml"};
    }
}