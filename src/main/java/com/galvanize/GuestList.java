package com.galvanize;

import java.util.ArrayList;

class GuestList {
    private ArrayList<String> guests = new ArrayList<>();

    public void addGuest(String guest) {
        guests.add(guest);
    }

    public ArrayList<String> getGuests() {
        return new ArrayList<>(guests);
    }

}