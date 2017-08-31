package com.arun;

import java.util.List;

public interface GeoLocationService {

  public GeoLocation create(GeoLocation geolocation);
  public List<GeoLocation> findAll();
}
