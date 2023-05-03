package br.edu.ifal.crosscutingconcerns;

import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class BookOnlineService {

    Map<String, Book> map = Map.of("978-3-16-148410-0", new Book(12L, "O Livro da História", "Mario"), "12345",
            new Book(13L, "O Livro da Filosofia", "Meire"));

            
    public Book getByISBN(String isbn) {
        simulateSlowService();        
        if (map.containsKey(isbn)) {
            return map.get(isbn);
        } else {
            throw new RuntimeException("ISBN não encontrado");
        }
    }


    private void simulateSlowService() {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}
