package com.cafe24.shoppingmall.domain;

import java.util.Date;

import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import com.cafe24.shoppingmall.util.ValidationMessage;

import lombok.Data;

@Data
public class MemberVO {
	
	@NotBlank(message = ValidationMessage.ID_BLANK)
	private String id;
	
	@NotBlank(message = ValidationMessage.MEMBER_NAME_BLANK)
	private String memberName;
	
	@NotBlank(message = ValidationMessage.PASSWORD_BLANK)
	private String password;
	@NotBlank(message = ValidationMessage.EMAIL_BLANK)
    @Email(message = ValidationMessage.EAMAIL_PATTERN)
	private String email;
	@NotBlank(message = ValidationMessage.TELEPHONE_BLANK)
    @Pattern(regexp = "[0-9]{10,11}", message = ValidationMessage.TELEPHONE_PATTERN)
	private String telephone;
	private Date regDate;
	private String zipcode;
	private String normalAddress;
	private String extendAddress;
	

	    
}
