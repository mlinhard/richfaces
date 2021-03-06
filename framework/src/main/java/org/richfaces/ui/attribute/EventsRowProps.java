/*
 * JBoss, Home of Professional Open Source
 * Copyright 2013, Red Hat, Inc. and individual contributors
 * by the @authors tag. See the copyright.txt in the distribution for a
 * full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.richfaces.ui.attribute;

import org.richfaces.cdk.annotations.Attribute;
import org.richfaces.cdk.annotations.Description;
import org.richfaces.cdk.annotations.EventName;

/**
 * Interface defining the methods for events-row-props.xml
 *
 * @author <a href="http://community.jboss.org/people/bleathem">Brian Leathem</a>
 */
public interface EventsRowProps {
    /**
     * Javascript code executed when a pointer button is clicked over table row.
     */
    @Attribute(events = @EventName(value = "rowclick"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is clicked over table row.",
                    displayName = "Button Click Script"))
    String getOnrowclick();

    /**
     * Javascript code executed when a pointer button is double clicked over table row.
     */
    @Attribute(events = @EventName(value = "rowdblclick"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is double clicked over table row.",
                    displayName = "Double Click Script"))
    String getOnrowdblclick();

    /**
     * Javascript code executed when a pointer button is pressed down over table row.
     */
    @Attribute(events = @EventName(value = "rowmousedown"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is pressed down over table row.",
                    displayName = "Mouse Down Script"))
    String getOnrowmousedown();

    /**
     * Javascript code executed when a pointer button is released over table row.
     */
    @Attribute(events = @EventName(value = "rowmouseup"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is released over table row.",
                    displayName = "Mouse Up Script"))
    String getOnrowmouseup();

    /**
     * Javascript code executed when a pointer button is moved onto table row.
     */
    @Attribute(events = @EventName(value = "rowmouseover"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is moved onto table row.",
                    displayName = "Mouse Over Script"))
    String getOnrowmouseover();

    /**
     * Javascript code executed when a pointer button is moved within table row.
     */
    @Attribute(events = @EventName(value = "rowmousemove"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is moved within table row.",
                    displayName = "Mouse Move Script"))
    String getOnrowmousemove();

    /**
     * Javascript code executed when a pointer button is moved away from table row.
     */
    @Attribute(events = @EventName(value = "rowmouseout"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a pointer button is moved away from table row.",
                    displayName = "Mouse Out Script"))
    String getOnrowmouseout();

    /**
     * Javascript code executed when a key is pressed and released over table row.
     */
    @Attribute(events = @EventName(value = "rowkeypress"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a key is pressed and released over table row.",
                    displayName = "Key Press Script"))
    String getOnrowkeypress();

    /**
     * Javascript code executed when a key is pressed down over table row.
     */
    @Attribute(events = @EventName(value = "rowkeydown"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a key is pressed down over table row.",
                    displayName = "Key Down Script"))
    String getOnrowkeydown();

    /**
     * Javascript code executed when a key is released over table row.
     */
    @Attribute(events = @EventName(value = "rowkeyup"),
            passThrough = true,
            description = @Description(
                    value = "Javascript code executed when a key is released over table row.",
                    displayName = "Key Up Script"))
    String getOnrowkeyup();
}