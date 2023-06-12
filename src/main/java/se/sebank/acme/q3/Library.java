package se.sebank.acme.q3;

import jakarta.persistence.OneToMany;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import se.sebank.acme.q3.Book;

import java.util.List;

@Entity
@Data
public class Library {

    @Id
    Long id;

    String name;

    @OneToMany(mappedBy = "libraryId")
    List<Book> books;

}
