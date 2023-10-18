package org.study.run.exam06;
//롬복을 사용해서 해보기
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter


public class Board {
    private String subject;
    private String content;
    private String writer;

    public Board(String subject, String content, String writer) {
        this.subject = subject;
        this.content = content;
        this.writer = writer;
    }
}
