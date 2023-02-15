package tyler.bookcrud.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
@Table(name="books")
public class Book {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank
    @Size(min=1, message="must include title")
    private String title;

    @NotNull
    @Size(min=2, max=10, message="that's not really your name!!!")
    private String author;

    private Integer pages;

    // needed to be a Java Bean
    public Book() {
    }


    public Book(String title, String author, Integer pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }


    
    // needed to be a Java Bean
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return this.title;
    }


    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPages() {
        return this.pages;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }



    
}
