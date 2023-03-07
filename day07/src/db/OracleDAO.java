package db;

public class OracleDAO implements DAO{  // 기능을 구현한다고 할 때는 implement 

	@Override
	public void insert(Object obj) {
		System.out.println(obj);
		System.out.println("Inserted Oracle Database");
	}

	@Override
	public void delete(Object obj) {
		System.out.println(obj);
		System.out.println("Deleted Oracle Database");
	}

	@Override
	public void update(Object obj) {
		System.out.println(obj);
		System.out.println("Updated Oracle Database");
		
	}  
}
