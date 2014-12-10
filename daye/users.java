package ssogong_daye;

public class users {
private String username;
private String password;
private String[][] accounts = {{"test", "1234"},{"daye", "dy1119"}};

public users(String user, String pass){
    username = user;
    password = pass;
}

public boolean auth(){
	//for(int i=0 ; i<2 ; i++)
	if((username.equals(accounts[0][0])) && (password.equals(accounts[0][1])))
        return true;
	else if((username.equals(accounts[1][0])) && (password.equals(accounts[1][1])))
        return true;
	else
        return false;
}

}

