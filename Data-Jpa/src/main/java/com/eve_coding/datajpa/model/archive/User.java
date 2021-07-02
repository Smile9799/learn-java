package com.eve_coding.datajpa.model.archive;

import com.eve_coding.datajpa.model.archive.Location;
import com.eve_coding.datajpa.model.archive.Post;
import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class User {

    @Id
    private Long id;

    private String firstName;

    private String lastName;

    @ManyToOne
    @JoinColumn(name = "location_id")
    private Location location;

    private String email;

    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL)
    private List<Post> posts;

    @JsonBackReference
    public Location location(){
        return location;
    }

    @JsonManagedReference
    public List<Post> getPosts(){
        return posts;
    }
}
