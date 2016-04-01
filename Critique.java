
import java.util.ArrayList;
import java.util.GregorianCalendar;


public class Critique {
    private String message;
    private GregorianCalendar date;
    private int numberOfLikes;
    private ArrayList<Critique> listOfComments;
    
    public Critique(String message, GregorianCalendar date, int numberOfLikes){
        this.message = message;
        this.date = date;
        this.numberOfLikes = numberOfLikes;
        
        listOfComments = new ArrayList<Critique>();
    }
    
    public String getMessage(){
        return message;
    }
    
    public void setMessage(String message){
        this.message = message;
    }
    
    public GregorianCalendar getDate(){
        return date;
    }
    
    public void setDate(GregorianCalendar date){
        this.date = date;
    }
    
    public int getNumberOfLikes(){
        return numberOfLikes;
    }
    
    public void addNumberOfLikes(int add){
        numberOfLikes += add;
    }
    
    public void subtractNumberOfLikes(int subtract){
        numberOfLikes -= subtract;
    }
    
    public ArrayList<Critique> getListOfComments(){
        return listOfComments;
    }
    
    public void addMoreComments(Critique critique){
        listOfComments.add(critique);
    }
}
