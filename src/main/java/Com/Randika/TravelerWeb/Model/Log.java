package Com.Randika.TravelerWeb.Model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Log {
	
	@NotNull(message="Is Required !")
	@Size(min=1, message="Is Required !")
	private String email;
	
	@NotNull(message="Is Required !")
	@Size(min=1, message="Is Required !")
	private String password;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	
}