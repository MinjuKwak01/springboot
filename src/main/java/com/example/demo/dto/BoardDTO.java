package com.example.demo.dto;

import lombok.*;

import java.time.LocalDateTime;

//DTO란?
//Data Transfer Object (데이터를 전송할 때 사용하는 객체)

@Getter //각각의 필드에 대해 메소드를 자동으로 만들어줌
@Setter
@ToString
@NoArgsConstructor //기본생성자
@AllArgsConstructor // 모든 필드를 매개변수로 하는 생성자
public class BoardDTO {
    private Long id;
    private String boardWriter;
    private String boardTitle;
    private String boardPass;
    private String boardContents;
    private int boardHits;
    private LocalDateTime boardCreatedTime;
    private LocalDateTime boardUpdateTime;

}
