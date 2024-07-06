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
public class SoukoDto implements Serializable {

	private static final long serialVersionUID = 1L;
	//倉庫ID
	private String id;

	//倉庫名
	private String name;

}
