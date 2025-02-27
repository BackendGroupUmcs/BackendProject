package group.project.models;

import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class Address {
    private String country;
    private String city;
    private String postalCode;
    private String streetAddress;
    private String houseNumber;
}