package com.cafe24.shoppingmall.domain;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.Pattern;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import com.cafe24.shoppingmall.util.ValidationMessage;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class MemberVO {
	
	public MemberVO(String id, String memberName, String password, String email, String telephone, String gender, String zipcode,
			String normalAddress, String extendAddress) {
		this.id = id;
		this.memberName = memberName;
		this.password = password;
		this.email = email;
		this.telephone = telephone;
		this.gender = gender;
		this.zipcode = zipcode;
		this.normalAddress = normalAddress;
		this.extendAddress = extendAddress;
	}
	private Long memberNo;
	@NotBlank(message = ValidationMessage.ID_BLANK)
	private String id;
	@NotBlank(message = ValidationMessage.MEMBER_NAME_BLANK)
	private String memberName;
	@Pattern(regexp = ValidationMessage.PASSWORD_REGEX, message = ValidationMessage.PASSWORD_PATTERN)
	private String password;
	@NotBlank(message = ValidationMessage.EMAIL_BLANK)
    @Email(message = ValidationMessage.EAMAIL_PATTERN)
	private String email;
    @Pattern(regexp = ValidationMessage.TELEPHONE_REGEX, message = ValidationMessage.TELEPHONE_PATTERN)
    private String telephone;
    private String sessionId;
    private String gender;
	private Date regDate;
	private String zipcode;
	private String normalAddress;
	private String extendAddress;
	private List<BasketVO> basketList;
	
	public boolean isMember() {
		return sessionId == null ? true : false;
	}
}
