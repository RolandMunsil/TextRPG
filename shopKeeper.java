//Bryden Robertson
import java.util.ArrayList;
public class shopKeeper{
    private String name;
    private String type;
    private int level;
    private ArrayList Item = new ArrayList();
    public shopKeeper(String n, String t, int l){
        name = n;
        type = t;
        level = l;
    }
    public ArrayList getItems(){
        return Item;
    }
}
        