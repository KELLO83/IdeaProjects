package com.example.spring_fifty_edition.tacos;


import java.util.List;
import java.util.Date;
import lombok.Data;

import javax.validation.constraints.NotNull; // 유효성 검사 규칙 선언
import javax.validation.constraints.Size;

@Data //    @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode  define
// @RequireArgsConstructor 는 final 이나 @NonNull 인 필드 값만 파라미터로 받는 생성자를 생성합니다.
// @EqualsAndHashCode 는 모든 필드를 기준으로 equals() 와 hashCode() 메소드를 생성합니다.
// @ToString 은 모든 필드를 대상으로 toString() 메소드를 생성합니다.0
// Runtime 시간에서 getter setter 생성
public class Taco {

    private Long id;

    private Date createdAt;

    @NotNull
    @Size(min=5 ,message = "Name must be at least 5 long") //  @Size 는 문자열의 길이를 검증합니다.
    private  String name;

    @Size(min=1 ,message = "You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;
}
