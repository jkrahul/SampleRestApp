package com.rest.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.rest.dao.IDataDao;
import com.rest.model.Data;
import com.rest.service.IRestService;

public class RestServiceImpl implements IRestService {
	private Map<Integer, IDataDao> dataDaos;

	public Map<Integer, IDataDao> getDataDaos() {
		return dataDaos;
	}

	public void setDataDaos(Map<Integer, IDataDao> dataDaos) {
		this.dataDaos = dataDaos;
	}

	@Override
	public List<Data> getDataFromDB(List<String> dbs) {
		if (dbs == null || dbs.isEmpty())
			return null;
		List<Data> models = new ArrayList<Data>();
		for (String db : dbs) {
			try {
				int dbId = Integer.valueOf(db);
				if (dataDaos.containsKey(dbId)) {
					models.add(dataDaos.get(dbId).getData());
				} else
					models.add(null);
			} catch (NumberFormatException e) {
				models.add(null);
			}
		}
		return models;
	}

	@Override
	public List<Data> getDummyData(List<String> dbs) {
		List<Data> models = new ArrayList<>();
		models.add(new Data("User 1", "Plan A"));
		models.add(new Data("User 2", "Plan B"));
		return models;
	}
}
