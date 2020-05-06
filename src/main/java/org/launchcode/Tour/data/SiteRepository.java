package org.launchcode.Tour.data;

import org.launchcode.Tour.models.Site;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SiteRepository extends CrudRepository <Site, Integer> {
}
