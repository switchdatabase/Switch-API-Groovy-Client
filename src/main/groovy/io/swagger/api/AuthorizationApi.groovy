package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.Error

import java.util.*;

@Mixin(ApiUtils)
class AuthorizationApi {
    String basePath = "http://tr02.switchapi.com/"
    String versionPath = "/api/v1"

    def tokenGet ( String apIKey, String signature, Long expire, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/Token"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (apIKey == null) {
            throw new RuntimeException("missing required params apIKey")
        }
        // verify required params are set
        if (signature == null) {
            throw new RuntimeException("missing required params signature")
        }
        // verify required params are set
        if (expire == null) {
            throw new RuntimeException("missing required params expire")
        }

        
        headerParams.put("apIKey", apIKey)
        headerParams.put("signature", signature)
        headerParams.put("expire", expire)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "GET", "",
                    String.class )
                    
    }
}
