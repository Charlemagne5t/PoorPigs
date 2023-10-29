import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {
    @Test
    public void poorPigsTest1() {
        int buckets = 4;
        int minutesToDie = 15;
        int minutesToTest = 14;
        int expected = 2;
        int actual = new Solution().poorPigs(buckets, minutesToDie, minutesToTest);

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void poorPigsTest2() {
        int buckets = 4;
        int minutesToDie = 15;
        int minutesToTest = 30;
        int expected = 2;
        int actual = new Solution().poorPigs(buckets, minutesToDie, minutesToTest);

        Assert.assertEquals(expected, actual);
    }
}
