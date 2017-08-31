package com.arun.microservices.geolocation;

import java.util.List;

public interface GeoLocationService {

  public GeoLocation create(GeoLocation geolocation);
  public List<GeoLocation> findAll();
}
