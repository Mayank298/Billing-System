
package discountsystem;

import java.util.*;
/**
 *
 * @author Mayankkumar S. Patel 115493165
 */

public class DiscountSystem{

    
    public static void main(String[] args) {
        
       Date now = new Date();
       Visit v = new Visit("Lilly",now);
       v.setServiceExpence(200);
       v.setMember("Gold");
       v.setProductExpence(200);
       System.out.println();
       System.out.println("+++++ Welcome To Bill's beauty salon ++++++++++");
       System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
       System.out.println(v.toString());
       System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
       System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");

       System.out.println();
       Visit a = new Visit("Emma",now);
       a.setServiceExpence(100);
       a.setMember("Silver");
       a.setProductExpence(100);
       System.out.println("+++++ Welcome To Bill's beauty salon ++++++++++");
       System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
       System.out.println(a.toString());
       System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
       System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
       System.out.println();
       Visit b = new Visit("Anna",now);
       b.setServiceExpence(300);
       b.setMember("Premium");
       b.setProductExpence(300);
       System.out.println();
       System.out.println("+++++ Welcome To Bill's beauty salon ++++++++++");
       System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
       System.out.println(b.toString());   
       System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
       System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++");
       System.out.println();
    }
    
}
