public class LunchCard {
	private Student student;
	private LunchItem item;

	public LunchCard(Student s, LunchItem i) {
		student = s;
		item = i;
	}

	public Student getStudent() {
		return student;
	}

	public LunchItem getItem() {
		return item;
	}

	public String toString() {
		return student.toString() + " has a " + item.toString();
	}

	public boolean compare(LunchCard card) {
		return item.getName().equals(card.item.getName()) && item.getPrice().equals(card.item.getPrice());
	}
}
