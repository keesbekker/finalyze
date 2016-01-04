package dao;

import model.Company;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by x085177 on 1/4/2016.
 */
public interface CompanyDAO extends CrudRepository<Company,Long> {
}
