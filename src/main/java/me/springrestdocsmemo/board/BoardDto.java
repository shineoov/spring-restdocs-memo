package me.springrestdocsmemo.board;


import lombok.Builder;
import lombok.Data;

@Data
public class BoardDto {
    private String title;
    private String writer;

    @Builder
    public BoardDto(String title, String writer) {
        this.title = title;
        this.writer = writer;
    }
}
