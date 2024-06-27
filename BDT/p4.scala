abstract class Notification

case class Email(sender: String, title: String, body: String) extends Notification
case class SMS(caller: String, message: String) extends Notification

object NotificationApp {
  def showNotification(notification: Notification): String = {
    notification match {
      case Email(sender, title, _) => 
        s"You got an email from $sender with title: $title"
      case SMS(caller, message) => 
        s"You got an SMS from $caller! Message: $message"
    }
  }

  def main(args: Array[String]): Unit = {
    val email = Email("abc@gmail.com", "Meeting Reminder", "Don't forget about the meeting at 10 AM")
    val sms = SMS("123-456-7890", "Your verification code is 654321")

    println(showNotification(email))
    println(showNotification(sms))
  }
}
