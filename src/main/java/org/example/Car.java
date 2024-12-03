package org.example;

import lombok.Builder;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
// @Data -- poczytaj

public class Car {

    private String brand;
    private String model;
    private String color;
    private boolean gearbox;

    @Builder
    public Car(@NonNull String brand, @NonNull String model, String color, boolean gearbox) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.gearbox = gearbox;
    }
}
