package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
@Canonical
class WhereItem {

  /* You can explain the controls of more than one state with where. The controls of states: equal, notEqual, like, greaterThan, lessThan */
  String type = null

  /* Column name */
  String column = null

  /* Column value */
  String value = null
  

}

