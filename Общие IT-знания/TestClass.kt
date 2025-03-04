import kotlin.test.assertEquals
import kotlinx.coroutines.test.runTest
import io.mockk.coEvery
import io.mockk.every
import io.mockk.impl.annotations.InjectMockKs
import io.mockk.mockk
import org.example.Bucket
import org.example.IllegalDiscountException
import org.example.Item
import org.example.Service
import org.example.Solution
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertThrows

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class TestClass {
    private val userToDiscount = mutableMapOf<Int, Int>().apply {
        put(1, 10)
        put(2, 100)
        put(3, 0)
        put(5, -10)
        put(6, 120)
        put(7, 15)
    }
    private val service: Service = mockk()
    private val sol = Solution(service)
    private val initBucket = Bucket(
        listOf(
            Item(1, 10000),
            Item(2, 10000),
            Item(3, 10000),
        )
    )

    private fun initMocks() {
        coEvery { service.getDiscounts() } returns userToDiscount
    }

    @Test
    fun `test usual`() = runTest {
        initMocks()

        val userId = 1
        val expectedBucket = Bucket(
            listOf(
                Item(1, 10000, 9000),
                Item(2, 10000, 9000),
                Item(3, 10000, 9000),
            )
        )

        val result = sol.getBucketWithDiscount(userId, initBucket)

        assertEquals(result, expectedBucket)
    }

    @Test
    fun `test max discount`() = runTest {
        initMocks()

        val userId = 2
        val expectedBucket = Bucket(
            listOf(
                Item(1, 10000, 0),
                Item(2, 10000, 0),
                Item(3, 10000, 0),
            )
        )

        val result = sol.getBucketWithDiscount(userId, initBucket)

        assertEquals(result, expectedBucket)
    }

    @Test
    fun `test no discount`() = runTest {
        initMocks()

        val userId = 3
        val expectedBucket = Bucket(
            listOf(
                Item(1, 10000, 10000),
                Item(2, 10000, 10000),
                Item(3, 10000, 10000),
            )
        )

        val result = sol.getBucketWithDiscount(userId, initBucket)

        assertEquals(result, expectedBucket)
    }

    @Test
    fun `test user with no discount`() = runTest {
        initMocks()

        val userId = 4
        val expectedBucket = Bucket(
            listOf(
                Item(1, 10000, 10000),
                Item(2, 10000, 10000),
                Item(3, 10000, 10000),
            )
        )

        val result = sol.getBucketWithDiscount(userId, initBucket)

        assertEquals(result, expectedBucket)
    }

    @Test
    fun `test less discount than expected`() = runTest {
        initMocks()
        val userId = 5

        assertThrows<IllegalDiscountException> { sol.getBucketWithDiscount(userId, initBucket) }
    }

    @Test
    fun `test more discount than expected`() = runTest {
        initMocks()
        val userId = 6

        assertThrows<IllegalDiscountException> { sol.getBucketWithDiscount(userId, initBucket) }
    }

    @Test
    fun `test usual complex`() = runTest {
        initMocks()

        val userId = 7
        val newBucket = Bucket(
            listOf(
                Item(1, 7700)
            )
        )
        val expectedBucket = Bucket(
            listOf(
                Item(1, 7700, 6545)
            )
        )

        val result = sol.getBucketWithDiscount(userId, newBucket)

        assertEquals(result, expectedBucket)
    }
}