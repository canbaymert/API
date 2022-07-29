package pojos;

import org.codehaus.jackson.annotate.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)     // Do assertion just for given variables. Ignore other variables.
public class BookingDatesPojo {

    //1) Private variables are created for all variables.
    private String checkin;
    private String checkout;

    //2) Constructors are created with and without parameters


    public BookingDatesPojo(String checkin, String checkout) {
        this.checkin = checkin;
        this.checkout = checkout;
    }

    public BookingDatesPojo() {
    }

    //3) Getter and Setter methods are created.


    public String getCheckin() {
        return checkin;
    }

    public void setCheckin(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public void setCheckout(String checkout) {
        this.checkout = checkout;
    }

    //4) toString() method is created


    @Override
    public String toString() {
        return "BookingDatesPojo{" +
                "checkin='" + checkin + '\'' +
                ", checkout='" + checkout + '\'' +
                '}';
    }
}
