package com.reating.servises;

import java.util.List;

import com.reating.Entities.Reating;

public interface Servises {
public Reating addReating(Reating rea);
public List<Reating> allReatings() ;
public List<Reating> ReatingUserId(String id);
public List<Reating> ReatingHotelId(String id);
public Reating ReatingById(String id);
}
