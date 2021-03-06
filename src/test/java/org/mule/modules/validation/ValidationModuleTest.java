/**
 * Mule Validation Module
 *
 * Copyright (c) MuleSoft, Inc.  All rights reserved.  http://www.mulesoft.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */

/**
 * This file was automatically generated by the Mule Development Kit
 */
package org.mule.modules.validation;

import org.mule.api.MuleEvent;
import org.mule.construct.Flow;
import org.mule.tck.FunctionalTestCase;
import org.mule.tck.AbstractMuleTestCase;

import org.junit.Test;

public class ValidationModuleTest extends FunctionalTestCase
{
    @Override
    protected String getConfigResources()
    {
        return "mule-config.xml";
    }

    @Test
    public void testIsDomain() throws Exception
    {
        assertTrue(runFlow("testIsDomain") instanceof InvalidException);
    }

    @Test
    public void testIsValidTld() throws Exception
    {
        assertTrue(runFlow("testIsValidTld") instanceof InvalidException);
    }

    @Test
    public void testIsValidCountryTld() throws Exception
    {
        assertTrue(runFlow("testIsValidCountryTld") instanceof InvalidException);
    }

    @Test
    public void testIsValidCreditCard() throws Exception
    {
        assertTrue(runFlow("testIsValidCreditCard") instanceof InvalidException);
    }

    @Test
    public void testIsValidEmail() throws Exception
    {
        assertTrue(runFlow("testIsValidEmail") instanceof InvalidException);
    }

    @Test
    public void testIsValidIpAddress() throws Exception
    {
        assertTrue(runFlow("testIsValidIpAddress") instanceof InvalidException);
    }

    @Test
    public void testIsValidPercentage() throws Exception
    {
        assertTrue(runFlow("testIsValidPercentage") instanceof InvalidException);
    }

    @Test
    public void testIsValidTime() throws Exception
    {
        assertTrue(runFlow("testIsValidTime") instanceof InvalidException);
    }

    @Test
    public void testIsValidDate() throws Exception
    {
        assertTrue(runFlow("testIsValidDate") instanceof InvalidException);
    }

    @Test
    public void testIsValidUsingRegex() throws Exception
    {
        assertTrue(runFlow("testIsValidUsingRegex") instanceof InvalidException);
    }

    @Test
    public void testIsValidLength() throws Exception
    {
        assertTrue(runFlow("testIsValidLength") instanceof InvalidException);
    }


    /**
    * Run the flow specified by name and assert equality on the expected output
    *
    * @param flowName The name of the flow to run
    */
    protected Throwable runFlow(String flowName) throws Exception
    {
        Flow flow = lookupFlowConstruct(flowName);
        MuleEvent event = AbstractMuleTestCase.getTestEvent(null);

        try
        {
            MuleEvent responseEvent = flow.process(event);
        } catch( Exception e ) {
            return e.getCause();
        }
        
        return null;
    }

    /**
     * Retrieve a flow by name from the registry
     *
     * @param name Name of the flow to retrieve
     */
    protected Flow lookupFlowConstruct(String name)
    {
        return (Flow) AbstractMuleTestCase.muleContext.getRegistry().lookupFlowConstruct(name);
    }
}
