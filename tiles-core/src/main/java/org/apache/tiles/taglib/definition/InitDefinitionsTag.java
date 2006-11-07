/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 *
 */


package org.apache.tiles.taglib.definition;

import org.apache.tiles.taglib.ComponentConstants;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.TagSupport;

/**
 * Init definitions impl.
 */
public class InitDefinitionsTag extends TagSupport implements ComponentConstants {


    /**
     * Default constructor.
     */
    public InitDefinitionsTag() {
        super();
    }

    /**
     * Release all allocated resources.
     */
    public void release() {

        super.release();
    }

    /**
     * Set file.
     */
    public void setFile(String name) {
    }

    /**
     * Set classname.
     */
    public void setClassname(String classname) {
    }

    /**
     * TODO Add a MutableContainer so that this can be done?
     * Do start tag.
     */
    public int doStartTag() throws JspException {
//        DefinitionsFactory factory = TilesUtil.getDefinitionsFactory();
//        if (factory != null) {
//            return SKIP_BODY;
//        }
//
//        DefinitionsFactoryConfig factoryConfig = new DefinitionsFactoryConfig();
//        factoryConfig.setFactoryClassname(classname);
//        factoryConfig.setDefinitionConfigFiles(filename);
//
//        try {
//            factory = TilesUtil.createDefinitionsFactory(factoryConfig);
//        } catch (DefinitionsFactoryException ex) {
//            ex.printStackTrace();
//            throw new JspException(ex);
//        }

        return SKIP_BODY;
    }

    /**
     * Do end tag.
     */
    public int doEndTag() throws JspException {
        return EVAL_PAGE;
}

}