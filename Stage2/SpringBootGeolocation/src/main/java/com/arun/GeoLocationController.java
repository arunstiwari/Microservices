package com.arun;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GeoLocationController {
	
	@Autowired
	GeoLocationService service;
	
	@RequestMapping(path="/geolocation", method=RequestMethod.POST)
	@ResponseBody
	public ResponseEntity<GeoLocation> createLocation(@RequestBody GeoLocation location) {
		GeoLocation geoLocation = service.create(location);
		return new ResponseEntity<>(geoLocation,HttpStatus.CREATED);
	}

	@RequestMapping(path="/geolocation", method=RequestMethod.GET)
	public ResponseEntity<List<GeoLocation>> findAll(){
		List<GeoLocation> locations = service.findAll();
		return new ResponseEntity<List<GeoLocation>>(locations,HttpStatus.OK);
	}
	
}
