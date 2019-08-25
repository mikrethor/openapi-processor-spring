/**
 * This class is auto generated by the original authors.
 * DO NOT EDIT.
 */

package generated.api;

import generated.model;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

interface Api {

    @GetMapping(path = "/book_inline", produces = {"application/json"})
    ResponseEntity<Map<String, Object>> getBook_inline();

    @GetMapping(path = "/book", produces = {"application/json"})
    ResponseEntity<Book> getBook();

}