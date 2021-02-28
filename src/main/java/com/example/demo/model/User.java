package com.example.demo.model;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class User {
    private Integer id;
    private Integer rating;
    private String firstName;
    private String lastName;
    private String address;
    private List<Item> items;
}
