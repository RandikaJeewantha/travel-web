package Com.Randika.TravelerWeb.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

@Entity
@Table(name="places")
public class Search {
	
	@NotNull(message="Is Required !")
	@Size(min=1, message="Is Required !")
	@Length(max=100, message="keyword should be less than 100 or equal !")
	@Length(min=3, message="keyword should be more than 3 or equal characters !")
	@Column(name="name")
	private String searchKey;

	public String getSearchKey() {
		return searchKey;
	}

	public void setSearchKey(String searchKey) {
		this.searchKey = searchKey;
	}
}
