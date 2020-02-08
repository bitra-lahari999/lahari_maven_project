package com.lahari.task.models.sweets;

import com.lahari.task.models.sweets.Sweet;

public class Laddu extends Sweet {
    private String Sweetname;

    public Laddu(int sugar, int sweet, int weight) {
        super(sugar, sweet, weight);
    }

    public void setName(String name) {
        Sweetname = name;
    }

    public String getSweetname() {
        return Sweetname;
    }
}