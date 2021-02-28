package com.example.demo.model;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@Builder
@ToString
public class Item {
    private Integer id;
    private ItemStatus status;
    private String title;
    private String description;
    private Condition condition;
    private List<byte[]> photos;
    private Integer estimatedPrice;
    private List<Group> groups;
}
