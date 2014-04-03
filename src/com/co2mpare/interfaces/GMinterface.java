package com.co2mpare.interfaces;

import com.co2mpare.logic.RouteGM;
import com.google.android.gms.maps.model.LatLng;

public interface GMinterface {

	RouteGM getRoute(String src, String dest);
	RouteGM getRoute(LatLng src, LatLng dest );
}
