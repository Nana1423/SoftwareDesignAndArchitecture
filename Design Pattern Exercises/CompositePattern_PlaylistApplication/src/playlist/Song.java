package playlist;

public class Song implements IComponent{

	private String songName;
	private String artist;
	private float speed;
	
	public Song(String songName, String artist ) {
		this.songName = songName;
		this.artist = artist; 
	}
	
	public void play() {
		System.out.println("Playing: " + songName);
	}
	
	public void setPlaybackSpeed(float number) {
		System.out.println("Song speed set to " + Float.toString(number));
	}
	
	public String getName() {
		return songName;
	}
	
	public String getArtist() {
		return artist;
	}
}
