package com.example.spring_fifty_edition.tacos;


import java.util.List;
import java.util.Date;
import lombok.Data;

import javax.validation.constraints.NotNull; // 유효성 검사 규칙 선언
import javax.validation.constraints.Size;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;

@Data //    @Getter, @Setter, @RequiredArgsConstructor, @ToString, @EqualsAndHashCode  define
// @RequireArgsConstructor 는 final 이나 @NonNull 인 필드 값만 파라미터로 받는 생성자를 생성합니다.
// @EqualsAndHashCode 는 모든 필드를 기준으로 equals() 와 hashCode() 메소드를 생성합니다.
// @ToString 은 모든 필드를 대상으로 toString() 메소드를 생성합니다.0
// Runtime 시간에서 getter setter 생성

@Entity // JPA 객체 선언
public class Taco {

    @Id // DB 자동으로 생성해주는 ID값 부여
    @GeneratedValue(strategy = GenerationType.AUTO) // ID 자동생성  @ID
    private Long id;

    private Date createdAt;

    @NotNull
    @Size(min=5 ,message = "Name must be at least 5 long") //  @Size 는 문자열의 길이를 검증합니다.
    private  String name;

    @ManyToMany(targetEntity = Ingredient.class) // 하나의 TACO 여러가지 INGREDIENT 객체가 포함된다
    @Size(min=1 ,message = "You must choose at least 1 ingredient")
    private List<Ingredient> ingredients;


    @PrePersist // TACO 객체가 생성되기 전에 실행되는 메소드
    void createdAt() {
        this.createdAt = new Date();
    }
}
