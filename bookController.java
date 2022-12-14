import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class BookController {

    BookRepository repository;

    @GetMapping("/book")
    public List<Book> getAllBooks() {
        return repository.findAll();
    }

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable Long id) {
        return repository.findById(id).get();
    }

    @PostMapping("/book")
    public Book saveBivro(@RequestBody Book book) {
        return repository.save(book);
    }

    @DeleteMapping("/book/{id}")
    public void deleteBook(@PathVariable Long id) {
        repository.deleteById(id);
    }

}