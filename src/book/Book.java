package book;
import java.util.Arrays;

public class Book {
    // 1. Attributes
    private int numberOfPages;
    private String title;
    private String ISBN;
    private String author;
    private String part;
    private boolean isOpen;
    private int currentPage;
    private String[] pagesContent;

    // Constructor for creating a book with specified number of pages, title, ISBN, author, and part
    public Book(int numberOfPages, String title, String ISBN, String author, String part, String[] pagesContent) {
        this.numberOfPages = numberOfPages;
        this.title = title;
        this.ISBN = ISBN;
        this.author = author;
        this.part = part;
        this.isOpen = false;
        this.currentPage = 0;
        this.pagesContent = pagesContent;
    }

    // Constructor for creating a book with specified title and default values for other attributes
    public Book(String title) {
        this.numberOfPages = 0;
        this.title = title;
        this.ISBN = "";
        this.author = "";
        this.part = "";
        this.isOpen = false;
        this.currentPage = 0;
        this.pagesContent = new String[numberOfPages];
    }

    // Getters and setters for all attributes
    public int getNumberOfPages() {
        return this.numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
        this.pagesContent = new String[numberOfPages];
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPart() {
        return part;
    }

    public void setPart(String part) {
        this.part = part;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public int getCurrentPage() {
        return currentPage;
    }

    public String[] getPagesContent() {
        return pagesContent;
    }

    public String getPageContent(int n) {
        return pagesContent[n];
    }


    public void setPagesContent(String content, int page) {
        pagesContent[page] = content;
        System.out.println("page: "+page+" content: "+pagesContent[page]);
    }

    // Method to open the book
    public void open() {
        isOpen = true;
    }

    // Method to close the book
    public void close() {
        isOpen = false;
    }

    // Method to turn to the next page
    public void turnPage() {
        if (currentPage < numberOfPages - 1) {
            currentPage++;
        }
    }

    // Method to turn to the previous page
    public void turnPageBack() {
        if (currentPage > 0) {
            currentPage--;
        }
    }

    //
    public String getFirstTenCharactersOfPage(int pageNumber) {
        if (pageNumber < 1 || pageNumber > numberOfPages) {
            System.out.println("Wrong page");
        }
        String pageContent = pagesContent[pageNumber - 1];
        if (pageContent == null) {
            System.out.println("Page content not set yet");
        }
        return pageContent.substring(0, Math.min(pageContent.length(), 10));
    }

    // Method to look for a word and return in which pages it appears
    public int[] findWord(String word) {
        int[] pagesWithWord = new int[this.numberOfPages];
        int count = 0;

        for (int i = 0; i < this.numberOfPages; i++) {
          //  System.out.println("i "+i);
                if (this.pagesContent[i].toString().contains(word)) {
                    pagesWithWord[count] = i;
                   // System.out.println("once met the word: "+word+ " on page: "+i+" count:"+pagesWithWord[count]);
                    count++;
                }
        }
        return pagesWithWord;//Arrays.copyOf(pagesWithWord, count);//new int[];// String[] a2 = new String[9];
    }
    //Add a method to copy a page from a distinct book to the current one in the page indicated within the method.
    public void copyPage(Book other, int pageFrom, int pageDestination){
        String [] strToCopy= other.getPagesContent();
        System.out.println("era "+this.pagesContent[pageDestination]);
        this.pagesContent[pageDestination]=strToCopy[pageFrom];
        System.out.println("ahora :"+this.pagesContent[pageDestination]);
    }
}



//4 Add a method to verify if one page is equal to the page in another book.
//5 Add a method to insert n new pages Use the method System.arraycopy() to copy one array into the
//other


//String a1[] = {"Avila","Burgos","León","Palencia","Salamanca", "Segovia","Soria","Valladolid","Zamora"};
//String[] a2 = new String[9];
//System.arraycopy(a1,0,a2,0,a1.length);
