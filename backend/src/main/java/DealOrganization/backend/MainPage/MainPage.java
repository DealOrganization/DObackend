package DealOrganization.backend.MainPage;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;

@Setter
@Getter
public class MainPage {
    private String name;
    private String title;
    private int price;
}
