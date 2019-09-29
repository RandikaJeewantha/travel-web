package Com.Randika.TravelerWeb.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.hibernate.validator.constraints.Length;

import Com.Randika.TravelerWeb.Annotation.Validation.IsSelect;

@Entity
@Table(name="places")
public class Place {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="place_id")
	private int id;
	
	@NotNull(message="Is Required !")
	@Size(min=1, message="Is Required !")
	@Length(max=250, message="keyword should be less than 250 or equal !")
	@Length(min=5, message="keyword should be more than 5 or equal characters !")
	@Column(name="name")
	private String name;
	
	@NotNull(message="Is Required !")
	@Size(min=1, message="Is Required !")
	@Length(max=5000, message="keyword should be less than 5000 or equal !")
	@Length(min=5, message="keyword should be more than 200 or equal characters !")
	@Column(name="description")
	private String description;
	
	@Column(name="link")
	private String link;
	
	@NotNull(message="Is Required !")
	@Size(min=1, message="Is Required !")
	@Length(max=5000, message="keyword should be less than 5000 or equal !")
	@Length(min=5, message="keyword should be more than 100 or equal characters !")
	@Column(name="routes")
	private String routes;
	
	@Column(name="safety")
	private String safety;
	
	@IsSelect(value = "Select Category")
	@Column(name="category")
	private String category;
	
	@Column(name="file")
	private String imagePath;

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getLink() {
		return link;
	}
	
	public void setLink(String link) {
		this.link = link;
	}
	
	public String getRoutes() {
		return routes;
	}
	
	public void setRoutes(String routes) {
		this.routes = routes;
	}
	
	public String getSafety() {
		return safety;
	}
	
	public void setSafety(String safety) {
		this.safety = safety;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {
		this.category = category;
	}
	
}
