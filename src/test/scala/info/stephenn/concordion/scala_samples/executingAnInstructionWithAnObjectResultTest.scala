package info.stephenn.concordion.scala_samples

import org.concordion.integration.junit4.ConcordionRunner
import org.junit.runner.RunWith

@RunWith(classOf[ConcordionRunner])
class executingAnInstructionWithAnObjectResultTest {
    def split(fullName:String) = {
      nameSplitter.splitName(fullName)
    } 
}   