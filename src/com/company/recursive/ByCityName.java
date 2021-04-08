package com.company.recursive;

import com.company.IPAddress;

import java.util.Comparator;

public class ByCityName implements Comparator<IPAddress> {

    @Override
    public int compare(IPAddress o, IPAddress o1) {
        return o.cityName.compareTo(o1.cityName);
    }

}
