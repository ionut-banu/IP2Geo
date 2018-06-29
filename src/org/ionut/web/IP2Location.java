package org.ionut.web;

import net.webservicex.IP2Geo;
import net.webservicex.IP2GeoSoap;
import net.webservicex.IPInformation;

public class IP2Location {
    public static void main(String[] args){
        if(args.length != 1){
            System.out.println("You need to pass in one IP address");
        }else{
           String ipAddress = args[0];

           IP2Geo ipService = new IP2Geo();
           IP2GeoSoap ip2GeoSoap = ipService.getIP2GeoSoap();
           IPInformation ipInformation = ip2GeoSoap.resolveIP(ipAddress,"0");

           System.out.println("Country: "+ipInformation.getCountry());
           System.out.println("City: "+ipInformation.getCity());
           System.out.println("TimeZone: "+ipInformation.getTimeZone());
           System.out.println("Latitude: "+ipInformation.getLatitude());
           System.out.println("Longitude: "+ipInformation.getLongitude());
        }
    }
}
