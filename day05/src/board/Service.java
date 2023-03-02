package board;

public class Service {
	
	DAO dao;
	
	public Service() {
		dao = new DAO(); //서비스라는 객체가 생성이 되는 생성자 안에서 DAO라는 객체도 함께 생성이 됨 
	}
	
	public void register(String str) {
		// Security or Log - 등록한 글이 논란의 소지가 있느냐 아니냐.. 이런 거를 DAO에게 넣어달라고 하기 전에 검토할 수 있음 
		dao.insert(str);
		
	}
	public void remove(int num) {
		dao.delete(num);
	}
	public void modify(int num, String str) {
		dao.update(num, str);
	}
	public String get(int num) {
		return dao.select(num);
	}
}
