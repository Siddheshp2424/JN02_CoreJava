package it.tnsif.daytwo;

public class MyTnsDetail {
	private String uid;
    private	String name;
	private String city;
	private long contact;
	private static String college;
  private static String ssname;
	private static String ttname;
	
	static {
		System.out.println("Static Block");
		college="PVG NAshik";
		ssname="Divya mam";
		ttname="Alpana mama";
	}

	public MyTnsDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyTnsDetail(String uid, String name, String city, long contact) {
		super();
		this.uid = uid;
		this.name = name;
		this.city = city;
		this.contact = contact;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}
	
	public static String getCollege() {
		return college;
	}

	public static void setCollege(String college) {
		MyTnsDetail.college = college;
	}
	

	public static String getSsname() {
		return ssname;
	}

	public static void setSsname(String ssname) {
		MyTnsDetail.ssname = ssname;
	}

	public static String getTtname() {
		return ttname;
	}

	public static void setTtname(String ttname) {
		MyTnsDetail.ttname = ttname;
	}

	@Override
	public String toString() {
		return "MyTnsDetail [uid=" + uid + ", name=" + name + ", city=" + city + ", contact=" + contact + ",College="+college+",Soft skill trainer="+ssname+",Technical Trainer="+ttname+",]";
	}
	
	

}
