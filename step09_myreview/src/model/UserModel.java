package model;

import java.util.ArrayList;
import java.util.HashMap;

import model.dto.User;

public class UserModel {
	
	private static HashMap<String, User> users = new HashMap<>();
	
	static {
		users.put("b", new User("b", "�ֱ�����", 2.8, 2));
		users.put("b", new User("b", "������", 3, 2.5));
		users.put("s", new User("s", "ĵ����", 4.2, 3));
		users.put("s", new User("s", "����ġ", 3.3, 3.8));
		users.put("g", new User("g", "�а���", 4.5, 4));
	}

	public static HashMap<String, User> UserAll(){
		return users;
	}
	
	public static User user(String grade) {   
		return users.get(grade);
	}
	
	public static User userOne(String grade) throws Exception {
		User u = users.get(grade);
		if(u == null) {
			throw new Exception("�ش� ����� �����ϴ�.");
		}else {
			return u;
		}
	}
	
	public static void create(User newName) throws IdInvalidateException {
		for(int i=0; i<users.size(); i++) {
			User u = new User();
			if(u.getName().equals(newName.getName())) {
				throw new IdInvalidateException("�̸��� �ߺ��Ǿ����ϴ�");
			}
		}
		users.put("grade", newName);
	}
	
	public static User read(String name){
		User u = new User();
		for(int i=0; i<users.size(); i++) {
			if(u.getName().equals(name)) {
				return u;
			}
		}
		return null;
	}
	
	public static boolean update(String grade, double newRecency){
		User u = new User();
		for(int i=0; i<users.size(); i++) {
			if(u.getGrade().equals(grade)) {
				u.setRecency(newRecency);
				return true;
			}
		}
		return false;
	}
	
	public static boolean delete(String name) {
		for(int index=0; index < users.size(); index++) {
			
			if(users.get(index).getName().equals(name)) {
				users.remove(index);
				return true;
			}
		}
		return false;	
	}
//	public static void main(String[] args) {
//		ArrayList<User> u = new ArrayList<User>();		
		
//		u.add(new User("b", "�ֱ�����", 2.8, 2));
//		u.add(new User("b", "������", 3, 2.5));
//		u.add(new User("s", "ĵ����", 4.2, 3));
//		u.add(new User("s", "����ġ", 3.3, 3.8));
//		u.add(new User("g", "�а���", 4.5, 4));
		
//		HashMap<String, ArrayList<User>> users = 
//				new HashMap<String, ArrayList<User>>();
//		users.put("�����", u);
//	}

}
