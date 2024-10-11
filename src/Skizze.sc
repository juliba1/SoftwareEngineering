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

layout.foreach { row =>
  println(row.mkString(" "))
}
