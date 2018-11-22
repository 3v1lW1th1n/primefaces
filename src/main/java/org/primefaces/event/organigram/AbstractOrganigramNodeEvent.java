/**
 * Copyright 2009-2018 PrimeTek.
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
package org.primefaces.event.organigram;

import javax.faces.component.UIComponent;
import javax.faces.component.behavior.Behavior;
import org.primefaces.event.AbstractAjaxBehaviorEvent;
import org.primefaces.model.OrganigramNode;

/**
 * Abstract base event for all {@link OrganigramNode} related events.
 */
public class AbstractOrganigramNodeEvent extends AbstractAjaxBehaviorEvent {

    private static final long serialVersionUID = 1L;

    private final OrganigramNode organigramNode;

    public AbstractOrganigramNodeEvent(UIComponent component, Behavior behavior, OrganigramNode organigramNode) {
        super(component, behavior);
        this.organigramNode = organigramNode;
    }

    public OrganigramNode getOrganigramNode() {
        return organigramNode;
    }
}
