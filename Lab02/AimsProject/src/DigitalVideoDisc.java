
public class DigitalVideoDisc {
	private String title;
	private String category;
	private String director;
	private int length;
	private float cost;

	public DigitalVideoDisc(String title) {
		super();
		this.title = title;
	}

	public DigitalVideoDisc(String title, String category, float cost) {
		this.title = title;
		this.category = category;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.cost = cost;
	}

	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		this.title = title;
		this.category = category;
		this.director = director;
		this.length = length;
		this.cost = cost;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String titleSet) {
		title = titleSet;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String categorySet) {
		category = categorySet;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String directorSet) {
		director = directorSet;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int lengthSet) {
		length = lengthSet;
	}

	public float getCost() {
		return cost;
	}

	public void setCost(float costSet) {
		cost = costSet;
	}

}