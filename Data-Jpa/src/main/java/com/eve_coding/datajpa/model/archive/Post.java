package com.eve_coding.datajpa.model.archive;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Post {
    @Id
    private Long id;

    private String name;

    private LocalDateTime postDate;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String details;

    @JsonBackReference
    public User getUser(){
        return user;
    }
}
