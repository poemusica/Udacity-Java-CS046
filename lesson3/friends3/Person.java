// BlueJ project: lesson3/friends3
public class Person
{
    private String name;
    private String friends;
    private Picture pic;
    
    // TODO #1: Fill in the rest of the arguments to the Person constructor
    // The Person constructor should take in 3 additional arguments:
    // 1) String pictureName
    // 2) int xCoord
    // 3) int yCoord
    public Person (String aName, String pictureName, int xCoord, int yCoord)
    {
        name = aName;
        friends = "";

        // TODO #2: Fill in the rest of this constructor
        //
        // You need to create a local variable called picture and assign to
        // picture the picture that we want to use.
        //
        // You need need to move the picture to xCoord and yCoord.
        // You can move the picture object by calling the translate method.
        //
        // The last step is to draw the picture.
        
        pic = new Picture(pictureName);
        pic.translate(xCoord, yCoord);
        pic.draw();
    }

   // This function return the friends of this Person object
   // the function should return a String that contains all
   // the names of the friends of this Person object.
   public String getFriends()
   {
        return friends;
   }

    public void addFriend(Person friend)
    {
        friends = friends + " " + friend.name;
    }

    public void unfriend(Person nonFriend)
    {
        friends = friends.replace(" " + nonFriend.name, "");
    }
}
