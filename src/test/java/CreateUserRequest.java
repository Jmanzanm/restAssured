public class CreateUserRequest{
	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	private String password;
	private String email;

	public String getPassword(){
		return password;
	}

	public String getEmail(){
		return email;
	}
}
