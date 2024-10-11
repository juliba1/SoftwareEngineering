// Das Spielfeld mit 40 Feldern initialisieren
val spielfeld: Array[String] = Array.fill(40)("00")

// Häuser der Spieler (jeweils 4 Felder pro Spieler)
val House1, House2, House3, House4: Array[String] = Array.fill(4)("HH")

// Beispielbelegung der Felder
spielfeld(0) = "ST"   // Spieler A auf Feld 0
spielfeld(10) = "ST"  // Spieler B auf Feld 10
spielfeld(20) = "ST"  // Spieler C auf Feld 20
spielfeld(30) = "ST"  // Spieler D auf Feld 30

spielfeld(14) = "A1"
spielfeld(21) = "B1"

// Funktion zur Umwandlung in ein 2D-Layout und Ausgabe
def printBoard(spielfeld: Array[String], house1: Array[String], house2: Array[String], house3: Array[String], house4: Array[String]): Unit = {
  println("Herzlich Willkommen bei unserem tollen Mensch ärgere dich nicht")
  println("Hier ist ein erster Entwurf unseres Spielfeldes:\n")

  val space = " "

  // 2D-Spielfeld (basierend auf der Mensch-ärgere-dich-nicht Form)
  val layout: Array[Array[String]] = Array(
    Array(space * 11, spielfeld(8), spielfeld(9), spielfeld(10), space * 11),
    Array(space * 11, spielfeld(7), house1(0), spielfeld(11), space * 11),
    Array(space * 11, spielfeld(6), house1(1), spielfeld(12), space * 11),
    Array(space * 11, spielfeld(5), house1(2), spielfeld(13), space * 11),
    Array(spielfeld(0), spielfeld(1), spielfeld(2), spielfeld(3), spielfeld(4), house1(3), spielfeld(14), spielfeld(15), spielfeld(16), spielfeld(17), spielfeld(18)),
    Array(spielfeld(39), house4(0), house4(1), house4(2), house4(3), space * 2, house2(0), house2(1), house2(2), house2(3), spielfeld(19)),
    Array(spielfeld(38), spielfeld(37), spielfeld(36), spielfeld(35), spielfeld(34), house3(3), spielfeld(24), spielfeld(23), spielfeld(22), spielfeld(21), spielfeld(20)),
    Array(space * 11, spielfeld(33), house3(2), spielfeld(25), space * 11),
    Array(space * 11, spielfeld(32), house3(1), spielfeld(26), space * 11),
    Array(space * 11, spielfeld(31), house3(0), spielfeld(27), space * 11),
    Array(space * 11, spielfeld(30), spielfeld(29), spielfeld(28), space * 11),
  )

  // Ausgabe des Spielfelds
  layout.foreach { row =>
    println(row.mkString(" "))
  }
}

printBoard(spielfeld, House1, House2, House3, House4) //Liste an Häusern muss noch übergeben werden