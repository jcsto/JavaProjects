/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarycatalogue;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author JC
 */
public class LibraryCatalogue {

    Map<String, Book> bookCollection = new HashMap<String, Book>();
    int currentDay = 0;
    int lengthOfCheckoutPeriod = 7;
    double initialLateFee = 0.50;
    double feePerLateDay = 1.00;
    
    // Constructors
    public LibraryCatalogue(Map<String, Book> collection) {
        this.bookCollection = collection;
    }
    
    public LibraryCatalogue(Map<String, Book> collection, int lengthOfCheckOutPeriod, double initialLateFee, double feePerLateDay) {
        this.bookCollection = collection;
        this.lengthOfCheckoutPeriod = lengthOfCheckoutPeriod;
        this.initialLateFee = initialLateFee;
        this.feePerLateDay = feePerLateDay;
    }
    
    // GETTERS
    public int getCurrentDay() {
        return this.currentDay;
    }
    
    public Map<String, Book> getBookCollection() {
        return this.bookCollection;
    }
    
    public Book getBook(String bookTitle) {
        return getBookCollection().get(bookTitle);
    }
    
    public int getLenthOfCheckoutPeriod() {
        return this.lengthOfCheckoutPeriod;
    }
    
    public double getInitialLateFee() {
        return this.initialLateFee;
    }
    
    public double getFeePerLateDay() {
        return this.feePerLateDay;
    }
    
    // SETTERS
    public void nextDay() {
        currentDay++;
    }
    
    public void setDay(int day) {
        currentDay = day;
    }
    
    // INSTANCE METHODS
    public void checkOutBook(String title) {
        Book book = getBook(title);
        if (book.getIsCheckedOut()) {
            sorryBookAlreadyCheckedOut(book);
        }
        else {
            book.setIsCheckedOut(true, currentDay);
            System.out.println("You just checked out " + title + 
                    ". It is due on day " + (getCurrentDay() + getLenthOfCheckoutPeriod()) + ".");
        }
    }
    
    public void returnBook(String title) {
        Book book = getBook(title);
        int daysLate = currentDay - (book.getDayCheckedOut() + getLenthOfCheckoutPeriod());
        if (daysLate > 0) {
            System.out.println("You owe the library $" + 
                    (getInitialLateFee() + daysLate * getFeePerLateDay()) + 
                    " because your book is " + daysLate + " days overdue.");
        }
        else {
            System.out.println("Book returned. Thank you.");
        }
        book.setIsCheckedOut(false, -1);
    }
    
    public void sorryBookAlreadyCheckedOut(Book book) {
        System.out.println("Sorry, " + book.getTitle() + " is already checked out. It should be back on day " + 
                (book.getDayCheckedOut() + getLenthOfCheckoutPeriod()) + ".");
    } 
    
    
    
    public static void main(String[] args) {
        Map<String, Book> bookCollection = new HashMap<String, Book>();
        Book harry = new Book("Harry Potter", 827321, 999855);
        bookCollection.put("Harry Potter", harry);
        LibraryCatalogue lib = new LibraryCatalogue(bookCollection);
        lib.checkOutBook("Harry Potter");
        lib.nextDay();
        lib.nextDay();
        lib.checkOutBook("Harry Potter");
        lib.setDay(17);
        lib.returnBook("Harry Potter");
        lib.checkOutBook("Harry Potter");
    }
    
    
}
