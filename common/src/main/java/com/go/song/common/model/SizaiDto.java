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
public class SizaiDto implements Serializable {

	private static final long serialVersionUID = 1L;
	//資材ID
	private int id;
	//資材名
	private String name;
	//数量
	private int num;
	//倉庫ID
	private String souko_id;
	//倉庫名
	private String souko_name;
	//カテゴリID
	private String category_id;
	//カテゴリ名
	private String category_name;
	//購入依頼者ID
	private String request_user_id;
	//購入依頼者名
	private String request_user_name;
	//購入依頼部門
	private String request_dept_id;
	//購入者部門名
	private String request_dept_name;
	//状態区分
	private String status;
	//状態名
	private String status_name;
	//依頼日
	private String request_date;
	//発注日
	private String order_date;
	//納品日
	private String delivery_date;
	//入庫日
	private String instore_date;
	//出庫日
	private String outstore_date;
	//備考
	private String note;

}
