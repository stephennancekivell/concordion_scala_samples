package info.stephenn.concordion.scala_samples

import org.concordion.integration.junit4.ConcordionRunner
import org.junit.runner.RunWith

@RunWith(classOf[ConcordionRunner])
class executeOnATableTest {
  
    def split(fullName:String) = {
      val names = fullName.split(" ")
      new result(names(0), names(1))
    }
}   