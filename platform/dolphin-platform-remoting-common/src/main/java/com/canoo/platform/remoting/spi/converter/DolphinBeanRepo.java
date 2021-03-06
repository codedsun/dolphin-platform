package com.canoo.platform.remoting.spi.converter;

/**
 * Interface that provides access to the internal Dolphin Platform bean repository. This is used in some converters to access needed data for the conversion.
 *
 * @author Hendrik Ebbers
 */
public interface DolphinBeanRepo {

    /**
     * Returns the internal Dolphin Platform representation of a bean.
     * @param sourceId the id of the bean
     * @return the bean
     */
    Object getBean(String sourceId);

    /**
     * Returns the internal unique id of a Dolphin Platform bean.
     * @param bean the bean
     * @return the id
     */
    String getDolphinId(Object bean);

}
