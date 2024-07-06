package com.go.song.common.repository;

import java.util.List;

import com.go.song.common.model.CategoryDto;
import com.go.song.common.model.SizaiDto;

public interface BuyRequestDao {
	// 購入依頼登録
	public void requestRegist(SizaiDto sizaiDto);

	// カテゴリ取得
	public List<CategoryDto> getCategory();

	// ユーザ別購入依頼一覧リスト取得
	public List<SizaiDto> getUserRequsetList(String startDate, String endDate, String userId);

	// 購入依頼一件取得
	public SizaiDto getRequestById(int id);

	// 購入依頼変更
	public boolean modifyRequest(SizaiDto sizaiDto);

	// 購入依頼削除
	public boolean deleteById(int id);

}
