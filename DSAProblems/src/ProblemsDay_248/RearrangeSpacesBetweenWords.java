package ProblemsDay_248;

public class RearrangeSpacesBetweenWords {

    //https://leetcode.com/problems/rearrange-spaces-between-words/?envType=problem-list-v2&envId=string
    public String reorderSpaces(String text) {
        int spaceCount = 0;
        int wordsCount = 0;
        int balance = 0;
        boolean isWord = false;
        for(char i : text.toCharArray())
        {
            if(i == ' ')
            {
                if(isWord)
                {
                    wordsCount++;
                    isWord = false;
                }
                spaceCount++;
            }
            if(Character.isLetter(i))
            {
                isWord = true;
            }
        }
        if(isWord) wordsCount++;
        if(wordsCount == 1)
        {
            balance = spaceCount;
            wordsCount = 2;
            spaceCount = 0;
        }
        else
        {
            balance = spaceCount % (wordsCount-1);
        }
        int splitSpace = spaceCount / (wordsCount-1);

        StringBuilder result = new StringBuilder();
        StringBuilder space = new StringBuilder();
        StringBuilder temp = new StringBuilder();
        isWord = false;
        for(int i = 0; i < splitSpace; i++)
        {
            space.append(" ");
        }
        for(char i : text.toCharArray())
        {
            if(Character.isLetter(i))
            {
                isWord = true;
                temp.append(i);
            }
            else
            {
                if(isWord)
                {
                    result.append(temp);
                    isWord = false;
                    if(wordsCount > 1)
                    {
                        result.append(space);
                        wordsCount--;
                    }
                }
                temp = new StringBuilder();
            }
        }
        if(temp.length() != 0)
        {
            result.append(temp);
        }
        for(int i = 0; i < balance; i++)
        {
            result.append(" ");
        }
        return result.toString();
    }
    public static void main(String[] args) {

    }
}
