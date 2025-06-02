import lombok.Getter;

@Getter
public class MerchantAccount {

    private final LegalPerson customer;

    public MerchantAccount(LegalPerson customer) {
        this.customer = customer;
    }
}
