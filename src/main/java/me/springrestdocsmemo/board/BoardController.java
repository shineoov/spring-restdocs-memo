package me.springrestdocsmemo.board;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class BoardController {

    @GetMapping("/board/{id}")
    public ResponseEntity<BoardDto> getBoard(@PathVariable int id) {

        BoardDto boardDto = BoardDto.builder()
                .title("GET TITLE")
                .writer("ADMIN")
                .build();


        return ResponseEntity.ok(boardDto);
    }

    @PostMapping("/board")
    public ResponseEntity<BoardDto> saveBoard(@RequestBody BoardDto boardDto) {
        URI uri = linkTo(methodOn(BoardController.class).saveBoard(boardDto)).toUri();
        return ResponseEntity.created(uri).body(boardDto);
    }
}
