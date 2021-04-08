package com.company;

import java.util.Comparator;

public class IPAddress implements Comparable<IPAddress> {

    private long ipFrom;
    private long ipTo;
    public String countryCode;
    public String countryName;
    public String regionName;
    public String cityName;

    public IPAddress(long ipForm, long ipTo, String countryCode, String countryName, String regionName, String cityName) {
        this.ipFrom = ipForm;
        this.ipTo = ipTo;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.regionName = regionName;
        this.cityName = cityName;
    }

    @Override
    public String toString() {
        return "\"" + ipFrom
                + "\"" + "," + "\"" + ipTo + "\"" + "," + "\"" + countryCode + "\"" + "," + "\"" + countryName + "\"" + "," + "\"" + regionName + "\"" + "," + "\"" + cityName + "\"" ;

    }

    @Override
    public int compareTo(IPAddress that) {
        if (this.ipFrom > that.ipFrom) {
            return 1;
        } else if (this.ipFrom < that.ipFrom) {
            return -1;
        } else {
            return 0;
        }
    }
}
