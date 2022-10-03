package Esercizio_m1w2d1;

public class Student {
	
	private String name;
	private int[] votes;
	private int media;
	
	public Student(String name, int[] votes) {
		setName(name);
		setVotes(votes);
	}

	public int calculateMedia() {
		
		int s = 0;
		for(int i = 0 ; i < votes.length; i++) {
			s += votes[i];
		}
		return s/votes.length;
	}

	public int[] getVotes() {
		return votes;

	}

	public void setVotes(int[] votes) {
		this.votes = votes;
		this.media = calculateMedia();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMedia() {
		return media;
	}

}
