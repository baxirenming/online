package com.go.song.common.repository;

import java.util.List;

import com.go.song.common.model.SizaiDto;
import com.go.song.common.model.SoukoDto;

public interface StoreDao {
	// 資材情報一件取得
	public SizaiDto getSizaiById(int id);

	// 倉庫情報取得
	public List<SoukoDto> getSoukoList();

	// 入庫実行
	public boolean InStoreAct(SizaiDto s);

	// 出庫実行
	public boolean OutStoreAct(SizaiDto s);
}
