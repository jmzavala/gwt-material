/*
 * #%L
 * GwtMaterial
 * %%
 * Copyright (C) 2015 - 2017 GwtMaterialDesign
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * #L%
 */
package gwt.material.design.client.ui;

//@formatter:off

import gwt.material.design.client.constants.CssName;

/**
 * Content container for Material Modal
 *
 * @author kevzlou7979
 * @author Ben Dol
 * @see <a href="http://gwtmaterialdesign.github.io/gwt-material-demo/#dialogs">Material Modal</a>
 * @see <a href="https://material.io/guidelines/components/dialogs.html#">Material Design Specification</a>
 *///@formatter:on
public class MaterialDialogContent extends MaterialPanel {

    public MaterialDialogContent() {
        super(CssName.MODAL_CONTENT);
    }
}
