package com.example.esamsar.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Accommodation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String title;
    private String description;
    private int surface;
    private int rooms ;
    private int lounges;
    private int bathroom;
    private int bail;
    private int trustee;
    private double price ;
    @OneToOne
    private ExtraInfo extraInfo;
}
