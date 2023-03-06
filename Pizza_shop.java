
import java.util.*;

class Customer{
    private String name;
    private String address ;
    private String Phonenumber;

    
    public Customer(String n,String a,String p){
        name = n;
        address = a;
        Phonenumber = p;
    }

    public void pizzamenu(){
        Employee a = new Employee();
        System.out.println("Menu Pizza");
        for(String i: a.menu()){
            System.out.print( i + ", ");
        }
    }

    public String Pizza_order(String n,String s,int q){
        Employee b = new Employee( n, s, q);
        b.bill();
        return b.bill();
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

    }

    public Pizza(String n,String s,int q){
        pizza_name = n;
        size = s;
        quantity = q;
        id += 1;
    }

    private String price(Double np){
        if (size == "L"){
            pizza_price += L;
        }else if(size == "M"){
            pizza_price += M;
        }
        else if(size == "S"){
            pizza_price += S;
        }
        pizza_price += np;
        return pizza_price;

    }

}

class Employee extends Pizza{
    public String shop_name = "Top 1 Pizza";
    //public String menuPizza[] = {"Pizza_1","Pizza_2","Pizza_3","Pizza_4","Pizza_5"};
    Map<String, Double> menuPizza = new HashMap<String, Double>();
    public String name; 
    
    public Employee(){
        System.out.println(" ");
        menuPizza.put("Pizza_1",10.0);
        menuPizza.put("Pizza_2",20.0);
        menuPizza.put("Pizza_3",30.0);
        menuPizza.put("Pizza_4",40.0);
        menuPizza.put("Pizza_5",50.0);
    }

    public Employee(String n,String s,int q){
        name = n;
        super(n,s,q);
    }
    public String[] menu(){
        return menuPizza;
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
    }
}
