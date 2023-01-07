package playlist;

import java.util.ArrayList;

public class Playlist implements IComponent{

	private String playlistName;
	private ArrayList<IComponent> playlist = new ArrayList();
	
	public Playlist(String playlistName) {
		this.playlistName = playlistName;
	}
	
	public void play() {
		System.out.println("Playing the song ");
	}
	
	public void setPlaybackSpeed(float number) {
		System.out.println("Playback Speed set to " + Float.toString(number));
	}
	
	public String getName() {
		return playlistName;
	}
	
	public void add(IComponent component) {
		playlist.add(component);
	}
	
	public void remove(IComponent component) {
		playlist.remove(component);
	}
	
}
