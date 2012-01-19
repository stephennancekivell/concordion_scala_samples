package info.stephenn.concordion.scala_samples

import org.concordion.integration.junit4.ConcordionRunner
import org.junit.runner.RunWith
import scala.collection.JavaConverters
import scala.collection.JavaConverters._

@RunWith(classOf[ConcordionRunner])
class verifyRowsTest {
  var users : List[String] = List()
  def setUpUser(user:String){
    users = List(user) ::: users
  }
  
  def getSearchResultsFor(query:String) = {
    users.filter(_.contains(query)).toIterable.asJava
  }
}