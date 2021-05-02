package coursePlatform;

public class UserManager {
	public void add(User user) {
		System.out.println(user.firstName + " added");
	}
	public void update(User user) {
		System.out.println(user.firstName + " updated");
	}
	public void delete(User user) {
		System.out.println(user.firstName + " deleted");
	}
	public User[] getAll() {
		return new User[5];
	}
	public User[] get(int userId) {
		return new User[1];
	}
}
