package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class ListOrder {

  /* Order types: ASC, DESC */
  String type = null

  /* Column name. */
  String by = null
  

}

