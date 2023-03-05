package book;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // Create three books
        int numberPagesBook3=25;
        String[] pagesContentArray = new String [numberPagesBook3];
        for (int i=0; i<numberPagesBook3;i++){
            String str="Page "+numberPagesBook3;
            for (int j=0;j<35; j++){
                str=str+" "+i;
            }
            pagesContentArray[i]=str;
            System.out.println(pagesContentArray[i]);
        }
        Book book1 = new Book("The Great Gatsby");
        Book book2 = new Book("To Kill a Mockingbird");
        Book book3 = new Book(numberPagesBook3,"Holy Bible","965-09780980","","part I", pagesContentArray);

        String[] pagesContent =book3.getPagesContent();
        for (int i=0; i<book3.getNumberOfPages();i++){
            System.out.println("Book 3"+book3.getPageContent(i));
        }

        // Set the number of pages and page content for each book
        book1.setNumberOfPages(20);
        for (int i=0; i<book1.getNumberOfPages();i+=2){
            book1.setPagesContent("In my younger and more vulnerable years my father gave me some advice that I've been turning over in my mind ever since.", i);
            book1.setPagesContent("Reserving judgments is a matter of infinite hope.", i+1);
        }

       // book1.setPagesContent("I hope she'll be a fool - that's the best thing a girl can be in this world, a beautiful little fool.", 2);
        book2.setNumberOfPages(12);
        for (int i=0; i<book2.getNumberOfPages();i++){
            book2.setPagesContent("When he was nearly thirteen, my brother Jem got his arm badly broken at the elbow.", i);
           // book2.setPagesContent("Atticus was right. One time he said you never really know a man until you stand in his shoes and walk around in them.", i+1);
           // book2.setPagesContent("I think there's just one kind of folks. Folks.", i+2);
        }

        book1.copyPage(book2,1,3);
        book1.copyPage(book2,7,6);
        book3.copyPage(book3,3,5);



        // Search for a word in each book
        int[] pagesWithVulnerable = book1.findWord("vulnerable");
        System.out.println("Pages in 'The Great Gatsby' with the word 'vulnerable': " + Arrays.toString(pagesWithVulnerable));

        int[] pagesWithShoes = book2.findWord("he");
        System.out.println("Pages in 'To Kill a Mockingbird' with the word 'he': " + Arrays.toString(pagesWithShoes));

        String firstTenCharactersOfPage = book1.getFirstTenCharactersOfPage(1);
        System.out.println("First 10 characters: "+firstTenCharactersOfPage);
        firstTenCharactersOfPage = book2.getFirstTenCharactersOfPage(2);
        System.out.println("First 10 characters: "+firstTenCharactersOfPage);
    }
 }

