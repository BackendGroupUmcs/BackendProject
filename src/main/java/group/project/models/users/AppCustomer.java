package group.project.models.users;

import group.project.models.Address;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name = "customers")
public class AppCustomer extends AppUser {
    private String firstName;
    private String lastName;
    private Address address;
    @Column(name = "phone_number", length = 20)
    private String phoneNumber;
}
