package sfgdi.services;

import sfgdi.model.Owner;
public interface OwnerService extends CrudService<Owner, Long>{

    Owner findByLastName(String lastName);

}
