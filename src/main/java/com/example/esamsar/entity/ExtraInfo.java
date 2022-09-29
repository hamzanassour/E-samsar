package com.example.esamsar.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
public class ExtraInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private boolean elevator;
    private boolean wifi;
    private boolean airConditioning;
    private boolean heating;
    private boolean concierge;
    private boolean parking;
    private boolean balcony;
}
