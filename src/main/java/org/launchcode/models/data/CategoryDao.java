package org.launchcode.models.data;

import org.springframework.stereotype.Repository;
import org.launchcode.models.Category;
import org.springframework.data.repository.CrudRepository;
import javax.transaction.Transactional;

@Repository
@Transactional
public interface CategoryDao extends CrudRepository<Category, Integer> {


}


