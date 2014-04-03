package com.co2mpare.interfaces;

import com.co2mpare.logic.RoutePTE;
import com.google.android.gms.maps.model.LatLng;

public interface PTEinterface {
	
	RoutePTE[] getRoute(String src, String dest);
	RoutePTE[] getRoute(LatLng src, LatLng dest );

}
