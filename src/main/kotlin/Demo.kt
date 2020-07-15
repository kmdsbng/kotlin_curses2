import com.googlecode.lanterna.Symbols
import com.googlecode.lanterna.TerminalPosition
import com.googlecode.lanterna.TerminalSize
import com.googlecode.lanterna.graphics.TextGraphics
import com.googlecode.lanterna.screen.Screen
import com.googlecode.lanterna.screen.TerminalScreen
import com.googlecode.lanterna.terminal.DefaultTerminalFactory
import com.googlecode.lanterna.terminal.Terminal

fun main(args: Array<String>) {
    val terminal: Terminal = DefaultTerminalFactory().createTerminal()
    val screen: Screen = TerminalScreen(terminal)

    val tg: TextGraphics = screen.newTextGraphics()

    screen.startScreen()

    tg.putString(10, 10, "Hello, World!")


    // draw a rectangle
    tg.drawRectangle(
        TerminalPosition(3, 3),
        TerminalSize(10, 4),
        '*'
    )

    // draw a triangle
    tg.drawTriangle(TerminalPosition(42, 3), TerminalPosition(46, 12), TerminalPosition(50, 3), Symbols.CLUB)

    screen.refresh()

    screen.readInput() // readInput is blocking
    screen.stopScreen()
}
