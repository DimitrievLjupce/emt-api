package mk.ukim.finki.lab2.config;

import mk.ukim.finki.lab2.model.Author;
import mk.ukim.finki.lab2.model.Country;
import mk.ukim.finki.lab2.service.AuthorService;
import mk.ukim.finki.lab2.service.BookService;
import mk.ukim.finki.lab2.service.CountryService;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

import static mk.ukim.finki.lab2.model.enumerations.Category.*;

@Component
public class DataInitializer {

    private final AuthorService authorService;
    private final CountryService countryService;
    private final BookService bookService;

    public DataInitializer(AuthorService authorService, CountryService countryService, BookService bookService) {
        this.authorService = authorService;
        this.countryService = countryService;
        this.bookService = bookService;
    }

    @PostConstruct
    public void initData() {
        Country country = new Country("Macedonia", "Europe");
        Country country1 = new Country("Serbia", "Europe");
        Country country2 = new Country("Italy", "Europe");
        Country country3 = new Country("Spain", "Europe");

        countryService.create(country);
        countryService.create(country1);
        countryService.create(country2);
        countryService.create(country3);

        Author author1 = new Author("Harlan", "Coben", country);
        Author author2 = new Author("C.J", "Box", country1);
        Author author3 = new Author("Lucy", "Foley", country2);
        Author author4 = new Author("Rebecca", "Serle", country);
        Author author5 = new Author("Matt", "Haig", country1);
        Author author6 = new Author("Olivie", "Blake", country2);
        Author author7 = new Author("Simone", "St.James", country);
        Author author8 = new Author("Sarah", "J.Maas", country1);
        Author author9 = new Author("Ellery", "Lloyd", country2);
        Author author10 = new Author("Graham", "Greene", country2);
        Author author11 = new Author("Vladimir", "Nabokov", country3);
        Author author12 = new Author("Walker", "Percy", country2);
        Author author13 = new Author("Marilynne", "Robinson", country1);
        Author author14 = new Author("Christina", "Stead", country3);

        authorService.create(author1);
        authorService.create(author2);
        authorService.create(author3);
        authorService.create(author4);
        authorService.create(author5);
        authorService.create(author6);
        authorService.create(author7);
        authorService.create(author8);
        authorService.create(author9);
        authorService.create(author10);
        authorService.create(author11);
        authorService.create(author12);
        authorService.create(author13);
        authorService.create(author14);

        this.bookService.create("The Match", NOVEL, author1.getId(), 2);
        this.bookService.create("Shadows Reel", THRILLER, author2.getId(), 4);
        this.bookService.create("The Book of Cold Cases", NOVEL, author6.getId(), 1);
        this.bookService.create("High Stakes", NOVEL, author7.getId(), 1);
        this.bookService.create("House of Sky and Breath", NOVEL, author8.getId(), 1);
        this.bookService.create("The Club", NOVEL, author9.getId(), 1);
        this.bookService.create("Pale Fire", DRAMA, author11.getId(), 13);
        this.bookService.create("The Moviegoer", DRAMA, author12.getId(), 9);
        this.bookService.create("The Paris Apartment", FANTASY, author3.getId(), 5);
        this.bookService.create("One Italian Summer", DRAMA, author4.getId(), 8);
        this.bookService.create("The Midnight Library", THRILLER, author5.getId(), 6);
        this.bookService.create("Housekeeping", NOVEL, author13.getId(), 6);
        this.bookService.create("The Man Who Loved Children", DRAMA, author14.getId(), 4);

    }
}
