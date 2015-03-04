package dcll.amel;

/**
 * Created by annia on 04/03/2015.
 */
public class Item {
    Object value;
    Item(Object v){
        setValue(v);
    }

    public Object getValue(){
        return value;
    }

    public void setValue(Object v){
        value = v;
    }
}
