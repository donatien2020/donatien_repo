package models;

import java.util.Date;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import play.data.validation.MaxSize;
import play.data.validation.Required;

import play.db.jpa.Model;

@Entity
public class Post extends Model{
	@Required
	public String title;

	@Required
	public Date postedAt;

	@Lob
	@Required
	@MaxSize(10000)
	public String content;

	@Required
	@ManyToOne
	public User author;

	@OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
	public List<Comment> comments;

	@ManyToMany(cascade = CascadeType.PERSIST)
	public Set<Tag> tags;
	/**
	 * Allow the creation  of a readable object from the UI
	 */
	public String toString() {
	    return content;
	}
}
