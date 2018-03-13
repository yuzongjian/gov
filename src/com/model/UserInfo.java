package com.model;

public class UserInfo {

	private int id;
	private String name;
	private String keyword1;
	private String keyword2;
	private String keyword3;
	private String keyword4;
	private String keyword5;
	private String keyword6;
	private String keyword7;
	private String keyword8;
	private String keyword9;
	private String keyword10;
	private String keyword11;
	private String keyword12;
	private String keyword13;
	private String keyword14;
	private String keyword15;
	private String keyword16;
	private String keyword17;
	private String keyword18;
	private String keyword19;
	private String keyword20;

	public UserInfo(int id, String name, String keyword1, String keyword2, String keyword3, String keyword4,
			String keyword5, String keyword6, String keyword7, String keyword8, String keyword9, String keyword10,
			String keyword11, String keyword12, String keyword13, String keyword14, String keyword15, String keyword16,
			String keyword17, String keyword18, String keyword19, String keyword20) {
		super();
		this.id = id;
		this.name = name;
		this.keyword1 = keyword1;
		this.keyword2 = keyword2;
		this.keyword3 = keyword3;
		this.keyword4 = keyword4;
		this.keyword5 = keyword5;
		this.keyword6 = keyword6;
		this.keyword7 = keyword7;
		this.keyword8 = keyword8;
		this.keyword9 = keyword9;
		this.keyword10 = keyword10;
		this.keyword11 = keyword11;
		this.keyword12 = keyword12;
		this.keyword13 = keyword13;
		this.keyword14 = keyword14;
		this.keyword15 = keyword15;
		this.keyword16 = keyword16;
		this.keyword17 = keyword17;
		this.keyword18 = keyword18;
		this.keyword19 = keyword19;
		this.keyword20 = keyword20;
	}
	public UserInfo( String name, String keyword1, String keyword2, String keyword3, String keyword4,
			String keyword5, String keyword6, String keyword7, String keyword8, String keyword9, String keyword10,
			String keyword11, String keyword12, String keyword13, String keyword14, String keyword15, String keyword16,
			String keyword17, String keyword18, String keyword19, String keyword20) {
		super();

		this.name = name;
		this.keyword1 = keyword1;
		this.keyword2 = keyword2;
		this.keyword3 = keyword3;
		this.keyword4 = keyword4;
		this.keyword5 = keyword5;
		this.keyword6 = keyword6;
		this.keyword7 = keyword7;
		this.keyword8 = keyword8;
		this.keyword9 = keyword9;
		this.keyword10 = keyword10;
		this.keyword11 = keyword11;
		this.keyword12 = keyword12;
		this.keyword13 = keyword13;
		this.keyword14 = keyword14;
		this.keyword15 = keyword15;
		this.keyword16 = keyword16;
		this.keyword17 = keyword17;
		this.keyword18 = keyword18;
		this.keyword19 = keyword19;
		this.keyword20 = keyword20;
	}
	public UserInfo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserInfo(int id, String name) {
		// TODO Auto-generated constructor stub
		this.id= id;
		this.name= name;
	}
	@Override
	public String toString() {
		String msg = "id=" + id 
				+ " ,name = " + name 
				+ ",keyword1 = " + keyword1 
				+ ",keyword2 = " + keyword2 
				+ ",keyword3 = " + keyword3;
		System.out.println(msg);
		return msg;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKeyword1() {
		return keyword1;
	}

	public void setKeyword1(String keyword1) {
		this.keyword1 = keyword1;
	}

	public String getKeyword2() {
		return keyword2;
	}

	public void setKeyword2(String keyword2) {
		this.keyword2 = keyword2;
	}

	public String getKeyword3() {
		return keyword3;
	}

	public void setKeyword3(String keyword3) {
		this.keyword3 = keyword3;
	}

	public String getKeyword4() {
		return keyword4;
	}

	public void setKeyword4(String keyword4) {
		this.keyword4 = keyword4;
	}

	public String getKeyword5() {
		return keyword5;
	}

	public void setKeyword5(String keyword5) {
		this.keyword5 = keyword5;
	}

	public String getKeyword6() {
		return keyword6;
	}

	public void setKeyword6(String keyword6) {
		this.keyword6 = keyword6;
	}

	public String getKeyword7() {
		return keyword7;
	}

	public void setKeyword7(String keyword7) {
		this.keyword7 = keyword7;
	}

	public String getKeyword8() {
		return keyword8;
	}

	public void setKeyword8(String keyword8) {
		this.keyword8 = keyword8;
	}

	public String getKeyword9() {
		return keyword9;
	}

	public void setKeyword9(String keyword9) {
		this.keyword9 = keyword9;
	}

	public String getKeyword10() {
		return keyword10;
	}

	public void setKeyword10(String keyword10) {
		this.keyword10 = keyword10;
	}

	public String getKeyword11() {
		return keyword11;
	}

	public void setKeyword11(String keyword11) {
		this.keyword11 = keyword11;
	}

	public String getKeyword12() {
		return keyword12;
	}

	public void setKeyword12(String keyword12) {
		this.keyword12 = keyword12;
	}

	public String getKeyword13() {
		return keyword13;
	}

	public void setKeyword13(String keyword13) {
		this.keyword13 = keyword13;
	}

	public String getKeyword14() {
		return keyword14;
	}

	public void setKeyword14(String keyword14) {
		this.keyword14 = keyword14;
	}

	public String getKeyword15() {
		return keyword15;
	}

	public void setKeyword15(String keyword15) {
		this.keyword15 = keyword15;
	}

	public String getKeyword16() {
		return keyword16;
	}

	public void setKeyword16(String keyword16) {
		this.keyword16 = keyword16;
	}

	public String getKeyword17() {
		return keyword17;
	}

	public void setKeyword17(String keyword17) {
		this.keyword17 = keyword17;
	}

	public String getKeyword18() {
		return keyword18;
	}

	public void setKeyword18(String keyword18) {
		this.keyword18 = keyword18;
	}

	public String getKeyword19() {
		return keyword19;
	}

	public void setKeyword19(String keyword19) {
		this.keyword19 = keyword19;
	}

	public String getKeyword20() {
		return keyword20;
	}

	public void setKeyword20(String keyword20) {
		this.keyword20 = keyword20;
	}

	
}
