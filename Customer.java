package discountsystem;

/**
 *
 * @author Mayankkumar S. Patel 115493165
 */
import java.util.*;

public class Customer{
    private String name;
    private String memberType;
    private boolean member = false;
    
    
    public Customer(String name){
        this.name = name; 
       
    }
    
    public String getName(){
        return name;
    }
    
    public boolean isMember(){    
        return member;
    }

    public void setMember(boolean member){
        
        this.member = member;
    }
    
    public String getMemberType(){
        return memberType;
    }
    
    public void setMemberType(String type){
        this.memberType = type;
    }
    
    @Override
    public String toString(){
        
        return "Customer Name: " + getName() + "\nMember Type: " + getMemberType();
    }
}