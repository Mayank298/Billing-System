package discountsystem;
import java.util.*;
/**
 *
 * @author Mayankkumar S. Patel 115493165
 */
public class Visit extends DiscountRate{
    Customer c;
    Date date;
     double serviceExpense = 0.0;
     double productExpense = 0.0;
    public Visit(String name, Date date){
        this.date = date;
        c = new Customer(name);
        
    }
    public void setMember(String s){
        c.setMemberType(s);
    }
    public String getName(){
        return c.getName();
    }
    
    public double getServiceExpence(){
        return serviceExpense;
    }
      
    public void setServiceExpence(double ex){
      serviceExpense = ex;
    }
    
    public double getProductExpence(){
        return productExpense;
    }
    
    public void setProductExpence(double ex){
        productExpense = ex;
    }
    
    public double getTotalExpence(){
        double total;
        total = this.productExpense + this.serviceExpense;
        total = total - (total * (getProductDiscountRate(c.getMemberType()) + getServiceDiscountRate(c.getMemberType())));
        return total;
    }
    
    @Override
    public String toString(){
        
        return c.toString() + "\nServiceExpejce: " + getServiceExpence() + "\nProductExpense: " + getProductExpence() + "\nTotal: " + this.getTotalExpence();
    }
}