public class Stud
{
    public boolean borrow(Resources resources) 
    {
        if (resources.checkAvail()) 
        {
            return resources.borrow();
        } 
        else 
        {
            return false;
        }
    }
}