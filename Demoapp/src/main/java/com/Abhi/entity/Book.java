package com.Abhi.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;


@Entity
    public class Book {

        @Id
      private Long id;
        private String title;
        //Getter and setters omitted for brevity


    }
