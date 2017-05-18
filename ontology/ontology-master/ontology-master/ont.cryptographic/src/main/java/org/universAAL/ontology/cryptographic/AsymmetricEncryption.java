/*******************************************************************************
 * Copyright 2016 Universidad Politécnica de Madrid UPM
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.universAAL.ontology.cryptographic;

import java.util.ArrayList;
import java.util.List;


/**
 * Ontological representation of AsymmetricEncryption in the cryptographic ontology. 
 * Methods included in this class are the mandatory ones for representing an
 * ontological concept in Java classes for the universAAL platform. In addition
 * getters and setters for properties are included.
 * 
 * @author 
 * @author Generated by the OntologyUML2Java transformation of AAL Studio
 */
public abstract class AsymmetricEncryption extends Encryption {
  public static final String MY_URI = CryptographicOntology.NAMESPACE
    + "AsymmetricEncryption";
  public static final String PROP_KEY_RING = CryptographicOntology.NAMESPACE
    + "keyRing";


  public AsymmetricEncryption () {
    super();
  }
  
  public AsymmetricEncryption (String uri) {
    super(uri);
  }

  public String getClassURI() {
    return MY_URI;
  }
  
  public int getPropSerializationType(String propURI) {
    if (PROP_KEY_RING.equals(propURI))
      return PROP_SERIALIZATION_FULL;
    return super.getPropSerializationType(propURI);
  } 

  public boolean isWellFormed() {
	return super.isWellFormed() 
      && hasProperty(PROP_KEY_RING);
  }

  public KeyRing[] getKeyRing() {
    Object propList = getProperty(PROP_KEY_RING);
    if (propList instanceof List)
      return (KeyRing[]) ((List) propList).toArray(new KeyRing[0]);
    else if (propList != null)
      return new KeyRing[] {(KeyRing)propList}; // Handle special case of a single item not contained in a list
    return new KeyRing[0];
  }

  /**{@inheritDoc} */
  public EncryptionKey[] getKey() {
	  return getKeyRing();
  }

  public void addKeyRing(KeyRing newValue) {
    Object propList = getProperty(PROP_KEY_RING);
    List newList;
    if (propList instanceof List)
      newList = (List)propList;
    else {
      newList = new ArrayList();
      if (propList != null)
        newList.add(propList); // Handle special case of a single previous item not contained in a list
    }
    newList.add(newValue);
    changeProperty(PROP_KEY_RING, newList);
  }
  

  /**{@inheritDoc} */
  public void addKey(EncryptionKey newValue) {
	  addKeyRing((KeyRing) newValue);
  }

public void setKeyRing(KeyRing[] propertyValue) {
    List propList = new ArrayList(propertyValue.length);
    for (int i = 0; i < propertyValue.length; i++) {
      propList.add(propertyValue[i]);
    }
    changeProperty(PROP_KEY_RING, propList);
  }

/**{@inheritDoc} */
  public void setKey(EncryptionKey[] propertyValue) {
	  setKeyRing((KeyRing[]) propertyValue);
  }

}
