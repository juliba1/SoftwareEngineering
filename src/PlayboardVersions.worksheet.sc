// Das Spielfeld mit 40 Feldern initialisieren
val spielfeld: Array[String] = Array.fill(40)("0")

// Häuser der Spieler (jeweils 4 Felder pro Spieler)
val House1, House2, House3, House4: Array[String] = Array.fill(4)("H")

// Beispielbelegung der Felder
spielfeld(2) = "S"   // Spieler A auf Feld 0
spielfeld(12) = "S"  // Spieler B auf Feld 10
spielfeld(22) = "S"  // Spieler C auf Feld 20
spielfeld(32) = "S"  // Spieler D auf Feld 30

spielfeld(14) = "A"
spielfeld(15) = "B"

// Funktion zur Umwandlung in ein 2D-Layout und Ausgabe
def spielfeldAusgeben(spielfeld: Array[String]): Unit = {
  println("Herzlich Willkommen bei unserem tollen Mensch ärgere dich nicht :)")
  println("Hier ist ein erster Entwurf unseres Spielfeldes:\n")

  val space = " "

  // 2D-Spielfeld (basierend auf der Mensch-ärgere-dich-nicht Form)
  val layout: Array[Array[String]] = Array(
    Array(space * 7, spielfeld(10), spielfeld(11), spielfeld(12), space * 7),
    Array(space * 7, spielfeld(9), House1(0), spielfeld(13), space * 7),
    Array(space * 7, spielfeld(8), House1(1), spielfeld(14), space * 7),
    Array(space * 7, spielfeld(7), House1(2), spielfeld(15), space * 7),
    Array(spielfeld(2), spielfeld(3), spielfeld(4), spielfeld(5), spielfeld(6), House1(3), spielfeld(16), spielfeld(17), spielfeld(18), spielfeld(19), spielfeld(20)),
    Array(spielfeld(1), House4(0), House4(1), House4(2), House4(3), space, House2(0), House2(1), House2(2), House2(3), spielfeld(21)),
    Array(spielfeld(0), spielfeld(39), spielfeld(38), spielfeld(37), spielfeld(36), House3(3), spielfeld(26), spielfeld(25), spielfeld(24), spielfeld(23), spielfeld(22)),
    Array(space * 7, spielfeld(35), House3(2), spielfeld(27), space * 7),
    Array(space * 7, spielfeld(34), House3(1), spielfeld(28), space * 7),
    Array(space * 7, spielfeld(33), House3(0), spielfeld(29), space * 7),
    Array(space * 7, spielfeld(32), spielfeld(31), spielfeld(30), space * 7),
  )

  // Ausgabe des Spielfelds
  layout.foreach { row =>
    println(row.mkString(" "))
  }

  println("\nDanke für die Aufmerksamkeit, wir wünschen Ihnen noch einen schönen Tag\n")
}

spielfeldAusgeben(spielfeld) //Liste an Häusern muss noch übergeben werden