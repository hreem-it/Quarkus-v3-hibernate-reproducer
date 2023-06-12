package se.sebank.acme.q3;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Book {

    @Id
    Long id;

    Long libraryId;

    String name;

    @ManyToOne
    @JoinColumn(name = "library_id")
    private Library library;

}
