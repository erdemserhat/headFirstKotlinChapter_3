package test
import defineWinner
import org.junit.Assert
import org.junit.Test
import java.awt.print.Paper

class TestRockPaperScissorsGame {

    @Test
    fun testGame() {
        var result = defineWinner("Paper", "Paper")
        Assert.assertEquals("Draw!", result)

        result = defineWinner("Rock", "Paper")
        Assert.assertEquals("You lost!", result)

        result = defineWinner("Paper", "Rock")
        Assert.assertEquals("You won!", result)

        result = defineWinner("Rock", "Rock")
        Assert.assertEquals("Draw!", result)

        result = defineWinner("Scissors", "Scissors")
        Assert.assertEquals("Draw!", result)

        result = defineWinner("Rock", "Scissors")
        Assert.assertEquals("You won!", result)

        result = defineWinner("Scissors", "Rock")
        Assert.assertEquals("You lost!", result)

        result = defineWinner("Paper", "Scissors")
        Assert.assertEquals("You lost!", result)

        result = defineWinner("Scissors", "Paper")
        Assert.assertEquals("You won!", result)
    }

    }


