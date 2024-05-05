public class Book implements Resources 
{
    private String title;

    public Book(String title) 
    {
        this.title = title;
    }

    @Override
    public String getTitle() 
    {
        return title;
    }

    @Override
    public boolean checkAvail() 
    {
        return true;
    }

    @Override
    public boolean borrow() 
    {    
        return true;
    }
}