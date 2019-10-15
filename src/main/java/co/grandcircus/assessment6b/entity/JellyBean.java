package co.grandcircus.assessment6b.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "jelly_bean")
public class JellyBean {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String style;
	private String rating;

	public JellyBean() {
		super();
		// TODO Auto-generated constructor stub
	}

	public JellyBean(String style, String rating) {
		super();
		this.style = style;
		this.rating = rating;
	}

	public JellyBean(Long id, String style, String rating) {
		super();
		this.id = id;
		this.style = style;
		this.rating = rating;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStyle() {
		return style;
	}

	public void setStyle(String style) {
		this.style = style;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "JellyBean [id=" + id + ", style=" + style + ", rating=" + rating + "]";
	}

}
