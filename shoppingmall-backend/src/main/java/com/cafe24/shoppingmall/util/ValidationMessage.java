package com.cafe24.shoppingmall.util;

public class ValidationMessage {
	/*
	 * 회원
	 * */
	public static final String ID_BLANK = "아이디를 작성해주세요.";
	public static final String MEMBER_NAME_BLANK = "이름을 작성해주세요.";
	public static final String EMAIL_BLANK = "이메일을 작성해주세요.";
	public static final String BIRTH_BLANK = "생일을 작성해주세요.";
	public static final String ZIPCODE_BLANK = "우편번호를 작성해주세요.";
	public static final String NORMAL_ADDRESS_BLANK = "기본주소를 작성해주세요.";
	public static final String EXTEND_ADDRESS_BLANK = "나머지주소를 작성해주세요.";

	public static final String EAMAIL_PATTERN = "메일의 양식을 지켜주세요.";
	public static final String TELEPHONE_PATTERN = "10~11자리의 숫자만 입력가능합니다.";
	public static final String TELEPHONE_REGEX = "[0-9]{10,11}";
	public static final String PASSWORD_PATTERN = "영문(대소문자 구분), 숫자, 특수문자 조합, 9~12자리로 입력해주세요.";
	public static final String PASSWORD_REGEX="^(?=.*\\d)(?=.*[~`!@#$%\\^&*()-])(?=.*[a-z])(?=.*[A-Z]).{9,12}$";
	
	public static final String ID_DUPLICATED = "이미 사용중인 아이디입니다.";
	public static final String ID_PW_WRONG = "회원 아이디 또는 비밀번호가 일치하지 않습니다."; 
	
	public static final String ID_FIELD = "id";
	public static final String ID_PW_FIELD = "id_pw";
	
	
	/*
	 * 아이템
	 * */
	public static final String STOCK_PATTERN = "0 또는 양수를 입력해주세요.";
}
