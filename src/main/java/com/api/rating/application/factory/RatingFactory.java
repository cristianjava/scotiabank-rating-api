/**
 * Grupo Aval Acciones y Valores S.A. CONFIDENTIAL
 *
 * <p>Copyright (c) 2018 . All Rights Reserved.
 *
 * <p>NOTICE: This file is subject to the terms and conditions defined in file 'LICENSE', which is
 * part of this source code package.
 */
package com.api.rating.application.factory;

import com.api.rating.application.data.RatingData;
import com.api.rating.domain.model.rating.RatingModel;
import org.springframework.stereotype.Service;

@Service
public class RatingFactory {

  public RatingModel create(final RatingData data) {
    return new RatingModel(data.getRatingId());
  }
}
