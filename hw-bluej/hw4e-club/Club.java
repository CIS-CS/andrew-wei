import java.util.ArrayList;

/**
 * Store details of club memberships.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Club
{
    // Define any necessary fields here ...
    private ArrayList<Membership> members;
    
    /**
     * Constructor for objects of class Club
     */
    public Club()
    {
        // Initialise any fields here ...
        members = new ArrayList<Membership>();
    }

    /**
     * Add a new member to the club's list of members.
     * @param member The member object to be added.
     */
    public boolean join(Membership member) 
    {
        if(members.size() > 0) {
            for(Membership name : members) {
                if((name.getName()).equals(member.getName())) {
                    System.out.println("Already in club.");
                    return false;
                }
            }
            members.add(member);
            System.out.println("Aew member accepted.");
            return true;
        }
        else {
            members.add(member);
            System.out.println("First member!");
            return true;
        }
    }

    /**
     * @return The number of members (Membership objects) in
     *         the club.
     */
    public int numberOfMembers()
    {
        return members.size();
    }
}
