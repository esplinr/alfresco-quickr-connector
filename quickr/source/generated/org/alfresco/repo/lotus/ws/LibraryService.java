/*
 * Copyright 2010-2012 Alfresco Software Limited.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * This file is part of an unsupported extension to Alfresco.
 *
 * [BRIEF DESCRIPTION OF FILE CONTENTS]
 */
package org.alfresco.repo.lotus.ws;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

import org.alfresco.service.cmr.model.FileNotFoundException;

/**
 * This class was generated by Apache CXF 2.2.2
 * Tue Feb 16 19:13:38 EET 2010
 * Generated source version: 2.2.2
 * 
 */
 
@WebService(targetNamespace = "http://webservices.clb.content.ibm.com", name = "LibraryService")
@XmlSeeAlso({ObjectFactory.class})
public interface LibraryService {

    @WebResult(name = "getBusinessComponentsReturn", targetNamespace = "http://webservices.clb.content.ibm.com")
    @RequestWrapper(localName = "getBusinessComponents", targetNamespace = "http://webservices.clb.content.ibm.com", className = "org.alfresco.repo.lotus.ws.GetBusinessComponents")
    @ResponseWrapper(localName = "getBusinessComponentsResponse", targetNamespace = "http://webservices.clb.content.ibm.com", className = "org.alfresco.repo.lotus.ws.GetBusinessComponentsResponse")
    @WebMethod
    public org.alfresco.repo.lotus.ws.ClbLibrariesResponse getBusinessComponents(
        @WebParam(name = "libraryId", targetNamespace = "http://webservices.clb.content.ibm.com")
        java.lang.String libraryId,
        @WebParam(name = "libraryPath", targetNamespace = "http://webservices.clb.content.ibm.com")
        java.lang.String libraryPath,
        @WebParam(name = "categoryTypes", targetNamespace = "http://webservices.clb.content.ibm.com")
        java.util.List<org.alfresco.repo.lotus.ws.ClbCategoryType> categoryTypes
    ) throws LoginException_Exception, ServiceException_Exception, FileNotFoundException;

    @WebResult(name = "getApplicationRootReturn", targetNamespace = "http://webservices.clb.content.ibm.com")
    @RequestWrapper(localName = "getApplicationRoot", targetNamespace = "http://webservices.clb.content.ibm.com", className = "org.alfresco.repo.lotus.ws.GetApplicationRoot")
    @ResponseWrapper(localName = "getApplicationRootResponse", targetNamespace = "http://webservices.clb.content.ibm.com", className = "org.alfresco.repo.lotus.ws.GetApplicationRootResponse")
    @WebMethod
    public org.alfresco.repo.lotus.ws.ClbLibraryResponse getApplicationRoot() throws LoginException_Exception, ServiceException_Exception;

    @WebResult(name = "getBusinessComponentsByPageReturn", targetNamespace = "http://webservices.clb.content.ibm.com")
    @RequestWrapper(localName = "getBusinessComponentsByPage", targetNamespace = "http://webservices.clb.content.ibm.com", className = "org.alfresco.repo.lotus.ws.GetBusinessComponentsByPage")
    @ResponseWrapper(localName = "getBusinessComponentsByPageResponse", targetNamespace = "http://webservices.clb.content.ibm.com", className = "org.alfresco.repo.lotus.ws.GetBusinessComponentsByPageResponse")
    @WebMethod
    public org.alfresco.repo.lotus.ws.ClbLibrariesByPageResponse getBusinessComponentsByPage(
        @WebParam(name = "libraryId", targetNamespace = "http://webservices.clb.content.ibm.com")
        java.lang.String libraryId,
        @WebParam(name = "libraryPath", targetNamespace = "http://webservices.clb.content.ibm.com")
        java.lang.String libraryPath,
        @WebParam(name = "categoryTypes", targetNamespace = "http://webservices.clb.content.ibm.com")
        java.util.List<org.alfresco.repo.lotus.ws.ClbCategoryType> categoryTypes,
        @WebParam(name = "pageParams", targetNamespace = "http://webservices.clb.content.ibm.com")
        org.alfresco.repo.lotus.ws.PageParams pageParams
    ) throws LoginException_Exception, ServiceException_Exception, FileNotFoundException;

    @WebResult(name = "getBusinessComponentReturn", targetNamespace = "http://webservices.clb.content.ibm.com")
    @RequestWrapper(localName = "getBusinessComponent", targetNamespace = "http://webservices.clb.content.ibm.com", className = "org.alfresco.repo.lotus.ws.GetBusinessComponent")
    @ResponseWrapper(localName = "getBusinessComponentResponse", targetNamespace = "http://webservices.clb.content.ibm.com", className = "org.alfresco.repo.lotus.ws.GetBusinessComponentResponse")
    @WebMethod
    public org.alfresco.repo.lotus.ws.ClbLibraryResponse getBusinessComponent(
        @WebParam(name = "id", targetNamespace = "http://webservices.clb.content.ibm.com")
        java.lang.String id,
        @WebParam(name = "path", targetNamespace = "http://webservices.clb.content.ibm.com")
        java.lang.String path
    ) throws LoginException_Exception, ServiceException_Exception, FileNotFoundException;
}
