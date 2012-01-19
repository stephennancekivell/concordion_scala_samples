package info.stephenn.concordion.scala_samples

import org.concordion.integration.junit4.ConcordionRunner
import org.junit.runner.RunWith
import scala.collection.JavaConverters
import scala.collection.JavaConverters._

@RunWith(classOf[ConcordionRunner])
class verifyRowsWithObjectTest {
  var users : List[result] = List()
  def split(user:String) = {
    val names = user.split("\\.")
    new result(names(0),names(1))
  }
  def setUpUser(user:String){
    users = List(split(user)) ::: users
  }
  
  def getSearchResultsFor(query:String) = {
    println(users)
    users.filter(_.lastName.contains(query)).toIterable.asJava
  }
}