package Lenovo.pl.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.Getter;
import lombok.Setter;

//import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.Id;
//import javax.persistence.Lob;


@Entity
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    @Lob
    private String content;
}
