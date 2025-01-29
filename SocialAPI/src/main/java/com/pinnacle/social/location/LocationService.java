package com.pinnacle.social.location;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.pinnacle.social.post.Post;

@Service
public class LocationService {
	

		
		Location l1 = new Location("l1", "Nagpur");
		Location l2 = new Location("l2","Mumbai");
		Location l3 = new Location("l3", "Chandrapur");
		
		//private List<Location> locations =  Arrays.asList(l1,l2,l3);
		
		private List<Location> locations = new ArrayList<>(Arrays.asList(l1, l2, l3));
		
		public List<Location> getAllLocation() 
		   {
				return locations;
		   } 
		
		public Location getLocation(String id) {
		    Location location = locations.stream()
			.filter(t -> id.equals(t.getId()))
			.findFirst()
			.orElse(null);
				
		    return location;
		}
		
		public void addLocation(Location location) {
		     locations.add(location);
		}
		
		
		public void deleteLocation(String id) {
		    locations.removeIf(t -> t.getId().equals(id));
		}
		
		public void updateLocation(String id, Location location) {

			   for(int i = 0; i < locations.size(); i++) {

				Location l = locations.get(i);

				if (l.getId().equals(id)) {
				    locations.set(i, location);
				}
			   }		
			}



}
