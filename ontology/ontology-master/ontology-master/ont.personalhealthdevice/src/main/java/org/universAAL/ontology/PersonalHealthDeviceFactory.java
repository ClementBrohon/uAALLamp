/*
     Copyright 2010-2014 AIT Austrian Institute of Technology GmbH
	 http://www.ait.ac.at
     
     See the NOTICE file distributed with this work for additional
     information regarding copyright ownership

     Licensed under the Apache License, Version 2.0 (the "License");
     you may not use this file except in compliance with the License.
     You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

     Unless required by applicable law or agreed to in writing, software
     distributed under the License is distributed on an "AS IS" BASIS,
     WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     See the License for the specific language governing permissions and
     limitations under the License.
*/

package org.universAAL.ontology;

import org.universAAL.middleware.rdf.Resource;
import org.universAAL.middleware.rdf.ResourceFactory;
import org.universAAL.ontology.personalhealthdevice.BloodOxygenSatSensor;
import org.universAAL.ontology.personalhealthdevice.BloodPressureSensor;
import org.universAAL.ontology.personalhealthdevice.HeartRateSensor;
import org.universAAL.ontology.personalhealthdevice.WeighingScale;

/**
 * Factory for PersonalHealthDevice Ontology.
 * 
 * @author Thomas Fuxreiter (foex@gmx.at)
 */
public class PersonalHealthDeviceFactory implements ResourceFactory {

    public Resource createInstance(String classURI, String instanceURI,
	    int factoryIndex) {
	/*
	 * General comment for this implementation: we assume that this method
	 * is only called by the static method Resource.getResource() => we
	 * assume that the case of registered named resources is already handled
	 * there
	 */
	switch (factoryIndex) {
	case 0:
	    return new BloodOxygenSatSensor(instanceURI);
	case 1:
	    return new BloodPressureSensor(instanceURI);
	case 2:
	    return new HeartRateSensor(instanceURI);
	case 3:
	    return new WeighingScale(instanceURI);
	}

	return null;
    }
}
