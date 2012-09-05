package models;

import javax.persistence.Entity;

import play.data.validation.Required;
import play.db.jpa.Model;
@Entity
public class Tag extends Model implements Comparable<Tag> {
	  @Required
	    public String name;

	@Override
	public int compareTo(Tag o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
