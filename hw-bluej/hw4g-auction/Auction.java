import java.util.*;

/**
 * A simple model of an auction.
 * The auction maintains a list of lots of arbitrary length.
 *
 * @author David J. Barnes and Michael Kölling.
 * @version 2011.07.31
 */
public class Auction
{
    // The list of Lots in this auction.
    private ArrayList<Lot> lots;
    // The number that will be given to the next lot entered
    // into this auction.
    private int nextLotNumber;

    /**
     * Create a new auction.
     */
    public Auction()
    {
        lots = new ArrayList<Lot>();
        nextLotNumber = 1;
    }

    /**
     * Enter a new lot into the auction.
     * @param description A description of the lot.
     */
    public void enterLot(String description)
    {
        lots.add(new Lot(nextLotNumber, description));
        nextLotNumber++;
    }

    /**
     * Show the full list of lots in this auction.
     */
    public void showLots()
    {
        for(Lot lot : lots) {
            System.out.println(lot.toString());
        }
    }
    
    /**
     * Make a bid for a lot.
     * A message is printed indicating whether the bid is
     * successful or not.
     * 
     * @param lotNumber The lot being bid for.
     * @param bidder The person bidding for the lot.
     * @param value  The value of the bid.
     */
    public boolean makeABid(int lotNumber, Person bidder, long value)
    {
        Lot selectedLot = getLot(lotNumber);
        if(selectedLot != null) {
            Bid bid = new Bid(bidder, value);
            boolean successful = selectedLot.bidFor(bid);
            if(successful) {
                System.out.println("The bid for lot number " +
                                   lotNumber + " was successful.");
                                   
                return true;
            }
            else {
                // Report which bid is higher.
                Bid highestBid = selectedLot.getHighestBid();
                System.out.println("Lot number: " + lotNumber +
                                   " already has a bid of: " +
                                   highestBid.getValue());
                
                return false;
            }
        }
        
        return false;
    }

    /**
     * Return the lot with the given number. Return null
     * if a lot with this number does not exist.
     * @param lotNumber The number of the lot to return.
     */
    public Lot getLot(int lotNumber)
    {
        if((lotNumber >= 1) && (lotNumber < nextLotNumber)) {
            Lot selectedLot = null;
            
            for(Lot lot : lots) {
                if(lot.getNumber() == lotNumber) {
                    selectedLot = lot;
                }
            }

            if(selectedLot.getNumber() != lotNumber) {
                System.out.println("Internal error: Lot number " +
                                   selectedLot.getNumber() +
                                   " was returned instead of " +
                                   lotNumber);
                // Don't return an invalid lot.
                selectedLot = null;
            }
            return selectedLot;
        }
        else {
            System.out.println("Lot number: " + lotNumber +
                               " does not exist.");
            return null;
        }
    }
    
    public int close() {
        int sold = 0;
        
        for(Lot lot : lots) {
            System.out.println(lot.toString());
            
            if(lot.getHighestBid() != null) {
                sold++;
                System.out.println(lot.getHighestBid().getBidder());
            }
            else {
                System.out.println("No Bids");
            }
        }
        
        return sold;
    }
    
    public ArrayList<Lot> getUnsold() {
        ArrayList<Lot> unsold = new ArrayList<Lot>();
        
        for(Lot lot : lots) {
            if(lot.getHighestBid() == null) {
                unsold.add(lot);
                System.out.println(lot.toString());
            }
        }
        
        return unsold;
    }
    
    public boolean removeLot(int number) {
        boolean exist = false;
        
        Iterator<Lot> iter = lots.iterator();
        while(iter.hasNext()) {
            Lot lot = iter.next();
            
            if(lot.getNumber() == number) {
                exist = true;
                iter.remove();
            }
        }
        
        return exist;
    }
    
    public int index(int lotNumber) {
        int index = lots.indexOf(lotNumber);
        return index;
    }
}
