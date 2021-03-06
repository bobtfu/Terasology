/*
 * Copyright 2012 Esa-Petri Tirkkonen <esereja@yahoo.co.uk>
 *
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
 */
package org.terasology.hunger;

import org.terasology.entitySystem.Component;

/**
 * @author Esa-Petri Tirkkonen <esereja@yahoo.co.uk>
 */
public final class ConsumableComponent implements Component {
    // Configuration options
	public int filling=1;
	public int uses=1;
	
	//add effects here when bodycombonent is ready
    public ConsumableComponent() {
    }

}
