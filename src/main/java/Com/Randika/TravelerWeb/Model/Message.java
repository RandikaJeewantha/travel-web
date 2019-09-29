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

@Entity
@Table(name="messages")
public class Message {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="message_id")
	private int id;
	
	@Column(name="sender_name")
	private String name;
	
	@NotNull(message="Is Required !")
	@Size(min=1, message="Is Required !")
	@Column(name="sender_email")
	private String email;
	
	@NotNull(message="Is Required !")
	@Size(min=1, message="Is Required !")
	@Length(max=5000, message="keyword should be less than 5000 or equal !")
	@Length(min=20, message="keyword should be more than 20 or equal characters !")
	@Column(name="sender_message")
	private String message;	
	
	@NotNull(message="Is Required !")
	@Size(min=1, message="Is Required !")
	@Length(max=100, message="keyword should be less than 100 or equal !")
	@Length(min=5, message="keyword should be more than 5 or equal characters !")
	@Column(name="sender_subject")
	private String subject;	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
}
