package com.go.song.common.repository;


import java.util.List;

import com.go.song.common.model.SizaiDto;


public interface BuyApprovalDao {

	//部門別購入依頼一覧
	public List<SizaiDto> getDeptRequsetList(String startDate, String endDate,
			String deptId);

	//購入依頼一件取得
	public SizaiDto getRequestById(int id);

	//承認実行
	public boolean approval(int id);

	//却下実行
	public boolean regect(int id);
}
