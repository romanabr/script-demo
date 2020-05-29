package demo;

import demo.dsl.Card;
import demo.dsl.Client;

public class Service {

    public Card findCardByNumber(String cardNubmer){
        //вызываем интеграцию и получаем данные для создания объекта карты
        Card card= new Card();
        card.id = 123L;
        card.number = cardNubmer;
        card.type = "Credit";

        return card;
    }

    public Card findClientCard(Long id){
        return new Card();
    }

    public String getObjectById(Long id) {

        return "object" + id;
    }

    public void save(Client object) {
        System.out.println("Save: " + object);
    }
}