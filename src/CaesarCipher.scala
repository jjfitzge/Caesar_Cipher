class CaesarCipher(shift:Int) {
  val alphabet: Map[Char,Int] = Map("a" -> 0, "b" -> 1,"c" -> 2,"d" -> 3,"e" -> 4,"f" -> 5,"g" -> 6 ,"h" -> 7,"i" -> 8,"j" -> 9,"k" -> 10,"l" -> 11,"m" -> 12,"n" -> 13,"o" -> 14,"p" -> 15,"q" -> 16,"r" -> 17,"s" -> 18,"t" -> 19,"u" -> 20,"v" -> 21,"w" -> 22,"x" -> 23,"y" -> 24,"z" -> 25)
  def encryptText(text: String): String = {
    var msg: String = ""
    for (c <- text) {
      if (alphabet.contains(c)) { //at lowercase char
        val index: Int = (alphabet(c) + shift) % 26 // modulo to ensure we only have index between 0 and 25
        msg += alphabet.find(_._2 == index).map(_._1).get
      }
      else { //assuming valid char given then uppercase case needs to be handled
        val index: Int = (alphabet(c.toLower) + shift) % 26
        msg += alphabet.find(_._2 == index).map(_._1).get.toUpper
      }

    }
  }

}
