/**
 * Copyright (C) 2017 Jan Schäfer (jansch@users.sourceforge.net)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jskat.ai.nn.input;

import java.util.Arrays;

import org.jskat.util.Card;

public abstract class AbstractInputStrategy implements InputStrategy {

	public final static double ON = 1.0d;
	public final static double OFF = -1.0d;

	protected final double[] getEmptyInputs() {
		double[] result = new double[getNeuronCount()];
		Arrays.fill(result, OFF);
		return result;
	}

	protected final static int getNetworkInputIndex(final Card card) {
		return card.getSuit().getSuitOrder() * 8 + card.getNullOrder();
	}
}
