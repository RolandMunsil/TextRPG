import java.util.ArrayList;

public class ShopKeeper{
    private String name;
    private String type;
    private int level;
    private ArrayList<Item> items = new ArrayList<Item>();
    
    public ShopKeeper(String name, String type, int level){
        this.name = name;
        this.type = type;
        this.level = level;
    }
    public ArrayList<Item> getItems(){
        return items;
    }
}
        