package com.merryapps.gadgeteer.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.merryapps.gadgeteer.model.Series;
import com.merryapps.gadgeteer.services.SeriesService;

/**
 * Handles data using a mongoDB database
 * @author xpadro
 *
 */
@Service
public class SeriesServiceImpl implements SeriesService {
	
	@Override
	public Series[] getAllSeries() {
		List<Series> seriesList = new ArrayList<Series>();
		seriesList.add(new Series(1, "Series1", "USA", "Horror"));
		seriesList.add(new Series(2, "Series2", "USA", "Thriller"));
		seriesList.add(new Series(3, "Series3", "USA", "Comedy"));
		return seriesList.toArray(new Series[0]);
	}

	@Override
	public Series getSeries(long id) {
		List<Series> seriesList = new ArrayList<Series>();
		seriesList.add(new Series(1, "Series1", "USA", "Horror"));
		seriesList.add(new Series(2, "Series2", "USA", "Thriller"));
		seriesList.add(new Series(3, "Series3", "USA", "Comedy"));
		
		return seriesList.get((int)id);
	}

	@Override
	public void insertSeries(Series series) {
		
	}

	
	@Override
	public void deleteSeries(long id) {
		
	}
}
