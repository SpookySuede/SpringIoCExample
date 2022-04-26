import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("Address")
public class Address {

    private String city;
    private String state;
    private String country;
    private String zipCode;

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getZipCode() {
        return zipCode;
    }

    @Autowired
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    @Autowired
    public void setCountry(String country) {
        this.country = country;
    }
    @Autowired
    public void setState(String state) {
        this.state = state;
    }
    @Autowired
    public void setCity(String city) {
        this.city = city;
    }

}
