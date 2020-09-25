package com.example.submission.model;

import com.example.submission.R;

import java.util.ArrayList;

public class HotelData {
    private static String[] hotelNames = {
            "Hotel Indonesia",
            "Hotel India",
            "Hotel China",
            "Hotel Jepang",
            "Hotel Korea",
            "Hotel New York",
            "Hotel Dubai",
            "Hotel Paris",
            "Hotel New Zealand",
            "Hotel Presiden Wilson, Geneva"
    };

    private static String[] hotelDetails = {
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    private static int[] hotelImages = {
            R.drawable.hotel_indonesia,
            R.drawable.hotel_indian,
            R.drawable.hotel_china,
            R.drawable.hotel_japan,
            R.drawable.hotel_korean,
            R.drawable.hotel_newyork,
            R.drawable.hotel_dubai,
            R.drawable.hotel_paris,
            R.drawable.hotel_new_zealand,
            R.drawable.hotel_president_wilson
    };

    public static ArrayList<Hotel> getListData() {
        ArrayList<Hotel> list =new ArrayList<>();
        for(int pos = 0; pos < hotelNames.length; pos++) {
            Hotel hotel = new Hotel();
            hotel.setName(hotelNames[pos]);
            hotel.setDetail(hotelDetails[pos]);
            hotel.setPhoto(hotelImages[pos]);
            list.add(hotel);
        }

        return list;
    }
}
