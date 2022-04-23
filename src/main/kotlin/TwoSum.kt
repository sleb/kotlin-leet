fun twoSum(nums: IntArray, target: Int): IntArray {
    var first = 0;
    var second = 1;

    val arr = nums.sortedArray();
    while (second < nums.size) {
        val sum = nums[first] + nums[second]
        while (sum <= target) {
            second++
        }
        if (sum == target) {
            return intArrayOf(first, second)
        }
        first++;
        second = first + 1;
    }
    throw IllegalArgumentException("twoSum not found for `target`")
}