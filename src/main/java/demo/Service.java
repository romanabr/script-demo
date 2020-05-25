package demo;

public class Service {

    public String getObjectById(Long id) {

        return "object" + id;
    }

    public void save(String object) {
        System.out.println("Save: " + object);
    }
}