package models;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

import play.data.validation.MaxSize;
import play.data.validation.Required;
import play.db.jpa.Model;
@Entity
public class Comment  extends Model {
	
	@Required
    public String author;
    
    @Required
    public Date postedAt;
     
    @Lob
    @Required
    @MaxSize(10000)
    public String content;
    
    @ManyToOne
    @Required
    public Post post; 
    
    /**
     * Allow the creation  of a readable object from the UI
     */
    	public String toString() {
    		return content;
    	}
}
