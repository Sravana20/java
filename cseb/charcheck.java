public class charcheck
{
    public static void main(String[]args)
    {
        char c = 'a';
        if (Character.isLetter (c))
        {
            if(c == 'a'||c=='e'||c=='i'||c=='o'||c=='u')
            {
                System.out.println("It is vowel");
            }
            else
            {
                System.out.println("It is consonant");
            }
        }
        else
        {
            System.out.println("It is not a character");
        }
    }
}
    
    
