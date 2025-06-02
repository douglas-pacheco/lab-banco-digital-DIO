import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class NaturalPerson extends Customer{

    private final NaturalPerson customer;
    private NaturalPerson custodian;

    public NaturalPerson(NaturalPerson customer, NaturalPerson custodian) {
        if (customer.equals(custodian)) throw new RuntimeException();
        this.custodian = custodian;
        this.customer = customer;
    }
}
