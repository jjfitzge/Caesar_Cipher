object CipherMain {
  def main(args: Array[String]): Unit = {
    val cipher4 = new CaesarCipher(4)
    val encryptedText = cipher4.encryptText("Hello World")
    println(encryptedText)
    println(cipher4.decryptText(encryptedText))
  }

}
