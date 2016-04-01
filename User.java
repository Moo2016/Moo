
import java.util.ArrayList;
import java.util.GregorianCalendar;


public class User {
    
    private String name;
    private GregorianCalendar birthday;
    private String email;
    private int mooPoints;
    private ArrayList<Critique> message;
    
    public User(String name, GregorianCalendar birthday, String email, int points){
        this.name = name;
        this.birthday = birthday;
        this.email = email;
        this.mooPoints = points;
        
        this.message = new ArrayList<Critique>();
    }
    
    public void setName(String newName){
        this.name = newName;
    }
    
    public void setBirthday(GregorianCalendar newBirthday){
        this.birthday = newBirthday;
    }
    
    public void setEmail(String newEmail){
        this.email = newEmail;
    }
    
    public String getName(){
        return name;
    }
    
    public GregorianCalendar getBirthday(){
        return birthday;
    }
    
    public String email(){
        return email;
    }
    
    public int getMooPoints(){
        return mooPoints;
    }
    
    public void addActivityCritique(){}
}
