import scala.math.Pi

//Class definition
class PublicSpeakingClass {
  private val topics: MutableList[String] = MutableList.empty
  private var totalClassDuration: Int = 0

  def addTopic(topic: String): Unit = {
    topics += topic
  }

  def removeTopic(topic: String): Unit = {
    topics -= topic
  }

  def setTotalClassDuration(duration: Int): Unit = {
    totalClassDuration = duration
  }

  def getClassDuration: Int = {
    totalClassDuration
  }

  def getTopics: List[String] = {
    topics.toList
  }

}

//Object definition
object PublicSpeakingClass {
  protected val defaultDuration: Int = 180

  def apply(): PublicSpeakingClass = {
    val publicSpeakingClass = new PublicSpeakingClass
    publicSpeakingClass.setTotalClassDuration(defaultDuration)
    publicSpeakingClass
  }

}

//Object Usage
val publicSpeakingClassObject = PublicSpeakingClass()
publicSpeakingClassObject.addTopic("Public Speaking Basics")
publicSpeakingClassObject.addTopic("Presentation Preparation")
publicSpeakingClassObject.addTopic("Building Confidence")

println(s"Class duration: ${publicSpeakingClassObject.getClassDuration}")
println(s"Topics covered: ${publicSpeakingClassObject.getTopics.mkString(", ")}")

//Class Override
class AdvancedPublicSpeakingClass extends PublicSpeakingClass {

  override def setTotalClassDuration(duration: Int): Unit = {
    super.setTotalClassDuration((duration * Pi).toInt)
  }

}

//Class Usage
val advancedPublicSpeakingClassObject = new AdvancedPublicSpeakingClass
advancedPublicSpeakingClassObject.addTopic("Working with Audience")
advancedPublicSpeakingClassObject.setTotalClassDuration(180)

println(s"Class duration: ${advancedPublicSpeakingClassObject.getClassDuration}")
println(s"Topics covered: ${advancedPublicSpeakingClassObject.getTopics.mkString(", ")}")