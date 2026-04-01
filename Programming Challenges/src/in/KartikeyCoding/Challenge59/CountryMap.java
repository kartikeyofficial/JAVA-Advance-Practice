package in.KartikeyCoding.Challenge59;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    static void main(String[] args) {
        Map<String,String> countryMap = new HashMap<>();
        countryMap.put("Bharat","New Delhi");
        countryMap.put("China","Beijing");
        countryMap.put("Pakistan","Islamabad");
        countryMap.put("Nepal","Kathmandu");
        countryMap.put("SriLanka","Columbia");

        Scanner x =  new Scanner(System.in);
        System.out.println("Please Enter the Country Name: ");
        String country = x.next();
        if (countryMap.containsKey(country)){
            System.out.println("Capital of "+country+" is: "+countryMap.get(country));
        }
        else {
            System.out.println("Sorry We don't know the capital!");
        }
    }
}
