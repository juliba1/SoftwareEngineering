// Das Spielfeld mit 40 Feldern initialisieren
val spielfeld: Array[String] = Array.fill(40)("00")

// Häuser der Spieler (jeweils 4 Felder pro Spieler)
val haeuser: Map[String, Array[String]] = Map(
  "A" -> Array.fill(4)("H"),
  "B" -> Array.fill(4)("H"),
  "C" -> Array.fill(4)("H"),
  "D" -> Array.fill(4)("H")
)

// Beispielbelegung der Felder
spielfeld(2) = "ST"   // Spieler A auf Feld 0
spielfeld(12) = "ST"  // Spieler B auf Feld 10
spielfeld(22) = "ST"  // Spieler C auf Feld 20
spielfeld(32) = "ST"  // Spieler D auf Feld 30

spielfeld(14) = "A1"

// Funktion zur Umwandlung in ein 2D-Layout und Ausgabe
def spielfeldAusgeben(spielfeld: Array[String], haeuser: Map[String, Array[String]]): Unit = {
  val space = " "

  // 2D-Spielfeld (basierend auf der Mensch-ärgere-dich-nicht Form)
  val layout: Array[Array[String]] = Array(
    Array(space * 4, spielfeld(10), spielfeld(11), spielfeld(12), space * 4),
    Array(space * 4, spielfeld(9), space, spielfeld(13), space * 4),
    Array(space * 4, spielfeld(8), space, spielfeld(14), space * 4),
    Array(space * 4, spielfeld(7), space, spielfeld(15), space * 4),
    Array(spielfeld(2), spielfeld(3), spielfeld(4), spielfeld(5), spielfeld(6), space, spielfeld(16), spielfeld(17), spielfeld(18), spielfeld(19), spielfeld(20)),
    Array(spielfeld(1), space * 9, spielfeld(21)),
    Array(spielfeld(0), spielfeld(39), spielfeld(38), spielfeld(37), spielfeld(36), space, spielfeld(26), spielfeld(25), spielfeld(24), spielfeld(23), spielfeld(22)),
    Array(space * 4, spielfeld(35), space, spielfeld(27), space * 4),
    Array(space * 4, spielfeld(34), space, spielfeld(28), space * 4),
    Array(space * 4, spielfeld(33), space, spielfeld(29), space * 4),
    Array(space * 4, spielfeld(32), spielfeld(31), spielfeld(30), space * 4),
  )

  // Ausgabe des Spielfelds
  layout.foreach { row =>
    println(row.mkString(" "))
  }

  // Ausgabe der Häuser der Spieler
  println("\nHäuser der Spieler:")
  haeuser.foreach { case (spieler, haus) =>
    println(s"Haus von Spieler $spieler: ${haus.mkString(", ")}")
  }
}

spielfeldAusgeben(spielfeld, haeuser)