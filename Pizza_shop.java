
import java.util.*;

class Customer{
    private String name;
    private String address ;
    private String Phonenumber;

    Employee a = new Employee();

    public Customer(String n,String a,String p){
        name = n;
        address = a;
        Phonenumber = p;
    }

    public void pizzamenu(){
        System.out.println("Menu Pizza");
        a.menu();
    }

    public String Pizza_order(String n,String s,int q){
        Employee a = new Employee( n, s, q);
        return a.bill();
    }

}

class Pizza{
    public static int id;
    public String pizza_name;
    private String size;
    private int quantity ;
    private double pizza_price = 0;
    public double L = 50;
    public double M = 40;
    public double S = 30;
    public Pizza(){
        pizza_name = null;
        size = null;
        quantity = 0;
    }

    public Pizza(String n,String s,int q){
        pizza_name = n;
        size = s;
        quantity = q;
        id += 1;
    }

    public String price(Double np){
        if (size == "L"){
            pizza_price += L;
        }else if(size == "M"){
            pizza_price += M;
        }
        else if(size == "S"){
            pizza_price += S;
        }
        pizza_price += np;
        pizza_price *= quantity;

        String s=String.valueOf(pizza_price);  
        return s;

    }

}

class Employee extends Pizza{
    public String shop_name = "Top 1 Pizza";
    //public String menuPizza[] = {"Pizza_1","Pizza_2","Pizza_3","Pizza_4","Pizza_5"};
    Map<String, Double> menuPizza = new HashMap<String, Double>();
    public String name; 
    
    public Employee(){
        menuPizza.put("Pizza_1",10.0);
        menuPizza.put("Pizza_2",20.0);
        menuPizza.put("Pizza_3",30.0);
        menuPizza.put("Pizza_4",40.0);
        menuPizza.put("Pizza_5",50.0);
    }

    public Employee(String n,String s,int q){
        super(n,s,q);
        name = n;
        menuPizza.put("Pizza_1",10.0);
        menuPizza.put("Pizza_2",20.0);
        menuPizza.put("Pizza_3",30.0);
        menuPizza.put("Pizza_4",40.0);
        menuPizza.put("Pizza_5",50.0);
        
    }
    public void menu(){
        System.out.println(menuPizza);
       
    }

    public String bill(){

        String p = super.price(menuPizza.get(name));
        return p;
    }
    

}


public class Pizza_shop {
    public static void main(String[] args) {
        Customer c1 = new Customer("gus", "bankok", "0123");
        c1.pizzamenu();
        System.out.println(" = " + c1.Pizza_order("Pizza_2", "M", 2) + " B.");
        //c1.Pizza_order("Pizza_2", "M", 2);
    }
}
