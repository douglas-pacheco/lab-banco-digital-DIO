import lombok.Getter;

import java.util.List;

@Getter
public class LegalPerson extends Customer{


    List<NaturalPerson> legalResponsibleList;

}
