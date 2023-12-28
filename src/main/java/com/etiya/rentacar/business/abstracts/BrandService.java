package com.etiya.rentacar.business.abstracts;

import com.etiya.rentacar.business.dtos.requests.CreateBrandRequest;
import com.etiya.rentacar.business.dtos.responses.CreatedBrandResponse;
import com.etiya.rentacar.entities.concretes.Brand;

public interface BrandService {
    CreatedBrandResponse add(CreateBrandRequest createBrandRequest);
}
