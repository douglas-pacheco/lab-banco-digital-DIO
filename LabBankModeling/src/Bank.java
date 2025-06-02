import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
public class Bank {

	private String nome;
	private List<Account> accounts;

}
