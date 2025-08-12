public class CreateUserResponse{
	public void setId(int id) {
		this.id = id;
	}

	public void setToken(String token) {
		this.token = token;
	}

	private int id;
	private String token;

	public int getId(){
		return id;
	}

	public String getToken(){
		return token;
	}
}
