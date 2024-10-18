var text1 = ("S" + ("O" * 9) + '\n') * 4
var playBoard = """
    a:4     o o s     b:4
            o h o
            o h o
            o h o
    s o o o o h o o o o o
    o h h h h   h h h h o
    o o o o o h o o o o s
            o h o
            o h o
            o h o
    d:4     s o o     c:4
"""

println("Line-type playboard:\n" + text1)

println("Advanced-type playboard:\n" + playBoard)

// Das Spielfeld mit 40 Feldern initialisieren
val spielfeld: Array[String] = Array.fill(40)("00")

// Häuser der Spieler (jeweils 4 Felder pro Spieler)
val House1, House2, House3, House4: Array[String] = Array.fill(4)("HH")

// Beispielbelegung der Felder
spielfeld(0) = "ST"   // Spieler A auf Feld 0
spielfeld(10) = "ST"  // Spieler B auf Feld 10
spielfeld(20) = "ST"  // Spieler C auf Feld 20
spielfeld(30) = "ST"  // Spieler D auf Feld 30

val space = " "

// 2D-Spielfeld (basierend auf der Mensch-ärgere-dich-nicht Form)
val layout: Array[Array[String]] = Array(
  Array(space * 11, spielfeld(8), spielfeld(9), spielfeld(10), space * 11),
  Array(space * 11, spielfeld(7), House1(0), spielfeld(11), space * 11),
  Array(space * 11, spielfeld(6), House1(1), spielfeld(12), space * 11),
  Array(space * 11, spielfeld(5), House1(2), spielfeld(13), space * 11),
  Array(spielfeld(0), spielfeld(1), spielfeld(2), spielfeld(3), spielfeld(4), House1(3), spielfeld(14), spielfeld(15), spielfeld(16), spielfeld(17), spielfeld(18)),
  Array(spielfeld(39), House4(0), House4(1), House4(2), House4(3), space * 2, House2(0), House2(1), House2(2), House2(3), spielfeld(19)),
  Array(spielfeld(38), spielfeld(37), spielfeld(36), spielfeld(35), spielfeld(34), House3(3), spielfeld(24), spielfeld(23), spielfeld(22), spielfeld(21), spielfeld(20)),
  Array(space * 11, spielfeld(33), House3(2), spielfeld(25), space * 11),
  Array(space * 11, spielfeld(32), House3(1), spielfeld(26), space * 11),
  Array(space * 11, spielfeld(31), House3(0), spielfeld(27), space * 11),
  Array(space * 11, spielfeld(30), spielfeld(29), spielfeld(28), space * 11),
)

layout.foreach { row =>
  println(row.mkString(" "))
}
