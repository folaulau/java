package com.lovemesomecoding.heap;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@ToString
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User implements Serializable, Comparable<User> {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;
    private String            name;
    private Integer           rating;

    @Override
    public int compareTo(User other) {
        // TODO Auto-generated method stub
        return this.rating.compareTo(other.getRating());
    }
}
