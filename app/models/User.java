package models;

import play.*;
import play.data.validation.Email;
import play.data.validation.Required;
import play.db.jpa.*;

import javax.persistence.*;
import java.util.*;

@Entity
public class User extends Model {

	@Email
	@Required
	public String email;
	public String address;

	@Required
	public String password;

	public String fullname;
	public boolean isAdmin;

	public User(String email, String password, String fullname) {
		this.email = email;
		this.password = password;
		this.fullname = fullname;
	}

	/**
	 * Authenticate a User.
	 */
	public static User connect(String email, String password) {
		return User.find("byEmailAndPassword", email, password).first();
	}

	public String toString() {
		return email;
	}

}