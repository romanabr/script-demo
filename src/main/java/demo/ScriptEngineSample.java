package demo;

import demo.dsl.Card;
import demo.dsl.Client;
import demo.dsl.Transaction;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ScriptEngineSample {
    public static void main(String[] args) throws FileNotFoundException, ScriptException {
        ScriptEngine engine = new ScriptEngineManager().getEngineByExtension("js");
        engine.put("service", new Service());
        engine.put("card", new Card());
        engine.put("client", new Client());
        engine.put("transaction", new Transaction());

        Object result = engine.eval(new FileReader("src/main/java/demo/script.js"));

        System.out.println("result: " + result);
    }
}
