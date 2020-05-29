package demo.dsl;

import java.util.HashMap;
import java.util.Map;

public class Client {

    public Long id;

    public String firstName;

    public String lastName;

    private Map<String, String> atributes = new HashMap<>();

    public void atributes(String key, String value){
        atributes.put(key, value);
    }



}
