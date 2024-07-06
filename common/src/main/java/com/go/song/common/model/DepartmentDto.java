package com.go.song.common.model;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DepartmentDto implements Serializable {

	private static final long serialVersionUID = 1L;
	//部署ID
	private String id;

	//部署名
	private String name;

}
