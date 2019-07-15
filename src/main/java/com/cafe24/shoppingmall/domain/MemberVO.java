package com.cafe24.shoppingmall.domain;

import java.util.Date;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

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
	@NotBlank(message = ValidationMessage.ID_BLANK)
	private String id;
	@NotBlank(message = ValidationMessage.MEMBER_NAME_BLANK)
	private String memberName;
	@Pattern(regexp = "^(?=.*\\d)(?=.*[~`!@#$%\\^&*()-])(?=.*[a-z])(?=.*[A-Z]).{9,12}$", message = ValidationMessage.PASSWORD_PATTERN)
	private String password;
	@NotBlank(message = ValidationMessage.EMAIL_BLANK)
    @Email(message = ValidationMessage.EAMAIL_PATTERN)
	private String email;
    @Pattern(regexp = "[0-9]{10,11}", message = ValidationMessage.TELEPHONE_PATTERN)
	private String telephone;
    private String gender;
	private Date regDate;
	private String zipcode;
	private String normalAddress;
	private String extendAddress;
	    
}
