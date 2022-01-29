
package org.jskat.util.rule;

import org.jskat.data.SkatGameData;
import org.jskat.data.Trick;
import org.jskat.util.Card;
import org.jskat.util.GameType;
import org.jskat.util.Player;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Abstract implementation of skat rules
 */
public abstract class AbstractSkatRule implements SkatRule {

	private static Logger log = LoggerFactory.getLogger(AbstractSkatRule.class);

	/**
	 * Checks whether a game was overbid
	 * 
	 * @param gameData
	 *            Game data
	 * @return TRUE if the game was overbid
	 */
	@Override
	public boolean isOverbid(final SkatGameData gameData) {
		return gameData.getMaxBidValue() > getGameValueForWonGame(gameData);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public Player calculateTrickWinner(final GameType gameType,
			final Trick trick) {

		Player trickWinner = null;
		Card first = trick.getFirstCard();
		Card second = trick.getSecondCard();
		Card third = trick.getThirdCard();
		Player trickForeHand = trick.getForeHand();

		if (isCardBeatsCard(gameType, first, second)) {

			if (isCardBeatsCard(gameType, second, third)) {
				// trick winner is rear hand
				trickWinner = trickForeHand.getRightNeighbor();
			} else {
				// trick winner is middle hand
				trickWinner = trickForeHand.getLeftNeighbor();
			}
		} else {

			if (isCardBeatsCard(gameType, first, third)) {
				// trick winner is rear hand
				trickWinner = trickForeHand.getRightNeighbor();
			} else {
				// trick winner is fore hand
				trickWinner = trickForeHand;
			}
		}

		log.debug("Trick fore hand: " + trickForeHand); //$NON-NLS-1$
		log.debug("Trick winner: " + trickWinner); //$NON-NLS-1$

		return trickWinner;
	}
}
