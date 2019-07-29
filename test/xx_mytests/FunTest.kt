package xx_mytests

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FunTest {
    @Test
    fun testFunAssignments() {
        fun sum(p1 : Int, p2 : Int) : Int {
            return p1 + p2
        }

        assertEquals(5, sum(3, 2))

        fun altSum (p1 : Int, p2 : Int = 6) = sum(p1, p2 + 3)

        assertEquals(8, altSum(3, 2))

        assertEquals(10, altSum(1))
    }
}