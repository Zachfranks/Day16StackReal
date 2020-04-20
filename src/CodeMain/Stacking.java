package CodeMain;

import java.util.LinkedList;
import java.util.List;

public class Stacking {


    LinkedList list;

    Stacking() {
        list = new LinkedList();

    }

    public void push(Object x){

        list.add(x);
    }
    public Object pop (){

        return list.removeLast();
    }
    public LinkedList get(){
        return list;
    }

}
