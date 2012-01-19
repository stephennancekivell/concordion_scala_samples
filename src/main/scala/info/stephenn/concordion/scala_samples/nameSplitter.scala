package info.stephenn.concordion.scala_samples

object nameSplitter {
  def splitName(name:String) = {
    val names = name.split(" ")
    new result(names(0), names(1))
  }
}

case class result(firstName:String, lastName:String)