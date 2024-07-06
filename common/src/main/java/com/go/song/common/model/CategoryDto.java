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
public class CategoryDto implements Serializable {

	private static final long serialVersionUID = 1L;

	// カテゴリID
	private String id;

	// カテゴリ名
	private String name;
}
