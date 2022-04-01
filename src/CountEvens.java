public class CountEvens
{
    public static void main(String args[])
    {
        int[] nums = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(countEvens(nums, 0));
    }

    public static int countEvens(int[] array, int i)
    {
        if (i >= array.length)
        {
            return 0;
        }
        if (array[i] % 2 == 0)
        {
            return 1 + countEvens(array, i + 1);
        }

        return countEvens(array, i + 1);
    }
}
