package org.example.Model;

import lombok.Data;

@Data
public class model <T extends Number>{

    public double sum(T itemsOne, T itemsTwo){
        var sum=itemsOne.doubleValue() + itemsTwo.doubleValue();
        return sum;
    }
    public double del (T itemsOne,T itemsTwo ){
        var del1=itemsOne.doubleValue() / itemsTwo.doubleValue();
        return  del1;
    }

    public double multiplication (T itemsOne, T itemsTwo) {

        var mul=itemsOne.doubleValue() * itemsTwo.doubleValue();

        return mul;
    }

    }