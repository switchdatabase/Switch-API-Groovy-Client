package io.swagger.api;

import groovyx.net.http.*
import static groovyx.net.http.ContentType.*
import static groovyx.net.http.Method.*
import io.swagger.api.ApiUtils

import io.swagger.model.AddResponse
import io.swagger.model.Body
import io.swagger.model.Error
import io.swagger.model.SetResponse

import java.util.*;

@Mixin(ApiUtils)
class DBOperationsApi {
    String basePath = "http://tr02.switchapi.com/"
    String versionPath = "/api/v1"

    def addPost ( String apIKey, String accessToken, String list, String body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/Add"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (apIKey == null) {
            throw new RuntimeException("missing required params apIKey")
        }
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (list == null) {
            throw new RuntimeException("missing required params list")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        
        headerParams.put("apIKey", apIKey)
        headerParams.put("accessToken", accessToken)
        headerParams.put("list", list)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    AddResponse.class )
                    
    }
    def listPost ( String apIKey, String accessToken, String list, Body body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/List"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (apIKey == null) {
            throw new RuntimeException("missing required params apIKey")
        }
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (list == null) {
            throw new RuntimeException("missing required params list")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        
        headerParams.put("apIKey", apIKey)
        headerParams.put("accessToken", accessToken)
        headerParams.put("list", list)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    null )
                    
    }
    def setDelete ( String apIKey, String accessToken, String list, String listItemId, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/Set"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (apIKey == null) {
            throw new RuntimeException("missing required params apIKey")
        }
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (list == null) {
            throw new RuntimeException("missing required params list")
        }
        // verify required params are set
        if (listItemId == null) {
            throw new RuntimeException("missing required params listItemId")
        }

        
        headerParams.put("apIKey", apIKey)
        headerParams.put("accessToken", accessToken)
        headerParams.put("list", list)
        headerParams.put("listItemId", listItemId)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "DELETE", "",
                    SetResponse.class )
                    
    }
    def setPost ( String apIKey, String accessToken, String list, String listItemId, String body, Closure onSuccess, Closure onFailure)  {
        // create path and map variables
        String resourcePath = "/Set"

        // query params
        def queryParams = [:]
        def headerParams = [:]
    
        // verify required params are set
        if (apIKey == null) {
            throw new RuntimeException("missing required params apIKey")
        }
        // verify required params are set
        if (accessToken == null) {
            throw new RuntimeException("missing required params accessToken")
        }
        // verify required params are set
        if (list == null) {
            throw new RuntimeException("missing required params list")
        }
        // verify required params are set
        if (listItemId == null) {
            throw new RuntimeException("missing required params listItemId")
        }
        // verify required params are set
        if (body == null) {
            throw new RuntimeException("missing required params body")
        }

        
        headerParams.put("apIKey", apIKey)
        headerParams.put("accessToken", accessToken)
        headerParams.put("list", list)
        headerParams.put("listItemId", listItemId)

        invokeApi(onSuccess, onFailure, basePath, versionPath, resourcePath, queryParams, headerParams,
                    "POST", "",
                    SetResponse.class )
                    
    }
}
