package com.dinosaurpark.event;

import com.dinosaurpark.model.Park;

public interface Event {
    void execute(Park park);
}