import org.junit.Test;
import static org.junit.Assert.*;

public class BalancedPartitioningTest {

    @Test
    public void testExample1() {
        int[] nums = {3, 1, 4, 2, 2};
        assertEquals(0, BalancedPartitioning.balancedPartition(nums));
    }

    @Test
    public void testExample2() {
        int[] nums = {1, 6, 11, 5};
        assertEquals(1, BalancedPartitioning.balancedPartition(nums));
    }

    @Test
    public void testEmptyArray() {
        int[] nums = {};
        assertEquals(0, BalancedPartitioning.balancedPartition(nums));
    }

    @Test
    public void testSingleElement() {
        int[] nums = {10};
        assertEquals(10, BalancedPartitioning.balancedPartition(nums));
    }

    @Test
    public void testLargeNumbers() {
        int[] nums = {100, 99, 1, 2, 98};
        assertEquals(0, BalancedPartitioning.balancedPartition(nums));
    }

    @Test
    public void testNegativeNumbers() {
        int[] nums = {-1, -2, -3, -4, -5};
        assertEquals(3, BalancedPartitioning.balancedPartition(nums));
    }

    @Test
    public void testAllEqual() {
        int[] nums = {1, 1, 1, 1, 1};
        assertEquals(0, BalancedPartitioning.balancedPartition(nums));
    }

    @Test
    public void testAllEqual2() {
        int[] nums = {2, 2, 2, 2, 2};
        assertEquals(0, BalancedPartitioning.balancedPartition(nums));
    }

    @Test
    public void testAllEqual3() {
        int[] nums = {3, 3, 3, 3, 3};
        assertEquals(0, BalancedPartitioning.balancedPartition(nums));

}
