package com.go.song.common.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
 * ユーザ情報DTO
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto implements Serializable {

	private static final long serialVersionUID = 1L;
	//ユーザID
	private String id;
	//パスワード
	private String password;
	//ユーザ名
	private String name;
	//部署ID
	private String depid;
	//部署名
	private String depname;
	//連絡先
	private String tel;
	//権限区分
	private String role_class;
}
