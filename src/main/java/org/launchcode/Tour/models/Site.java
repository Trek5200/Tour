package org.launchcode.Tour.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Objects;

@Entity
public class Site {

    @Id
    @GeneratedValue
    private int id;

    @NotBlank(message = "Owner name or nickname is required.")
    @Size(min=2, max=255, message="Owner name or nickname must be between 2 and 100 characters.")
    private String owner_name;

    @NotBlank
    @Size(min=2, max=255, message="Owner name or nickname must be between 2 and 100 characters.")
    private String phone;

    @NotBlank
    @Email
    private String email;

    @NotBlank(message = "A site phrase is required")
    @Size(min=2, max=255, message="Name must be between 2 and 50 characters")
    private String phrase;

    @Size(min=10, max=255)
    private String address;

    @NotBlank(message = "A description is necessary so people know what to expect")
    @Size (min=10, max=1000, message="Description must be between 10 and 1000 characters")
    private String description;

//    @ManyToMany
//    private List<Feature> features = new ArrayList<>();

    public Site(String owner_name, String phone, String email, String phrase, String address, String description) {
        this.owner_name = owner_name;
        this.phone = phone;
        this.email = email;
        this.phrase = phrase;
        this.address = address;
        this.description = description;
    }

    public Site() {}

    public int getId() {
        return id;
    }

    public String getOwner_name() {
        return owner_name;
    }

    public void setOwner_name(String owner_name) {
        this.owner_name = owner_name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhrase() {
        return phrase;
    }

    public void setPhrase(String phrase) {
        this.phrase = phrase;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return owner_name;
//                "Site{" +
//                "id=" + id +
//                ", owner_name='" + owner_name + '\'' +
//                ", phone='" + phone + '\'' +
//                ", email='" + email + '\'' +
//                ", phrase='" + phrase + '\'' +
//                ", address='" + address + '\'' +
//                ", description='" + description + '\'' +
//                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Site site = (Site) o;
        return id == site.id;
//                getId() == site.getId() &&
//                getOwner_name().equals(site.getOwner_name()) &&
//                getPhone().equals(site.getPhone()) &&
//                getEmail().equals(site.getEmail()) &&
//                getPhrase().equals(site.getPhrase()) &&
//                getAddress().equals(site.getAddress()) &&
//                getDescription().equals(site.getDescription());
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
//        return Objects.hash(getId(), getOwner_name(), getPhone(), getEmail(), getPhrase(), getAddress(), getDescription());
    }
}