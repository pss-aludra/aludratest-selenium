/*
 * Copyright (C) 2010-2014 Hamburg Sud and the contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.aludratest.service.gui.web.selenium.selenium2.condition;

import org.aludratest.service.gui.web.selenium.selenium2.LocatorSupport;
import org.aludratest.service.locator.element.GUIElementLocator;
import org.openqa.selenium.WebElement;

public class ElementNotVisibleCondition extends NegativeWebElementCondition {

    public ElementNotVisibleCondition(GUIElementLocator locator, LocatorSupport locatorSupport) {
        super(locator, locatorSupport);
    }

    @Override
    protected Boolean applyOnElement(WebElement element) {
        if (element.isDisplayed()) {
            message = "The element is visible.";
            return null;
        }

        return Boolean.TRUE;
    }

}
