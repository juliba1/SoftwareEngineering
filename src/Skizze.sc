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
