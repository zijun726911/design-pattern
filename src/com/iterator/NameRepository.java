package com.iterator;

import java.util.Iterator;

public class NameRepository implements Container { 
    public String names[] = {"Robert" , "John" ,"Julie" , "Lora"}; 
    @Override 
    public Iterator getIterator() { 
        return new StringArrayIterator(names);
    }  
}
