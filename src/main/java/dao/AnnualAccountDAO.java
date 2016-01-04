package dao;

import model.AnnualAccount;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by x085177 on 1/4/2016.
 */
public interface AnnualAccountDAO extends CrudRepository<AnnualAccount,Long> {
}
