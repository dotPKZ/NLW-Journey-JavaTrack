package com.nlw.planner.trip;

import java.util.List;

public record TripRequestPayload(String destination, String trip_start, String trip_end, List<String> emails_to_invite, String owner_email, String owner_name) {
    
}
