/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Insert your name here.)
 * @version (Insert today's date here.)
 */
class Book {
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    private final boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean isCourseText) {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        courseText = isCourseText;
        refNumber = "";
        borrowed = 0;
    }

    public String getAuthor() {
        return author;
    }
    
    public void printAuthor() {
        
        System.out.println(author);
    }
    
    public String getTitle() {
        return title;
    }
    
    public void printTitle() {
        System.out.println(title);
    }
    
    public int getPages() {
        return pages;
    }
    
    public void printDetails() {
        System.out.println("Title: " + title + ", Author: " + author + ", Number of pages: " + pages 
        + ", Reference number: " + refNumber);
    }
    
    public String getRefNumber() {
        return refNumber;
    }
    
    public boolean setRefNumber(String newRefNumber) {
        if(newRefNumber.length() <= 2) {
           return false;
        }
        else {
            refNumber = newRefNumber;
            return true;
        }
        
    }
    
    public void borrow() {
        borrowed = borrowed + 1;
    }
    
    
    public int getBorrowed() {
        return borrowed;
    }
    
    public boolean isCourseText() {
        return courseText;
    }
}
