public class FindMaximum
{
    public static void main(String args[])
    {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(findMaximum(nums, 0));
    }

    public static int findMaximum(int[] array, int i)
    {
        if (i == array.length - 1)
        {
            return array[i];
        }

        int max = findMaximum(array, i + 1);

        if (max > array[i])
        {
            return max;
        }

        return array[i];
    }
}
