package service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import dao.MyDao;

@Service
public class MyService {
	@Autowired
	private MyDao md;

	public MyDao getMd() {
		return md;
	}

	public void setMd(MyDao md) {
		this.md = md;
	}
	public void serv()
	{
		System.out.println("Service mehtod called");
		md.dao();
	}
	

}
