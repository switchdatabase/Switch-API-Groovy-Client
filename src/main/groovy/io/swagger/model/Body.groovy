package io.swagger.model;

import groovy.transform.Canonical
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ArrayList;
import io.swagger.model.ListOrder;
import io.swagger.model.WhereItem;
import java.util.List;
@Canonical
class Body {

  /* List name. */
  String list = null

  /* Item count. */
  Integer count = null

  /* Page number. */
  Integer page = null

  /* Optional enumerator. You can assign the mode of implementation of where criterions by using AND and OR types under whereType parameter. */
  String whereType = null

    List<WhereItem> where = new ArrayList<WhereItem>()

    ListOrder order = null
  

}

