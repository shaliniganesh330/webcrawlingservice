package com.stackroute.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Replies {
    //private member variable declaration//
    private String reply;
    private int likes;
    private long timestamp;
    private User user;
}

