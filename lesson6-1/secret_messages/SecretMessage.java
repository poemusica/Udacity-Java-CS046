// Bluej project: secret_messages
//
// TODO: implement the read method.
//
public class SecretMessage
{
    private String encodedMessage;

    public SecretMessage(String encodedMessage)
    {
        this.encodedMessage = encodedMessage;
    }

    /**
     * Reads every 10th letter of encodedMessage and returns a string
     * with the letters it reads.
     * @return A message hidden in the garbled text
     */
    public String read()
    {
        String decodedMessage = "";
        // YOUR CODE HERE
        // Implement this method.
        return decodedMessage;
    }

    /**
     * Optional:
     * Decodes the same way as String read() but takes an index to start at.
     * There may be more than one secret message in the garbled text.
     * @return A message hidden in the garbled text starting at startingIndex
     * @param the first indexToRead
     */
    public String read(int startingIndex)
    {
        String decodedMessage = "";
        // YOUR CODE HERE
        return decodedMessage;
    }
}
