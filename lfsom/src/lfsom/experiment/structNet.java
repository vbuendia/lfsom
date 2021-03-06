/*
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.livingforsom.com/license.html
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package lfsom.experiment;

/**
 * @author vicente
 * @version $Id: $
 * 
 *          A global net, containing information about its location in disk, net
 *          from which it belongs (father) and cells from its father from which
 *          it has been trained. Useful for hierarchical nets.
 */
public class structNet {

	String netName;

	String netFolder;

	String netFatherFile;

	String netFatherNumber;

	String netFatherFolder;

	String cellsFrom;

	int indice;

	// Se le anyaden:
	// Nro. neuronas
	// Err quant medio kaski
	int numCells;
	String mQ;

	public String getNetFolder() {
		return netFolder;
	}

	public String getNetName() {
		return netName;
	}

	public int getIndice() {
		return indice;
	}

	public int getNumPadre() {
		return Integer.valueOf(netFatherNumber);
	}

	int[] cellsIntFrom() {

		String[] strbl = cellsFrom.split(",");

		int[] c = new int[strbl.length];
		for (int k = 0; k < strbl.length; k++) {
			c[k] = Integer.valueOf(strbl[k]);
		}
		return c;
	}

}
