package me.springrestdocsmemo.board;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class BoardController {

    @PostMapping("/board")
    public ResponseEntity<BoardDto> saveBoard(@RequestBody BoardDto boardDto) {
        URI uri = linkTo(methodOn(BoardController.class).saveBoard(boardDto)).toUri();
        return ResponseEntity.created(uri).body(boardDto);
    }
}
