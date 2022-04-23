import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TwoSumKtTest : FunSpec({
    context("examples") {
        test("nums = [2,7,11,15], target = 9") {
            twoSum(intArrayOf(1, 7, 11, 15), 9).shouldBe(intArrayOf(0, 1))

        }
    }
})