/**
   This class describes words in a document. There are a couple
   of bugs in this class.
*/
public class Word
{
    private String text;

    /**
       Constructs a word by removing leading and trailing non-
       letter characters, such as punctuation marks.
       @param s the input string
    */
    public Word(String s)
    {
        text = s.toLowerCase();
        int i = 0;

        while (i < s.length() && !Character.isLetter(s.charAt(i)))
        {
            i++;
        }
        int j = s.length() - 1;
        while (j > i && !Character.isLetter(s.charAt(j)))
        {
            j--;
        }
        text = s.substring(i, j);
    }

    /**
       Returns the text of the word, after removal of the
       leading and trailing non-letter characters.
       @return the text of the word
    */
    public String getText()
    {
        return text;
    }

    /**
       Counts the syllables in the word.
       @return the syllable count
    */
    public int countSyllables()
    {
        int count = 0;
        int end = text.length() - 1;
        if (end < 0)
        {
            return 0;    // The empty string has no syllables
        }

        // An e at the end of the word doesn't count as a vowel
        if (text.endsWith("e"))
        {
            end--;
        }

        boolean insideVowelGroup = false;
        for (int i = 0; i <= end; i++)
        {
            String letter = text.substring(i, i + 1);
            if ("aeiou".contains(letter))
            {
                // letter is a vowel
                if (!insideVowelGroup)
                {
                    // Start of new vowel group
                    count++;
                    insideVowelGroup = true;
                }
            }
        }

        // Every word has at least one syllable
        if (count == 0)
        {
            count = 1;
        }

        return count;
    }
}
