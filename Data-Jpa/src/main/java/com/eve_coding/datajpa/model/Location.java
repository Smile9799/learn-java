package com.eve_coding.datajpa.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "locations")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Location {

    @Id
    private Long id;

    private String name;

    @OneToMany(mappedBy = "location",cascade = CascadeType.REMOVE)
    private List<User> users;

    @JsonManagedReference
    public List<User> getUsers(){
        return users;
    }
}
