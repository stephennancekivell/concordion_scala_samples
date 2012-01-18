package org.concordion.samples

import org.concordion.integration.junit4.ConcordionRunner
import org.junit.runner.RunWith

@RunWith(classOf[ConcordionRunner])
class DemoScalaTest {
  
     def greetingFor(firstName:String) = {
        String.format("Hello %s!", firstName)
    }
}