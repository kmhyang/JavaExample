package com.yedam.member;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Data
@Setter
@Getter
@ToString
public class Member {
	private String id;
	private String pw;
	private String name;
}
