public class Palindrome
{
    public static void main(String args[])
    {
        String[] palindromes = {"madam", "racecar", "level", "rotator"};
        for (String str : palindromes)
        {
            System.out.println(isPalindrome(str));
        }
    }

    public static boolean isPalindrome(String check)
    {
        if (check.length() <= 1)
        {
            return true;
        }

        if (!(check.substring(0, 1).equals(check.substring(check.length() - 1))))
        {
            return false;
        }

        return isPalindrome(check.substring(1, check.length() - 1));
    }
}