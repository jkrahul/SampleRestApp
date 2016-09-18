package com.rest.service;

import java.util.List;

import com.rest.model.Data;

public interface IRestService {
	public List<Data> getDataFromDB(List<String> dbs);

	public List<Data> getDummyData(List<String> dbs);
}
