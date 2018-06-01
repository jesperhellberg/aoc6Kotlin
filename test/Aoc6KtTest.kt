import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class Aoc6KtTest {

    @Test
    fun testVersion1() {
        val input = getInput("testInput.txt")
        assertEquals(5, version1(input))
    }

    @Test
    fun testVersion2() {
        var input = getInput("testInput.txt")
        version1(input)
        assertEquals(4, version1(input))
    }
}