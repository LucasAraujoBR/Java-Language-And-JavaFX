package entities;

public class Rooms {
	private String Name;
	private String Email;
	private int Room;
	public Rooms(String name, String email, int room) {
		Name = name;
		Email = email;
		Room = room;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public int getRoom() {
		return Room;
	}
	public void setRoom(int room) {
		Room = room;
	}
}
