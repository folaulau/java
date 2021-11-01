package com.lovemesomecoding.linkedlist;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Customer implements Serializable, Comparable<Customer> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String firstName;
    private String lastName;
    private String email;
    
    @Override
    public int compareTo(Customer other) {
        // TODO Auto-generated method stub
        return this.email.compareTo(other.getEmail());
    }
}
