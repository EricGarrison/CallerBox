package DanceBox;

import java.util.List;

public class Dance {
	private List<Part> danceParts;
	private List<String> notes;
	
	public List<Part> getDanceParts() {
		return danceParts;
	}
	
	public void setDanceParts(List<Part> danceParts) {
		this.danceParts = danceParts;
	}

	public List<String> getNotes() {
		return notes;
	}

	public void setNotes(List<String> notes) {
		this.notes = notes;
	}
	
	public void addNote(String note) {
		notes.add(note);
	}
}
