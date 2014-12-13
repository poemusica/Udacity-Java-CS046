// BlueJ project: lesson7/friends1

// This is part of the Person class from lesson 3.
// A String is not the right way to store the friends of a Person
// We need to refactor this code.
// Change the friends variable to store an ArrayList<String>
// that contains the names of the friends.
// Re-implement the addFriend and getFriends methods.
public class Person
{
    private String name;
    private String friends;
    private static final String SEPARATOR = ", ";

    public Person(String name)
    {
        this.name = name;
        this.friends = "";
    }

    /**
     * Adds the given friend to this Person's friends list.
     * @param friend the friend to add.
     */
    public void addFriend(Person friend)
    {
        friends = friends + friend.name + SEPARATOR;
    }

    /**
     * Gets a list of all of this Person's friends.
     * @return the names of the friends separated by a comma and a space.
     *     e.g. "Sara, Cheng-Han, Cay"
     */
    public String getFriends()
    {
        if (friends.length() == 0)
        {
            return "";
        }
        else
        {
            return friends.substring(0, friends.length() - SEPARATOR.length());
        }
    }

    /**
     * Gets a friend at a given index.
     * @param friendIndex the index at which to find the friend (starting at 0)
     * @return the name of the friend at friendIndex, or "" if the friend is not present
     */
    public String getFriend(int friendIndex)
    {
        int start = 0;
        // Skip to the beginning of the name with the given index
        for (int i = 0; i < friendIndex; i++)
        {
            int separatorIndex = friends.indexOf(SEPARATOR, start);
            if (separatorIndex == -1)
            {
                return "";
            }
            start = separatorIndex + SEPARATOR.length();
        }
        int nextSeparatorIndex = friends.indexOf(SEPARATOR, start);
        return friends.substring(start, nextSeparatorIndex);
    }
}
