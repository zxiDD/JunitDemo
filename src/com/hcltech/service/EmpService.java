package com.hcltech.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpService {

	public  record Emp(int empId, String name, double sal) {};
	
	public static Map<Integer, Emp> map = new HashMap<>();
	
	private EmpService(){
		
	}
	private static EmpService service = new EmpService();
	
	public static EmpService getServiceInstance() {
		return service;
	}
	
	static {
		map.put(1001, new Emp(1001, "rama", 23000));
		map.put(1002, new Emp(1002, "sam", 13000));
		map.put(1003, new Emp(1001, "david", 33000));
	}
	
	public Emp findByEmpId(int eid) {
		return map.get(eid);
	}
	
     public List<String> getEmpNames(){
    	 return map.values().stream().map(e->e.name).toList();
     }
}






