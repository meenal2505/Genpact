package Feb8;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
enum Catagories 
{
    Stationary,
    Kitchen,
    Digital
}
class Flipkart 
{
    static Map<String, ArrayList<Flipkart>> flipkart = new HashMap<>();
    private String item;
    private int price;
    private int disc;
    private String catagory;
    private String review;
    public Flipkart() {}
    public void inflateData(ArrayList<Flipkart> f) 
    {
        for (Flipkart ff : f) 
        {
            if(flipkart.containsKey(ff.catagory))
            {
                ArrayList<Flipkart>arrayList=flipkart.get(ff.catagory);
                arrayList.add(ff);
                flipkart.put(ff.catagory,arrayList);
            }
            else
            {
                ArrayList<Flipkart>arrayList=new ArrayList<>();
                arrayList.add(ff);
                flipkart.put(ff.catagory,arrayList);
            }
        }
    }
    public Flipkart(String item, int price, int disc, String category, String review) 
    {
        this.item = item;
        this.price = price;
        this.disc = disc;
        this.catagory = category;
        this.review = review;
    }
    public void display() 
    {
        for (String cat : flipkart.keySet()) 
        {
            System.out.println(cat);
            for (Flipkart f : flipkart.get(cat)) 
            {
                System.out.println("\t Item: " + f.item+ " ₹"+f.price);
                System.out.println("\t\t Review: " + f.review);
            }
        }
    }
}
public class Homework3 
{
    public static void main(String[] args) 
    {
        Flipkart flipkart1 = new Flipkart("Laptop", 200000, 2, Catagories.Digital.toString(), "Very Nice Product");
        Flipkart flipkart2 = new Flipkart("Ipad", 150000, 2, Catagories.Digital.toString(), "Very Nice ");
        Flipkart flipkart3 = new Flipkart("Tea", 200, 2, Catagories.Kitchen.toString(), "Very Nice Tea");
        Flipkart flipkart4 = new Flipkart("Pen", 20, 2, Catagories.Stationary.toString(), "Very Nice Pen");
        ArrayList<Flipkart> f = new ArrayList<>();
        Flipkart obj = new Flipkart();
        f.add(flipkart1);
        f.add(flipkart2);
        f.add(flipkart3);
        f.add(flipkart4);
        obj.inflateData(f);
        obj.display();
    }
}