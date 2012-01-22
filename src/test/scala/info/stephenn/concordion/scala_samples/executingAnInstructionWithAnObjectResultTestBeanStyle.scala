package info.stephenn.concordion.scala_samples

import org.concordion.integration.junit4.ConcordionRunner
import org.junit.runner.RunWith

@RunWith(classOf[ConcordionRunner])
class executingAnInstructionWithAnObjectResultBeanStyleTest {
    def split(fullName:String) = {
      val r = nameSplitter.splitName(fullName)
      resultBeanStyle(r.firstName,r.lastName)
    } 
}

case class resultBeanStyle(getFirstName:String, getLastName:String)