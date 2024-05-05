// Program Testing
public class TestProgram 
{
    public static void main(String[] args) 
    {
        Book book = new Book("Book 1");
        Thesis thesis = new Thesis("Thesis 1");
        Journal journal = new Journal("Journal 1");

        Stud stud = new Stud();

        if (stud.borrow(book)) 
        {
            System.out.println("You have successfully borrowed the book!");
        }
        else 
        {
            System.out.println("You have failed to borrow the book!");
        }

        if (stud.borrow(thesis)) 
        {
            System.out.println("You have successfully borrowed the thesis!");
        } 
        else 
        {
            System.out.println("You have failed to borrow the thesis!");
        }

        if (stud.borrow(journal)) 
        {
            System.out.println("You have successfully borrowed the journal!");
        } 
        else 
        {
            System.out.println("You have failed to borrow the journal!");
        }
    }
}